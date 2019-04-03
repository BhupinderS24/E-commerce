package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details about NAICS which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class NAICS {
	@Field("CUSIP")
	private String cusip;
	
	@Field("EXCHANGECODE")
	private String exchangeCode;
	@Field("INDEXORDER")
	private String indexOrder;
	
	@Field("NAICS")
	private String naics;

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public String getIndexOrder() {
		return indexOrder;
	}

	public void setIndexOrder(String indexOrder) {
		this.indexOrder = indexOrder;
	}

	public String getNaics() {
		return naics;
	}

	public void setNaics(String naics) {
		this.naics = naics;
	}
	
}
