package com.betmonkey.analytics;

/**
 * Created by scott on 04/08/16.
 */
public class CompetitorAnalytics extends Analytics

{
    private CompetitorAnalytics(){}

    public CompetitorAnalytics(int competitorId)
    {
        this.competitorId = competitorId;
    }

    public int getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(int competitorId) {
        this.competitorId = competitorId;
    }

    private int competitorId;

}
