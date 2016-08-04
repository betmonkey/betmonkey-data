package com.betmonkey.analytics.engine;

/**
 * Created by scott on 04/08/16.
 */
public class CompetitorCalculator
{

    private AnalyticsEngine analyticsEngine;

    private int dataPointsBeforeCalc=4;

    public void setdataPointsBeforeCalc(int dataPointsBeforeCalc) {
        this.dataPointsBeforeCalc = dataPointsBeforeCalc;
    }



    public CompetitorCalculator(AnalyticsEngine analyticsEngine)
    {
        this.analyticsEngine = analyticsEngine;
    }

    public void calculate(double[] prices)
    {

    }




}
