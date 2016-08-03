package com.betmonkey;

import com.betmonkey.domain.*;
import com.betmonkey.enums.MarketProjection;
import com.betmonkey.enums.MarketSort;
import com.betmonkey.enums.MatchProjection;
import com.betmonkey.enums.OrderProjection;
import com.betmonkey.exception.DataRetrievalException;

import java.util.List;
import java.util.Set;

/**
 * Created by scott on 02/08/16.
 */
public interface DataProvider {



        public  List<EventTypeResult> listEventTypes(MarketFilter filter) throws DataRetrievalException;

        public  List<MarketBook> listMarketBook(List<String> marketIds, PriceProjection priceProjection, OrderProjection orderProjection,
                                                        MatchProjection matchProjection, String currencyCode) throws DataRetrievalException;

        public  List<MarketCatalogue> listMarketCatalogue(MarketFilter filter, Set<MarketProjection> marketProjection,
                                                                  MarketSort sort, String maxResult) throws DataRetrievalException;

        public  PlaceExecutionReport placeOrders(String marketId, List<PlaceInstruction> instructions, String customerRef) throws DataRetrievalException;



}
