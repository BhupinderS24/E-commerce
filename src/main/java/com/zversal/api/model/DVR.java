package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class DVR {
	private String ticker;
	private String company;
	private String productionDateOfFile;
	private String indicatedAnnualDividend;
	private String dividendRecentAnnouncementDate;
	@Field("dividendRecentEx-Date")
	private String dividendRecentEx_Date;
	private String dividendRecentPayDate;
	private String dividendRecentRecordDate;
	private String dividendRecentlyDeclaredOrPaid;
	private String dividendPaidPerShareForRecentFiscalYear;
	private String dividendPaidPerShareForLast12Months;
	private String avg3YearAnnualDividendPaid;
	private String avg5YearAnnualDividendPaid;
	private String avg10YearAnnualDividendPaid;
	private String percentageRateOfDividendGrowth;
	@Field("dividendsPaidLastYearY-1")
	private String dividendsPaidLastYearY_1;
	private String avgAnnualPercentRateOfDividendGrowthInLast3Years;
	@Field("dividendsPaidLastYearY-3")
	private String dividendsPaidLastYearY_3;
	private String avgAnnualPercentRateOfDividendGrowthInLast5Years;
	@Field("dividendsPaidLastYearY-5")
	private String dividendsPaidLastYearY_5;
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProductionDateOfFile() {
		return productionDateOfFile;
	}
	public void setProductionDateOfFile(String productionDateOfFile) {
		this.productionDateOfFile = productionDateOfFile;
	}
	public String getIndicatedAnnualDividend() {
		return indicatedAnnualDividend;
	}
	public void setIndicatedAnnualDividend(String indicatedAnnualDividend) {
		this.indicatedAnnualDividend = indicatedAnnualDividend;
	}
	public String getDividendRecentAnnouncementDate() {
		return dividendRecentAnnouncementDate;
	}
	public void setDividendRecentAnnouncementDate(String dividendRecentAnnouncementDate) {
		this.dividendRecentAnnouncementDate = dividendRecentAnnouncementDate;
	}
	public String getDividendRecentEx_Date() {
		return dividendRecentEx_Date;
	}
	public void setDividendRecentEx_Date(String dividendRecentEx_Date) {
		this.dividendRecentEx_Date = dividendRecentEx_Date;
	}
	public String getDividendRecentPayDate() {
		return dividendRecentPayDate;
	}
	public void setDividendRecentPayDate(String dividendRecentPayDate) {
		this.dividendRecentPayDate = dividendRecentPayDate;
	}
	public String getDividendRecentRecordDate() {
		return dividendRecentRecordDate;
	}
	public void setDividendRecentRecordDate(String dividendRecentRecordDate) {
		this.dividendRecentRecordDate = dividendRecentRecordDate;
	}
	public String getDividendRecentlyDeclaredOrPaid() {
		return dividendRecentlyDeclaredOrPaid;
	}
	public void setDividendRecentlyDeclaredOrPaid(String dividendRecentlyDeclaredOrPaid) {
		this.dividendRecentlyDeclaredOrPaid = dividendRecentlyDeclaredOrPaid;
	}
	public String getDividendPaidPerShareForRecentFiscalYear() {
		return dividendPaidPerShareForRecentFiscalYear;
	}
	public void setDividendPaidPerShareForRecentFiscalYear(String dividendPaidPerShareForRecentFiscalYear) {
		this.dividendPaidPerShareForRecentFiscalYear = dividendPaidPerShareForRecentFiscalYear;
	}
	public String getDividendPaidPerShareForLast12Months() {
		return dividendPaidPerShareForLast12Months;
	}
	public void setDividendPaidPerShareForLast12Months(String dividendPaidPerShareForLast12Months) {
		this.dividendPaidPerShareForLast12Months = dividendPaidPerShareForLast12Months;
	}
	public String getAvg3YearAnnualDividendPaid() {
		return avg3YearAnnualDividendPaid;
	}
	public void setAvg3YearAnnualDividendPaid(String avg3YearAnnualDividendPaid) {
		this.avg3YearAnnualDividendPaid = avg3YearAnnualDividendPaid;
	}
	public String getAvg5YearAnnualDividendPaid() {
		return avg5YearAnnualDividendPaid;
	}
	public void setAvg5YearAnnualDividendPaid(String avg5YearAnnualDividendPaid) {
		this.avg5YearAnnualDividendPaid = avg5YearAnnualDividendPaid;
	}
	public String getAvg10YearAnnualDividendPaid() {
		return avg10YearAnnualDividendPaid;
	}
	public void setAvg10YearAnnualDividendPaid(String avg10YearAnnualDividendPaid) {
		this.avg10YearAnnualDividendPaid = avg10YearAnnualDividendPaid;
	}
	public String getPercentageRateOfDividendGrowth() {
		return percentageRateOfDividendGrowth;
	}
	public void setPercentageRateOfDividendGrowth(String percentageRateOfDividendGrowth) {
		this.percentageRateOfDividendGrowth = percentageRateOfDividendGrowth;
	}
	public String getDividendsPaidLastYearY_1() {
		return dividendsPaidLastYearY_1;
	}
	public void setDividendsPaidLastYearY_1(String dividendsPaidLastYearY_1) {
		this.dividendsPaidLastYearY_1 = dividendsPaidLastYearY_1;
	}
	public String getAvgAnnualPercentRateOfDividendGrowthInLast3Years() {
		return avgAnnualPercentRateOfDividendGrowthInLast3Years;
	}
	public void setAvgAnnualPercentRateOfDividendGrowthInLast3Years(
			String avgAnnualPercentRateOfDividendGrowthInLast3Years) {
		this.avgAnnualPercentRateOfDividendGrowthInLast3Years = avgAnnualPercentRateOfDividendGrowthInLast3Years;
	}
	public String getDividendsPaidLastYearY_3() {
		return dividendsPaidLastYearY_3;
	}
	public void setDividendsPaidLastYearY_3(String dividendsPaidLastYearY_3) {
		this.dividendsPaidLastYearY_3 = dividendsPaidLastYearY_3;
	}
	public String getAvgAnnualPercentRateOfDividendGrowthInLast5Years() {
		return avgAnnualPercentRateOfDividendGrowthInLast5Years;
	}
	public void setAvgAnnualPercentRateOfDividendGrowthInLast5Years(
			String avgAnnualPercentRateOfDividendGrowthInLast5Years) {
		this.avgAnnualPercentRateOfDividendGrowthInLast5Years = avgAnnualPercentRateOfDividendGrowthInLast5Years;
	}
	public String getAvgAnnualPercentRateOfDividendGrowthInLast10Years() {
		return avgAnnualPercentRateOfDividendGrowthInLast10Years;
	}
	public void setAvgAnnualPercentRateOfDividendGrowthInLast10Years(
			String avgAnnualPercentRateOfDividendGrowthInLast10Years) {
		this.avgAnnualPercentRateOfDividendGrowthInLast10Years = avgAnnualPercentRateOfDividendGrowthInLast10Years;
	}
	public String getDividendsPaidLastYearY_10() {
		return dividendsPaidLastYearY_10;
	}
	public void setDividendsPaidLastYearY_10(String dividendsPaidLastYearY_10) {
		this.dividendsPaidLastYearY_10 = dividendsPaidLastYearY_10;
	}
	public String getDividendFrequencyCode() {
		return dividendFrequencyCode;
	}
	public void setDividendFrequencyCode(String dividendFrequencyCode) {
		this.dividendFrequencyCode = dividendFrequencyCode;
	}
	public String getDividendFrequencyText() {
		return dividendFrequencyText;
	}
	public void setDividendFrequencyText(String dividendFrequencyText) {
		this.dividendFrequencyText = dividendFrequencyText;
	}
	private String avgAnnualPercentRateOfDividendGrowthInLast10Years;
	@Field("dividendsPaidLastYearY-10")
	private String dividendsPaidLastYearY_10;
	private String dividendFrequencyCode;
	private String dividendFrequencyText;

}
