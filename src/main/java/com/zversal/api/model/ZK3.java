package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details about ZK3 which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class ZK3 {
	
	@Field("priceBYSales(latest FY)")
	private String priceBySales_latestFY;
	
	@Field("priceByBook(latest QTR)")
	private String priceByBook_latestQTR;
	@Field("priceByCashFlow(latest FY)")
    private String priceByCashFlow_latestFY;
	
	@Field("%ChgPrice-1Week")
	private String ChgPrice_1Week;
	
	@Field("%ChgPrice-4Week")
	private String ChgPrice4Week;
	
	@Field("%ChgPrice-12Week")
	private String ChgPrice_12Week;
	
	@Field("%ChgPrice-24Week")
	private String ChgPrice_24Week;
	
	@Field("%ChgPrice-52Week")
	private String ChgPrice_52Week;
	
	@Field("%ChgPrice-YTD")
	private String ChgPrice_YTD;
	
	private String marketCap;

	@Field("%ChgPrice-1WeekRelS&P")
	private String ChgPrice_1WeekRelSP;
	
	@Field("%ChgPrice-4WeekRelS&P")
	private String ChgPrice_4WeekRelSP;
	
	@Field("%ChgPrice-12WeekRelS&P")
	private String ChgPrice_12WeekRelSP;
	
	@Field("%ChgPrice-52WeekRelS&P")
	private String ChgPrice_52WeekRelSP;
	
	@Field("%ChgPriceYTDRelS&P")
	private String ChgPriceYTDRelSP;
	
	@Field("yearEndPrice(most recent)")
	private String yearEndPrice_mostrecent;
	
	@Field("yearEndPrice(-1)")
	private String yearEndPrice_1;
	
	@Field("yearEndPrice(-2)")
	private String yearEndPrice_2;
	
	@Field("yearEndPrice(-3)")
    private String yearEndPrice_3;
	
	@Field("yearEndPrice(-4)")
	private String yearEndPrice_4;
	
	@Field("reserved1")
	private String reserved1;
	
	@Field("reserved2")
	private String reserved2;
	
	@Field("reserved3")
	private String reserved3;
	
	@Field("reserved4")
	private String reserved4;
	
	@Field("reserved5")
	private String reserved5;
	
	@Field("12MonthEPSbeforeNRI")
	private String monthEPSbeforeNRI;
	
	@Field("12MonthNetIncome")
	private String monthNetIncome;
	
	@Field("lastFiscalQTR")
	private String lastFiscalQTR;
	
	@Field("quickRatio")
	private String quickRatio;
	

	private String cashRatio;
	private String frwdIAD;
	
	private String frwdDivYield;
    private String 	frwdDivPayoutRatio;
	private String bookValuePerShare;
	private String debtByEquity;
	
	@Field("12MPriceBySales")
	private String MPriceBySales_12;

	public String getPriceBySales_latestFY() {
		return priceBySales_latestFY;
	}

	public void setPriceBySales_latestFY(String priceBySales_latestFY) {
		this.priceBySales_latestFY = priceBySales_latestFY;
	}

	public String getPriceByBook_latestQTR() {
		return priceByBook_latestQTR;
	}

	public void setPriceByBook_latestQTR(String priceByBook_latestQTR) {
		this.priceByBook_latestQTR = priceByBook_latestQTR;
	}

	public String getPriceByCashFlow_latestFY() {
		return priceByCashFlow_latestFY;
	}

	public void setPriceByCashFlow_latestFY(String priceByCashFlow_latestFY) {
		this.priceByCashFlow_latestFY = priceByCashFlow_latestFY;
	}

	public String getChgPrice_1Week() {
		return ChgPrice_1Week;
	}

	public void setChgPrice_1Week(String chgPrice_1Week) {
		ChgPrice_1Week = chgPrice_1Week;
	}

	public String getChgPrice4Week() {
		return ChgPrice4Week;
	}

	public void setChgPrice4Week(String chgPrice4Week) {
		ChgPrice4Week = chgPrice4Week;
	}

	public String getChgPrice_12Week() {
		return ChgPrice_12Week;
	}

	public void setChgPrice_12Week(String chgPrice_12Week) {
		ChgPrice_12Week = chgPrice_12Week;
	}
	
	public String getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	public String getChgPrice_24Week() {
		return ChgPrice_24Week;
	}

	public void setChgPrice_24Week(String chgPrice_24Week) {
		ChgPrice_24Week = chgPrice_24Week;
	}

	public String getChgPrice_52Week() {
		return ChgPrice_52Week;
	}

	public void setChgPrice_52Week(String chgPrice_52Week) {
		ChgPrice_52Week = chgPrice_52Week;
	}

	public String getChgPrice_YTD() {
		return ChgPrice_YTD;
	}

	public void setChgPrice_YTD(String chgPrice_YTD) {
		ChgPrice_YTD = chgPrice_YTD;
	}

	public String getChgPrice_1WeekRelSP() {
		return ChgPrice_1WeekRelSP;
	}

	public void setChgPrice_1WeekRelSP(String chgPrice_1WeekRelSP) {
		ChgPrice_1WeekRelSP = chgPrice_1WeekRelSP;
	}

	public String getChgPrice_4WeekRelSP() {
		return ChgPrice_4WeekRelSP;
	}

	public void setChgPrice_4WeekRelSP(String chgPrice_4WeekRelSP) {
		ChgPrice_4WeekRelSP = chgPrice_4WeekRelSP;
	}

	public String getChgPrice_12WeekRelSP() {
		return ChgPrice_12WeekRelSP;
	}

	public void setChgPrice_12WeekRelSP(String chgPrice_12WeekRelSP) {
		ChgPrice_12WeekRelSP = chgPrice_12WeekRelSP;
	}

	public String getChgPrice_52WeekRelSP() {
		return ChgPrice_52WeekRelSP;
	}

	public void setChgPrice_52WeekRelSP(String chgPrice_52WeekRelSP) {
		ChgPrice_52WeekRelSP = chgPrice_52WeekRelSP;
	}

	public String getChgPriceYTDRelSP() {
		return ChgPriceYTDRelSP;
	}

	public void setChgPriceYTDRelSP(String chgPriceYTDRelSP) {
		ChgPriceYTDRelSP = chgPriceYTDRelSP;
	}

	public String getYearEndPrice_mostrecent() {
		return yearEndPrice_mostrecent;
	}

	public void setYearEndPrice_mostrecent(String yearEndPrice_mostrecent) {
		this.yearEndPrice_mostrecent = yearEndPrice_mostrecent;
	}

	public String getYearEndPrice_1() {
		return yearEndPrice_1;
	}

	public void setYearEndPrice_1(String yearEndPrice_1) {
		this.yearEndPrice_1 = yearEndPrice_1;
	}

	public String getYearEndPrice_2() {
		return yearEndPrice_2;
	}

	public void setYearEndPrice_2(String yearEndPrice_2) {
		this.yearEndPrice_2 = yearEndPrice_2;
	}

	public String getYearEndPrice_3() {
		return yearEndPrice_3;
	}

	public void setYearEndPrice_3(String yearEndPrice_3) {
		this.yearEndPrice_3 = yearEndPrice_3;
	}

	public String getYearEndPrice_4() {
		return yearEndPrice_4;
	}

	public void setYearEndPrice_4(String yearEndPrice_4) {
		this.yearEndPrice_4 = yearEndPrice_4;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved3() {
		return reserved3;
	}

	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}

	public String getReserved4() {
		return reserved4;
	}

	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}

	public String getReserved5() {
		return reserved5;
	}

	public void setReserved5(String reserved5) {
		this.reserved5 = reserved5;
	}

	public String getMonthEPSbeforeNRI() {
		return monthEPSbeforeNRI;
	}

	public void setMonthEPSbeforeNRI(String monthEPSbeforeNRI) {
		this.monthEPSbeforeNRI = monthEPSbeforeNRI;
	}

	public String getMonthNetIncome() {
		return monthNetIncome;
	}

	public void setMonthNetIncome(String monthNetIncome) {
		this.monthNetIncome = monthNetIncome;
	}

	public String getLastFiscalQTR() {
		return lastFiscalQTR;
	}

	public void setLastFiscalQTR(String lastFiscalQTR) {
		this.lastFiscalQTR = lastFiscalQTR;
	}

	public String getQuickRatio() {
		return quickRatio;
	}

	public void setQuickRatio(String quickRatio) {
		this.quickRatio = quickRatio;
	}

	public String getCashRatio() {
		return cashRatio;
	}

	public void setCashRatio(String cashRatio) {
		this.cashRatio = cashRatio;
	}

	public String getFrwdIAD() {
		return frwdIAD;
	}

	public void setFrwdIAD(String frwdIAD) {
		this.frwdIAD = frwdIAD;
	}

	public String getFrwdDivYield() {
		return frwdDivYield;
	}

	public void setFrwdDivYield(String frwdDivYield) {
		this.frwdDivYield = frwdDivYield;
	}

	public String getFrwdDivPayoutRatio() {
		return frwdDivPayoutRatio;
	}

	public void setFrwdDivPayoutRatio(String frwdDivPayoutRatio) {
		this.frwdDivPayoutRatio = frwdDivPayoutRatio;
	}

	public String getBookValuePerShare() {
		return bookValuePerShare;
	}

	public void setBookValuePerShare(String bookValuePerShare) {
		this.bookValuePerShare = bookValuePerShare;
	}

	public String getDebtByEquity() {
		return debtByEquity;
	}

	public void setDebtByEquity(String debtByEquity) {
		this.debtByEquity = debtByEquity;
	}


}
