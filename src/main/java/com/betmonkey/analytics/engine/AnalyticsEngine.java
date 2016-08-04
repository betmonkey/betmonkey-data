package com.betmonkey.analytics.engine;

import com.betmonkey.analytics.Analytics;
import com.betmonkey.analytics.CalculationException;

/**
 * Created by scott on 04/08/16.
 */
public interface AnalyticsEngine {

   public Analytics calculate(double prices[]) throws CalculationException;
}
