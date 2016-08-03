package com.betmonkey.containers;

import com.betmonkey.domain.DataError;

public class Container {
	
	private DataError error;
	private String jsonrpc;
	
	public DataError getError() {
		return error;
	}
	public void setError(DataError error) {
		this.error = error;
	}
	public String getJsonrpc() {
		return jsonrpc;
	}
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	
}
