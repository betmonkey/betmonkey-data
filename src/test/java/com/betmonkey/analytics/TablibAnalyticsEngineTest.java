package com.betmonkey.analytics;

import com.betmonkey.analytics.engine.TaLibAnalyticsEngine;
import com.betmonkey.enums.CalculationType;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by scott on 04/08/16.
 */
public class TablibAnalyticsEngineTest {


    private double prices[]= new double[]{10.0,10.5,20.0,15.5,30.0,40.5,50.0};

    @Test
    public void testSimpleMovingAverage()
    {
        try {
            TaLibAnalyticsEngine analyticsEngine = new TaLibAnalyticsEngine();
            analyticsEngine.setDataPointsBeforeCalc(2);
            Analytics analytics = analyticsEngine.calculate(prices);
            double[] results= analytics.getAnalytics(CalculationType.MOVING_AVERAGE);

            //As the moving average needs two prices we only expect 6 MA prices
            Assert.assertEquals(prices.length-1,results.length);
            Assert.assertEquals(results[5],45.25);
        } catch (CalculationException e) {
            e.printStackTrace();
        }
    }

}
