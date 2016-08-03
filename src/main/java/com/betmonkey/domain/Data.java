package com.betmonkey.domain;


import com.betmonkey.exception.DataRetrievalException;

public class Data {

	private DataRetrievalException dataRetrievalException;

	public DataRetrievalException getDataRetrievalException() {
		return dataRetrievalException;
	}

	public void setAPINGException(DataRetrievalException aPINGException) {
		dataRetrievalException = aPINGException;
	}

}
