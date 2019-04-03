package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class SIC {
	
	@Field("CUSIP")
    private String cusip;
	
	@Field("SIC")
	private String sic;
	
	@Field("EXCHANGECODE")
    private String exchangeCode;
	
	@Field("INDEXORDER")
	private String indexOrder;

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	public String getSic() {
		return sic;
	}

	public void setSic(String sic) {
		this.sic = sic;
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
	
}
