package com.betmonkey.analytics.engine;

import com.betmonkey.analytics.Analytics;
import com.betmonkey.analytics.CalculationException;
import com.betmonkey.enums.CalculationType;
import com.tictactec.ta.lib.Core;
import com.tictactec.ta.lib.MInteger;
import com.tictactec.ta.lib.RetCode;

/**
 * Created by scott on 04/08/16.
 */

public class TaLibAnalyticsEngine implements AnalyticsEngine

{



    public void setDataPointsBeforeCalc(int dataPointsBeforeCalc) {
        this.dataPointsBeforeCalc = dataPointsBeforeCalc;
    }

    private  int dataPointsBeforeCalc=4;

    public Analytics calculate(double[] prices) throws CalculationException {
        Analytics analytics = new Analytics();
        double sme[] = getSimpleMovingAverage(prices, dataPointsBeforeCalc);
        analytics.addAnalytics(CalculationType.MOVING_AVERAGE,sme);
        return analytics;
    }



    private double[] getSimpleMovingAverage(double[] prices, int periodsAverage) throws CalculationException
    {

        double[] movingAverage = new double[prices.length];
        MInteger begin = new MInteger();
        MInteger length = new MInteger();

        Core c = new Core();
        RetCode retCode = c.sma(0, prices.length - 1, prices, periodsAverage, begin, length, movingAverage);

        if (retCode == RetCode.Success) {
            double[] returnAverage = new double[length.value];
            for (int i = begin.value; i <= length.value; i++) {
                returnAverage[i-begin.value] =movingAverage[i-begin.value];
            }
           return returnAverage;
        }
        throw new CalculationException("Exception Calculating " + CalculationType.MOVING_AVERAGE);
    }




}
