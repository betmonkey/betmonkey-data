package com.betmonkey.analytics;

import com.betmonkey.enums.CalculationType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by scott on 04/08/16.
 */
public class Analytics

{

    private Map<CalculationType,double[]> results = new HashMap<CalculationType,double[]>();


    public double[] getAnalytics(CalculationType type)
    {
        return results.get(type);
    }

    public void addAnalytics(CalculationType type, double[] values)
    {
        results.put(type,values);
    }


}
