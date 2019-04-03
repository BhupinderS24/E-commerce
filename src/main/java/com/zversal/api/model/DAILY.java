package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class DAILY {
	@Field("AVERAGEPRICE50DAY")
	private String averagePrice50Day;
	
	private String high;
	
	@Field("DIVYIELD")
	private String divyield;
	@Field("AVERAGEVOLUME20DAY")
	private String averageVolume20Day;
	@Field("AVERAGEPRICE30DAY")
	private String averagePrice30Day;
	@Field("AVERAGEPRICE100DAY")
	private String averagePrice100Day;
	@Field("PERATIO")
	private String peratio;
	@Field("PERCPRICECHANGEYTD")
	private String percPriceChangeYtd;
	@Field("HIGHDATE")
	private String highDate;
	@Field("AVERAGEPRICE10DAY")
	private String averagePrice10Day;
	@Field("DIVPAYOUT")
	private String divPayOut;
	@Field("EXCHANGECODE")
	private String exchangeCode;
	@Field("CUSIP")
	private String cusip;
	@Field("LOWDATE")
	private String lowDate;
	@Field("AVERAGEVOLUME10DAY")
	private String averageVolume10Day;
	@Field("DATE")
	private String date;
	@Field("LOW")
	private String low;
	@Field("AVERAGEVOLUME30DAY")
	private String averageVolume30Day;
	@Field("AVERAGEPRICE200DAY")
	private String averagePrice200Day;
	public String getAveragePrice50Day() {
		return averagePrice50Day;
	}
	public void setAveragePrice50Day(String averagePrice50Day) {
		this.averagePrice50Day = averagePrice50Day;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getDivyield() {
		return divyield;
	}
	public void setDivyield(String divyield) {
		this.divyield = divyield;
	}
	public String getAverageVolume20Day() {
		return averageVolume20Day;
	}
	public void setAverageVolume20Day(String averageVolume20Day) {
		this.averageVolume20Day = averageVolume20Day;
	}
	public String getAveragePrice30Day() {
		return averagePrice30Day;
	}
	public void setAveragePrice30Day(String averagePrice30Day) {
		this.averagePrice30Day = averagePrice30Day;
	}
	public String getAveragePrice100Day() {
		return averagePrice100Day;
	}
	public void setAveragePrice100Day(String averagePrice100Day) {
		this.averagePrice100Day = averagePrice100Day;
	}
	public String getPeratio() {
		return peratio;
	}
	public void setPeratio(String peratio) {
		this.peratio = peratio;
	}
	public String getPercPriceChangeYtd() {
		return percPriceChangeYtd;
	}
	public void setPercPriceChangeYtd(String percPriceChangeYtd) {
		this.percPriceChangeYtd = percPriceChangeYtd;
	}
	public String getHighDate() {
		return highDate;
	}
	public void setHighDate(String highDate) {
		this.highDate = highDate;
	}
	public String getAveragePrice10Day() {
		return averagePrice10Day;
	}
	public void setAveragePrice10Day(String averagePrice10Day) {
		this.averagePrice10Day = averagePrice10Day;
	}
	public String getDivPayOut() {
		return divPayOut;
	}
	public void setDivPayOut(String divPayOut) {
		this.divPayOut = divPayOut;
	}
	public String getExchangeCode() {
		return exchangeCode;
	}
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}
	public String getCusip() {
		return cusip;
	}
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}
	public String getLowDate() {
		return lowDate;
	}
	public void setLowDate(String lowDate) {
		this.lowDate = lowDate;
	}
	public String getAverageVolume10Day() {
		return averageVolume10Day;
	}
	public void setAverageVolume10Day(String averageVolume10Day) {
		this.averageVolume10Day = averageVolume10Day;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getAverageVolume30Day() {
		return averageVolume30Day;
	}
	public void setAverageVolume30Day(String averageVolume30Day) {
		this.averageVolume30Day = averageVolume30Day;
	}
	public String getAveragePrice200Day() {
		return averagePrice200Day;
	}
	public void setAveragePrice200Day(String averagePrice200Day) {
		this.averagePrice200Day = averagePrice200Day;
	}
	
}
