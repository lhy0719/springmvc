package com.jd.ofc.asyncservice.webservice;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class StockSplitOrder implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5214822132717406085L;
	
	private Long orderId;
	
	private String userName;
	/**
     * 扩展标签
     */
	private Map<String,String> extTags = new HashMap<String,String>();
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Map<String, String> getExtTags() {
		return extTags;
	}
	public void setExtTags(Map<String, String> extTags) {
		this.extTags = extTags;
	}
	
	
}
