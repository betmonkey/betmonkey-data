package com.betmonkey.containers;


import com.betmonkey.domain.EventTypeResult;

import java.util.List;

public class EventTypeResultContainer extends Container{
	
	private List<EventTypeResult> result;
		
	public List<EventTypeResult> getResult() {
		return result;
	}
	public void setResult(List<EventTypeResult> result) {
		this.result = result;
	}
}
