package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class CZ1 {
	private String zacksMasterId;
	private String shortName;
	private String ticker;
	private String fiscalYearEndMonth;
	private String sicCode;
	private String primaryExchange;
	private String expandedIndustry;
	private String sector;
	private String mediumIndustry;
	private String shortNameHighestSalesRank1;
	private String tickerRank1;
	private String shortNameHighestSalesRank2;
	private String tickerRank2;
	private String shortNameHighestSalesRank3;
	private String tickerRank3;
	private String shortNameHighestSalesRank4;
	private String tickerRank4;
	private String shortNameHighestSalesRank5;
	private String tickerRank5;
	private String shortNameHighestSalesRank6;
	private String tickerRank6;
	private String shortNameHighestSalesRank7;
	private String tickerRank7;
	private String codeCoverage;
	private String dateOfRecentSplit;
	private String splitAdjustmentFactor;
	@Field("lastFiscalQ-Period")
	private String lastFiscalQPeriod;
	private String nextExpectedReportDate;
	private String totalEmployees;
	private String closingPrice;
	@Field("52wHighPrice")
	private String HighPrice52w;
	@Field("52wLowPrice")
	private String LowPrice52w;

	@Field("%PriceChg(last 4 weeks)")
	private String PriceChglast4weeks;
	@Field("%PriceChg(Relative to S&P 500)")
	private String PriceChg_RelativetoSP500;

	@Field("%PriceChg(last 12 weeks)")
	private String PriceChglast12weeks;

	@Field("%YearToDate")
	private String YearToDate;
	@Field("%YearToDate(Relative S&P 500)")
	private String YearToDate_RelativeSP500;

	@Field("avgDailyVol(Actual Shares")
	private String avgDailyVol_Actual_Shares;
	private String indicatedAnnualDividend;
	private String currentDividendYield;
	private String lastThreeMonthsDividends;

	@Field("ex-DateOfLastDividend")
	private String ex_DateOfLastDividend;
	private String meanEPSCurrentFiscalQTR;
	private String meanEPSCurrentFiscalYear;
	private String noOfEPS;
	private String meanEPSGrowth;
	private String beta;
	private String marketCapitalization;
	private String priceEarningsRatio1;
	private String priceEarningsRatio2;
	private String ratioOfCurrentPriceAndCurrentQTRBookValue;
	private String ratioOfIndicatedAnnualDividendAndTrailing12MonthEPS;
	private String ratioOfCurrentPriceAndCurrentAnnualCashFlow;
	private String recentTotalOutstandingCommonShares;
	private String totalRevenuesForRecentFiscalYear;
	@Field("totalRevenuesForRecentFiscalYear-1")
	private String totalRevenuesForRecentFiscalYear_1;

	@Field("totalRevenuesForRecentFiscalYear-2")
	private String totalRevenuesForRecentFiscalYear_2;

	private String netIncomeForRecentFiscalYear;

	@Field("netIncomeForRecentFiscalYear-1")
	private String netIncomeForRecentFiscalYear_1;

	@Field("netIncomeForRecentFiscalYear-2")
	private String netIncomeForRecentFiscalYear_2;

	private String sumOfTotalRevenuesForFourQuarterlyPeriods;
	@Field("sumOfRecentFourQTRTotalRevenues(period 2 recent qtr)")
	private String sumOfRecentFourQTRTotalRevenues_period2recentqtr;
	@Field("sumOfRecentFourQTRTotalRevenues(period 3 recent qtr)")
	private String sumOfRecentFourQTRTotalRevenues_period3recentqtr;
	private String sumOfNetIncomeForFourQuarterlyPeriods;
	@Field("sumOfRecentFourQTRNetIncome(period 2 recent qtr)")
	private String sumOfRecentFourQTRNetIncome_period_2recentqtr;

	@Field("sumOfRecentFourQTRNetIncome(period 3 recent qtr)")
	private String sumOfRecentFourQTRNetIncome_period3recentqtr;
	private String totalAssetsForRecentQTRPeriod;

	@Field("totalAssetsForRecentQTRPeriod-1")
	private String totalAssetsForRecentQTRPeriod_1;
	@Field("totalAssetsForRecentQTRPeriod-2")
	private String totalAssetsForRecentQTRPeriod_2;
	private String totalLiabilitiesForRecentQTRPeriod;

	@Field("totalLiabilitiesForRecentQTRPeriod-1")
	private String totalLiabilitiesForRecentQTRPeriod_1;
	@Field("totalLiabilitiesForRecentQTRPeriod-2")
	private String totalLiabilitiesForRecentQTRPeriod_2;

	private String totalCommonEquityForRecentQTRPeriod;

	@Field("totalCommonEquityForRecentQTRPeriod-1")
	private String totalCommonEquityForRecentQTRPeriod_1;
	@Field("totalCommonEquityForRecentQTRPeriod-2")
	private String totalCommonEquityForRecentQTRPeriod_2;

	private String returnOnCommonEquityForRecentFiscalPeriod;

	@Field("returnOnCommonEquityForRecentFiscalPeriod-1")
	private String returnOnCommonEquityForRecentFiscalPeriod_1;
	@Field("returnOnCommonEquityForRecentFiscalPeriod-2")
	private String returnOnCommonEquityForRecentFiscalPeriod_2;
	private String returnOnAssetsForRecentFiscalPeriod;

	@Field("String returnOnAssetsForRecentFiscalPeriod-1")
	private String returnOnAssetsForRecentFiscalPeriod_1;

	@Field("returnOnAssetsForRecentFiscalPeriod-2")
	private String returnOnAssetsForRecentFiscalPeriod_2;

	private String ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod;
	@Field("ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1")
	private String ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1;

	private String preTaxMarginForRecentFiscalPeriod;
	@Field("preTaxMarginForRecentFiscalPeriod(period 2 recent)")
	private String preTaxMarginForRecentFiscalPeriod_period2recent;

	@Field("preTaxMarginForRecentFiscalPeriod(period 3 recent)")
	private String preTaxMarginForRecentFiscalPeriod_period3recent;

	private String ratioOfRecentAnnualCashFlowAndShare;

	private String ratioOfRecentAnnualCashFlowAndShare1;
	private String recentQTRBookValuePerCommonShare;
	@Field("recentQTRBookValuePerCommonShare-1")
	private String recentQTRBookValuePerCommonShare_1;

	@Field("recentQTRBookValuePerCommonShare-2")
	private String recentQTRBookValuePerCommonShare_2;
	private String netMarginForRecentFiscalPeriod;
	private String netMarginForRecentFiscalPeriod2;
	private String netMarginForRecentFiscalPeriod3;
	private String operatingMarginForRecentFiscalPeriod;
	private String operatingMarginForRecentFiscalPeriod2;
	private String operatingMarginForRecentFiscalPeriod3;
	private String inventoryTurnover;
	private String inventoryTurnoverPeriod2;
	private String inventoryTurnoverPeriod3;
	private String recentQTRCurrentRatio;
	private String recentQTRCurrentRatioForPeriod1;
	private String recentQTRCurrentRatioForPeriod2;
	private String recentQTRLongTermDebtToTotalCapitalization;
	private String recentQTRLongTermDebtToTotalCapitalization1;
	private String recentQTRLongTermDebtToTotalCapitalization2;
	private String reserved1;
	private String reserved2;
	private String reserved3;
	private String reserved4;
	private String recentQTRQuickRatio;
	private String recentQTRQuickRatio1;
	private String recentQTRQuickRatio2;
	private String ratioOfRecentQTRLongTermDebtAndRecentQTREquity;
	private String ratioOfRecentQTRLongTermDebtAndRecentQTREquity1;
	private String ratioOfRecentQTRLongTermDebtAndRecentQTREquity2;
	private String differenceOfTwelveMonthPayoutAndFiveYearAvgPayout;
	private String qtrEPSGrowth;
	private String qtrEPSGrowth1;
	private String qtrEPSGrowth2;
	private String qtrEPSGrowth3;
	private String ratioOfCurrentPriceAndTTMOfTotalRevenues;
	private String priceToEarningForEPSGrowthRatio;
	private String recentCompletedQTR;
	private String recentCompletedQTRThreeMonths;
	private String recentCompletedQTRSixMonths;

	public String getZacksMasterId() {
		return zacksMasterId;
	}

	public void setZacksMasterId(String zacksMasterId) {
		this.zacksMasterId = zacksMasterId;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getFiscalYearEndMonth() {
		return fiscalYearEndMonth;
	}

	public void setFiscalYearEndMonth(String fiscalYearEndMonth) {
		this.fiscalYearEndMonth = fiscalYearEndMonth;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getPrimaryExchange() {
		return primaryExchange;
	}

	public void setPrimaryExchange(String primaryExchange) {
		this.primaryExchange = primaryExchange;
	}

	public String getExpandedIndustry() {
		return expandedIndustry;
	}

	public void setExpandedIndustry(String expandedIndustry) {
		this.expandedIndustry = expandedIndustry;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getMediumIndustry() {
		return mediumIndustry;
	}

	public void setMediumIndustry(String mediumIndustry) {
		this.mediumIndustry = mediumIndustry;
	}

	public String getShortNameHighestSalesRank1() {
		return shortNameHighestSalesRank1;
	}

	public void setShortNameHighestSalesRank1(String shortNameHighestSalesRank1) {
		this.shortNameHighestSalesRank1 = shortNameHighestSalesRank1;
	}

	public String getTickerRank1() {
		return tickerRank1;
	}

	public void setTickerRank1(String tickerRank1) {
		this.tickerRank1 = tickerRank1;
	}

	public String getShortNameHighestSalesRank2() {
		return shortNameHighestSalesRank2;
	}

	public void setShortNameHighestSalesRank2(String shortNameHighestSalesRank2) {
		this.shortNameHighestSalesRank2 = shortNameHighestSalesRank2;
	}

	public String getTickerRank2() {
		return tickerRank2;
	}

	public void setTickerRank2(String tickerRank2) {
		this.tickerRank2 = tickerRank2;
	}

	public String getShortNameHighestSalesRank3() {
		return shortNameHighestSalesRank3;
	}

	public void setShortNameHighestSalesRank3(String shortNameHighestSalesRank3) {
		this.shortNameHighestSalesRank3 = shortNameHighestSalesRank3;
	}

	public String getTickerRank3() {
		return tickerRank3;
	}

	public void setTickerRank3(String tickerRank3) {
		this.tickerRank3 = tickerRank3;
	}

	public String getShortNameHighestSalesRank4() {
		return shortNameHighestSalesRank4;
	}

	public void setShortNameHighestSalesRank4(String shortNameHighestSalesRank4) {
		this.shortNameHighestSalesRank4 = shortNameHighestSalesRank4;
	}

	public String getTickerRank4() {
		return tickerRank4;
	}

	public void setTickerRank4(String tickerRank4) {
		this.tickerRank4 = tickerRank4;
	}

	public String getShortNameHighestSalesRank5() {
		return shortNameHighestSalesRank5;
	}

	public void setShortNameHighestSalesRank5(String shortNameHighestSalesRank5) {
		this.shortNameHighestSalesRank5 = shortNameHighestSalesRank5;
	}

	public String getTickerRank5() {
		return tickerRank5;
	}

	public void setTickerRank5(String tickerRank5) {
		this.tickerRank5 = tickerRank5;
	}

	public String getShortNameHighestSalesRank6() {
		return shortNameHighestSalesRank6;
	}

	public void setShortNameHighestSalesRank6(String shortNameHighestSalesRank6) {
		this.shortNameHighestSalesRank6 = shortNameHighestSalesRank6;
	}

	public String getTickerRank6() {
		return tickerRank6;
	}

	public void setTickerRank6(String tickerRank6) {
		this.tickerRank6 = tickerRank6;
	}

	public String getShortNameHighestSalesRank7() {
		return shortNameHighestSalesRank7;
	}

	public void setShortNameHighestSalesRank7(String shortNameHighestSalesRank7) {
		this.shortNameHighestSalesRank7 = shortNameHighestSalesRank7;
	}

	public String getTickerRank7() {
		return tickerRank7;
	}

	public void setTickerRank7(String tickerRank7) {
		this.tickerRank7 = tickerRank7;
	}

	public String getCodeCoverage() {
		return codeCoverage;
	}

	public void setCodeCoverage(String codeCoverage) {
		this.codeCoverage = codeCoverage;
	}

	public String getDateOfRecentSplit() {
		return dateOfRecentSplit;
	}

	public void setDateOfRecentSplit(String dateOfRecentSplit) {
		this.dateOfRecentSplit = dateOfRecentSplit;
	}

	public String getSplitAdjustmentFactor() {
		return splitAdjustmentFactor;
	}

	public void setSplitAdjustmentFactor(String splitAdjustmentFactor) {
		this.splitAdjustmentFactor = splitAdjustmentFactor;
	}

	public String getLastFiscalQPeriod() {
		return lastFiscalQPeriod;
	}

	public void setLastFiscalQPeriod(String lastFiscalQPeriod) {
		this.lastFiscalQPeriod = lastFiscalQPeriod;
	}

	public String getNextExpectedReportDate() {
		return nextExpectedReportDate;
	}

	public void setNextExpectedReportDate(String nextExpectedReportDate) {
		this.nextExpectedReportDate = nextExpectedReportDate;
	}

	public String getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(String totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public String getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(String closingPrice) {
		this.closingPrice = closingPrice;
	}

	public String getHighPrice52w() {
		return HighPrice52w;
	}

	public void setHighPrice52w(String highPrice52w) {
		HighPrice52w = highPrice52w;
	}

	public String getLowPrice52w() {
		return LowPrice52w;
	}

	public void setLowPrice52w(String lowPrice52w) {
		LowPrice52w = lowPrice52w;
	}

	public String getPriceChglast4weeks() {
		return PriceChglast4weeks;
	}

	public void setPriceChglast4weeks(String priceChglast4weeks) {
		PriceChglast4weeks = priceChglast4weeks;
	}

	public String getPriceChg_RelativetoSP500() {
		return PriceChg_RelativetoSP500;
	}

	public void setPriceChg_RelativetoSP500(String priceChg_RelativetoSP500) {
		PriceChg_RelativetoSP500 = priceChg_RelativetoSP500;
	}

	public String getPriceChglast12weeks() {
		return PriceChglast12weeks;
	}

	public void setPriceChglast12weeks(String priceChglast12weeks) {
		PriceChglast12weeks = priceChglast12weeks;
	}

	public String getYearToDate() {
		return YearToDate;
	}

	public void setYearToDate(String yearToDate) {
		YearToDate = yearToDate;
	}

	public String getYearToDate_RelativeSP500() {
		return YearToDate_RelativeSP500;
	}

	public void setYearToDate_RelativeSP500(String yearToDate_RelativeSP500) {
		YearToDate_RelativeSP500 = yearToDate_RelativeSP500;
	}

	public String getAvgDailyVol_Actual_Shares() {
		return avgDailyVol_Actual_Shares;
	}

	public void setAvgDailyVol_Actual_Shares(String avgDailyVol_Actual_Shares) {
		this.avgDailyVol_Actual_Shares = avgDailyVol_Actual_Shares;
	}

	public String getIndicatedAnnualDividend() {
		return indicatedAnnualDividend;
	}

	public void setIndicatedAnnualDividend(String indicatedAnnualDividend) {
		this.indicatedAnnualDividend = indicatedAnnualDividend;
	}

	public String getCurrentDividendYield() {
		return currentDividendYield;
	}

	public void setCurrentDividendYield(String currentDividendYield) {
		this.currentDividendYield = currentDividendYield;
	}

	public String getLastThreeMonthsDividends() {
		return lastThreeMonthsDividends;
	}

	public void setLastThreeMonthsDividends(String lastThreeMonthsDividends) {
		this.lastThreeMonthsDividends = lastThreeMonthsDividends;
	}

	public String getEx_DateOfLastDividend() {
		return ex_DateOfLastDividend;
	}

	public void setEx_DateOfLastDividend(String ex_DateOfLastDividend) {
		this.ex_DateOfLastDividend = ex_DateOfLastDividend;
	}

	public String getMeanEPSCurrentFiscalQTR() {
		return meanEPSCurrentFiscalQTR;
	}

	public void setMeanEPSCurrentFiscalQTR(String meanEPSCurrentFiscalQTR) {
		this.meanEPSCurrentFiscalQTR = meanEPSCurrentFiscalQTR;
	}

	public String getMeanEPSCurrentFiscalYear() {
		return meanEPSCurrentFiscalYear;
	}

	public void setMeanEPSCurrentFiscalYear(String meanEPSCurrentFiscalYear) {
		this.meanEPSCurrentFiscalYear = meanEPSCurrentFiscalYear;
	}

	public String getNoOfEPS() {
		return noOfEPS;
	}

	public void setNoOfEPS(String noOfEPS) {
		this.noOfEPS = noOfEPS;
	}

	public String getMeanEPSGrowth() {
		return meanEPSGrowth;
	}

	public void setMeanEPSGrowth(String meanEPSGrowth) {
		this.meanEPSGrowth = meanEPSGrowth;
	}

	public String getBeta() {
		return beta;
	}

	public void setBeta(String beta) {
		this.beta = beta;
	}

	public String getMarketCapitalization() {
		return marketCapitalization;
	}

	public void setMarketCapitalization(String marketCapitalization) {
		this.marketCapitalization = marketCapitalization;
	}

	public String getPriceEarningsRatio1() {
		return priceEarningsRatio1;
	}

	public void setPriceEarningsRatio1(String priceEarningsRatio1) {
		this.priceEarningsRatio1 = priceEarningsRatio1;
	}

	public String getPriceEarningsRatio2() {
		return priceEarningsRatio2;
	}

	public void setPriceEarningsRatio2(String priceEarningsRatio2) {
		this.priceEarningsRatio2 = priceEarningsRatio2;
	}

	public String getRatioOfCurrentPriceAndCurrentQTRBookValue() {
		return ratioOfCurrentPriceAndCurrentQTRBookValue;
	}

	public void setRatioOfCurrentPriceAndCurrentQTRBookValue(String ratioOfCurrentPriceAndCurrentQTRBookValue) {
		this.ratioOfCurrentPriceAndCurrentQTRBookValue = ratioOfCurrentPriceAndCurrentQTRBookValue;
	}

	public String getRatioOfIndicatedAnnualDividendAndTrailing12MonthEPS() {
		return ratioOfIndicatedAnnualDividendAndTrailing12MonthEPS;
	}

	public void setRatioOfIndicatedAnnualDividendAndTrailing12MonthEPS(
			String ratioOfIndicatedAnnualDividendAndTrailing12MonthEPS) {
		this.ratioOfIndicatedAnnualDividendAndTrailing12MonthEPS = ratioOfIndicatedAnnualDividendAndTrailing12MonthEPS;
	}

	public String getRatioOfCurrentPriceAndCurrentAnnualCashFlow() {
		return ratioOfCurrentPriceAndCurrentAnnualCashFlow;
	}

	public void setRatioOfCurrentPriceAndCurrentAnnualCashFlow(String ratioOfCurrentPriceAndCurrentAnnualCashFlow) {
		this.ratioOfCurrentPriceAndCurrentAnnualCashFlow = ratioOfCurrentPriceAndCurrentAnnualCashFlow;
	}

	public String getRecentTotalOutstandingCommonShares() {
		return recentTotalOutstandingCommonShares;
	}

	public void setRecentTotalOutstandingCommonShares(String recentTotalOutstandingCommonShares) {
		this.recentTotalOutstandingCommonShares = recentTotalOutstandingCommonShares;
	}

	public String getTotalRevenuesForRecentFiscalYear() {
		return totalRevenuesForRecentFiscalYear;
	}

	public void setTotalRevenuesForRecentFiscalYear(String totalRevenuesForRecentFiscalYear) {
		this.totalRevenuesForRecentFiscalYear = totalRevenuesForRecentFiscalYear;
	}

	public String getTotalRevenuesForRecentFiscalYear_1() {
		return totalRevenuesForRecentFiscalYear_1;
	}

	public void setTotalRevenuesForRecentFiscalYear_1(String totalRevenuesForRecentFiscalYear_1) {
		this.totalRevenuesForRecentFiscalYear_1 = totalRevenuesForRecentFiscalYear_1;
	}

	public String getTotalRevenuesForRecentFiscalYear_2() {
		return totalRevenuesForRecentFiscalYear_2;
	}

	public void setTotalRevenuesForRecentFiscalYear_2(String totalRevenuesForRecentFiscalYear_2) {
		this.totalRevenuesForRecentFiscalYear_2 = totalRevenuesForRecentFiscalYear_2;
	}

	public String getNetIncomeForRecentFiscalYear() {
		return netIncomeForRecentFiscalYear;
	}

	public void setNetIncomeForRecentFiscalYear(String netIncomeForRecentFiscalYear) {
		this.netIncomeForRecentFiscalYear = netIncomeForRecentFiscalYear;
	}

	public String getNetIncomeForRecentFiscalYear_1() {
		return netIncomeForRecentFiscalYear_1;
	}

	public void setNetIncomeForRecentFiscalYear_1(String netIncomeForRecentFiscalYear_1) {
		this.netIncomeForRecentFiscalYear_1 = netIncomeForRecentFiscalYear_1;
	}

	public String getNetIncomeForRecentFiscalYear_2() {
		return netIncomeForRecentFiscalYear_2;
	}

	public void setNetIncomeForRecentFiscalYear_2(String netIncomeForRecentFiscalYear_2) {
		this.netIncomeForRecentFiscalYear_2 = netIncomeForRecentFiscalYear_2;
	}

	public String getSumOfTotalRevenuesForFourQuarterlyPeriods() {
		return sumOfTotalRevenuesForFourQuarterlyPeriods;
	}

	public void setSumOfTotalRevenuesForFourQuarterlyPeriods(String sumOfTotalRevenuesForFourQuarterlyPeriods) {
		this.sumOfTotalRevenuesForFourQuarterlyPeriods = sumOfTotalRevenuesForFourQuarterlyPeriods;
	}

	public String getSumOfRecentFourQTRTotalRevenues_period2recentqtr() {
		return sumOfRecentFourQTRTotalRevenues_period2recentqtr;
	}

	public void setSumOfRecentFourQTRTotalRevenues_period2recentqtr(
			String sumOfRecentFourQTRTotalRevenues_period2recentqtr) {
		this.sumOfRecentFourQTRTotalRevenues_period2recentqtr = sumOfRecentFourQTRTotalRevenues_period2recentqtr;
	}

	public String getSumOfRecentFourQTRTotalRevenues_period3recentqtr() {
		return sumOfRecentFourQTRTotalRevenues_period3recentqtr;
	}

	public void setSumOfRecentFourQTRTotalRevenues_period3recentqtr(
			String sumOfRecentFourQTRTotalRevenues_period3recentqtr) {
		this.sumOfRecentFourQTRTotalRevenues_period3recentqtr = sumOfRecentFourQTRTotalRevenues_period3recentqtr;
	}

	public String getSumOfNetIncomeForFourQuarterlyPeriods() {
		return sumOfNetIncomeForFourQuarterlyPeriods;
	}

	public void setSumOfNetIncomeForFourQuarterlyPeriods(String sumOfNetIncomeForFourQuarterlyPeriods) {
		this.sumOfNetIncomeForFourQuarterlyPeriods = sumOfNetIncomeForFourQuarterlyPeriods;
	}

	public String getSumOfRecentFourQTRNetIncome_period_2recentqtr() {
		return sumOfRecentFourQTRNetIncome_period_2recentqtr;
	}

	public void setSumOfRecentFourQTRNetIncome_period_2recentqtr(String sumOfRecentFourQTRNetIncome_period_2recentqtr) {
		this.sumOfRecentFourQTRNetIncome_period_2recentqtr = sumOfRecentFourQTRNetIncome_period_2recentqtr;
	}

	public String getSumOfRecentFourQTRNetIncome_period3recentqtr() {
		return sumOfRecentFourQTRNetIncome_period3recentqtr;
	}

	public void setSumOfRecentFourQTRNetIncome_period3recentqtr(String sumOfRecentFourQTRNetIncome_period3recentqtr) {
		this.sumOfRecentFourQTRNetIncome_period3recentqtr = sumOfRecentFourQTRNetIncome_period3recentqtr;
	}

	public String getTotalAssetsForRecentQTRPeriod() {
		return totalAssetsForRecentQTRPeriod;
	}

	public void setTotalAssetsForRecentQTRPeriod(String totalAssetsForRecentQTRPeriod) {
		this.totalAssetsForRecentQTRPeriod = totalAssetsForRecentQTRPeriod;
	}

	public String getTotalAssetsForRecentQTRPeriod_1() {
		return totalAssetsForRecentQTRPeriod_1;
	}

	public void setTotalAssetsForRecentQTRPeriod_1(String totalAssetsForRecentQTRPeriod_1) {
		this.totalAssetsForRecentQTRPeriod_1 = totalAssetsForRecentQTRPeriod_1;
	}

	public String getTotalAssetsForRecentQTRPeriod_2() {
		return totalAssetsForRecentQTRPeriod_2;
	}

	public void setTotalAssetsForRecentQTRPeriod_2(String totalAssetsForRecentQTRPeriod_2) {
		this.totalAssetsForRecentQTRPeriod_2 = totalAssetsForRecentQTRPeriod_2;
	}

	public String getTotalLiabilitiesForRecentQTRPeriod() {
		return totalLiabilitiesForRecentQTRPeriod;
	}

	public void setTotalLiabilitiesForRecentQTRPeriod(String totalLiabilitiesForRecentQTRPeriod) {
		this.totalLiabilitiesForRecentQTRPeriod = totalLiabilitiesForRecentQTRPeriod;
	}

	public String getTotalLiabilitiesForRecentQTRPeriod_1() {
		return totalLiabilitiesForRecentQTRPeriod_1;
	}

	public void setTotalLiabilitiesForRecentQTRPeriod_1(String totalLiabilitiesForRecentQTRPeriod_1) {
		this.totalLiabilitiesForRecentQTRPeriod_1 = totalLiabilitiesForRecentQTRPeriod_1;
	}

	public String getTotalLiabilitiesForRecentQTRPeriod_2() {
		return totalLiabilitiesForRecentQTRPeriod_2;
	}

	public void setTotalLiabilitiesForRecentQTRPeriod_2(String totalLiabilitiesForRecentQTRPeriod_2) {
		this.totalLiabilitiesForRecentQTRPeriod_2 = totalLiabilitiesForRecentQTRPeriod_2;
	}

	public String getTotalCommonEquityForRecentQTRPeriod() {
		return totalCommonEquityForRecentQTRPeriod;
	}

	public void setTotalCommonEquityForRecentQTRPeriod(String totalCommonEquityForRecentQTRPeriod) {
		this.totalCommonEquityForRecentQTRPeriod = totalCommonEquityForRecentQTRPeriod;
	}

	public String getTotalCommonEquityForRecentQTRPeriod_1() {
		return totalCommonEquityForRecentQTRPeriod_1;
	}

	public void setTotalCommonEquityForRecentQTRPeriod_1(String totalCommonEquityForRecentQTRPeriod_1) {
		this.totalCommonEquityForRecentQTRPeriod_1 = totalCommonEquityForRecentQTRPeriod_1;
	}

	public String getTotalCommonEquityForRecentQTRPeriod_2() {
		return totalCommonEquityForRecentQTRPeriod_2;
	}

	public void setTotalCommonEquityForRecentQTRPeriod_2(String totalCommonEquityForRecentQTRPeriod_2) {
		this.totalCommonEquityForRecentQTRPeriod_2 = totalCommonEquityForRecentQTRPeriod_2;
	}

	public String getReturnOnCommonEquityForRecentFiscalPeriod() {
		return returnOnCommonEquityForRecentFiscalPeriod;
	}

	public void setReturnOnCommonEquityForRecentFiscalPeriod(String returnOnCommonEquityForRecentFiscalPeriod) {
		this.returnOnCommonEquityForRecentFiscalPeriod = returnOnCommonEquityForRecentFiscalPeriod;
	}

	public String getReturnOnCommonEquityForRecentFiscalPeriod_1() {
		return returnOnCommonEquityForRecentFiscalPeriod_1;
	}

	public void setReturnOnCommonEquityForRecentFiscalPeriod_1(String returnOnCommonEquityForRecentFiscalPeriod_1) {
		this.returnOnCommonEquityForRecentFiscalPeriod_1 = returnOnCommonEquityForRecentFiscalPeriod_1;
	}

	public String getReturnOnCommonEquityForRecentFiscalPeriod_2() {
		return returnOnCommonEquityForRecentFiscalPeriod_2;
	}

	public void setReturnOnCommonEquityForRecentFiscalPeriod_2(String returnOnCommonEquityForRecentFiscalPeriod_2) {
		this.returnOnCommonEquityForRecentFiscalPeriod_2 = returnOnCommonEquityForRecentFiscalPeriod_2;
	}

	public String getReturnOnAssetsForRecentFiscalPeriod() {
		return returnOnAssetsForRecentFiscalPeriod;
	}

	public void setReturnOnAssetsForRecentFiscalPeriod(String returnOnAssetsForRecentFiscalPeriod) {
		this.returnOnAssetsForRecentFiscalPeriod = returnOnAssetsForRecentFiscalPeriod;
	}

	public String getReturnOnAssetsForRecentFiscalPeriod_1() {
		return returnOnAssetsForRecentFiscalPeriod_1;
	}

	public void setReturnOnAssetsForRecentFiscalPeriod_1(String returnOnAssetsForRecentFiscalPeriod_1) {
		this.returnOnAssetsForRecentFiscalPeriod_1 = returnOnAssetsForRecentFiscalPeriod_1;
	}

	public String getReturnOnAssetsForRecentFiscalPeriod_2() {
		return returnOnAssetsForRecentFiscalPeriod_2;
	}

	public void setReturnOnAssetsForRecentFiscalPeriod_2(String returnOnAssetsForRecentFiscalPeriod_2) {
		this.returnOnAssetsForRecentFiscalPeriod_2 = returnOnAssetsForRecentFiscalPeriod_2;
	}

	public String getRatioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod() {
		return ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod;
	}

	public void setRatioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod(
			String ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod) {
		this.ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod = ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod;
	}

	public String getRatioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1() {
		return ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1;
	}

	public void setRatioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1(
			String ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1) {
		this.ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1 = ratioOfBookValueAndSharesOutstandingForRecentFiscalYearPeriod_1;
	}

	public String getPreTaxMarginForRecentFiscalPeriod() {
		return preTaxMarginForRecentFiscalPeriod;
	}

	public void setPreTaxMarginForRecentFiscalPeriod(String preTaxMarginForRecentFiscalPeriod) {
		this.preTaxMarginForRecentFiscalPeriod = preTaxMarginForRecentFiscalPeriod;
	}

	public String getPreTaxMarginForRecentFiscalPeriod_period2recent() {
		return preTaxMarginForRecentFiscalPeriod_period2recent;
	}

	public void setPreTaxMarginForRecentFiscalPeriod_period2recent(
			String preTaxMarginForRecentFiscalPeriod_period2recent) {
		this.preTaxMarginForRecentFiscalPeriod_period2recent = preTaxMarginForRecentFiscalPeriod_period2recent;
	}

	public String getPreTaxMarginForRecentFiscalPeriod_period3recent() {
		return preTaxMarginForRecentFiscalPeriod_period3recent;
	}

	public void setPreTaxMarginForRecentFiscalPeriod_period3recent(
			String preTaxMarginForRecentFiscalPeriod_period3recent) {
		this.preTaxMarginForRecentFiscalPeriod_period3recent = preTaxMarginForRecentFiscalPeriod_period3recent;
	}

	public String getRatioOfRecentAnnualCashFlowAndShare() {
		return ratioOfRecentAnnualCashFlowAndShare;
	}

	public void setRatioOfRecentAnnualCashFlowAndShare(String ratioOfRecentAnnualCashFlowAndShare) {
		this.ratioOfRecentAnnualCashFlowAndShare = ratioOfRecentAnnualCashFlowAndShare;
	}

	public String getRatioOfRecentAnnualCashFlowAndShare1() {
		return ratioOfRecentAnnualCashFlowAndShare1;
	}

	public void setRatioOfRecentAnnualCashFlowAndShare1(String ratioOfRecentAnnualCashFlowAndShare1) {
		this.ratioOfRecentAnnualCashFlowAndShare1 = ratioOfRecentAnnualCashFlowAndShare1;
	}

	public String getRecentQTRBookValuePerCommonShare() {
		return recentQTRBookValuePerCommonShare;
	}

	public void setRecentQTRBookValuePerCommonShare(String recentQTRBookValuePerCommonShare) {
		this.recentQTRBookValuePerCommonShare = recentQTRBookValuePerCommonShare;
	}

	public String getRecentQTRBookValuePerCommonShare_1() {
		return recentQTRBookValuePerCommonShare_1;
	}

	public void setRecentQTRBookValuePerCommonShare_1(String recentQTRBookValuePerCommonShare_1) {
		this.recentQTRBookValuePerCommonShare_1 = recentQTRBookValuePerCommonShare_1;
	}

	public String getRecentQTRBookValuePerCommonShare_2() {
		return recentQTRBookValuePerCommonShare_2;
	}

	public void setRecentQTRBookValuePerCommonShare_2(String recentQTRBookValuePerCommonShare_2) {
		this.recentQTRBookValuePerCommonShare_2 = recentQTRBookValuePerCommonShare_2;
	}

	public String getNetMarginForRecentFiscalPeriod() {
		return netMarginForRecentFiscalPeriod;
	}

	public void setNetMarginForRecentFiscalPeriod(String netMarginForRecentFiscalPeriod) {
		this.netMarginForRecentFiscalPeriod = netMarginForRecentFiscalPeriod;
	}

	public String getNetMarginForRecentFiscalPeriod2() {
		return netMarginForRecentFiscalPeriod2;
	}

	public void setNetMarginForRecentFiscalPeriod2(String netMarginForRecentFiscalPeriod2) {
		this.netMarginForRecentFiscalPeriod2 = netMarginForRecentFiscalPeriod2;
	}

	public String getNetMarginForRecentFiscalPeriod3() {
		return netMarginForRecentFiscalPeriod3;
	}

	public void setNetMarginForRecentFiscalPeriod3(String netMarginForRecentFiscalPeriod3) {
		this.netMarginForRecentFiscalPeriod3 = netMarginForRecentFiscalPeriod3;
	}

	public String getOperatingMarginForRecentFiscalPeriod() {
		return operatingMarginForRecentFiscalPeriod;
	}

	public void setOperatingMarginForRecentFiscalPeriod(String operatingMarginForRecentFiscalPeriod) {
		this.operatingMarginForRecentFiscalPeriod = operatingMarginForRecentFiscalPeriod;
	}

	public String getOperatingMarginForRecentFiscalPeriod2() {
		return operatingMarginForRecentFiscalPeriod2;
	}

	public void setOperatingMarginForRecentFiscalPeriod2(String operatingMarginForRecentFiscalPeriod2) {
		this.operatingMarginForRecentFiscalPeriod2 = operatingMarginForRecentFiscalPeriod2;
	}

	public String getOperatingMarginForRecentFiscalPeriod3() {
		return operatingMarginForRecentFiscalPeriod3;
	}

	public void setOperatingMarginForRecentFiscalPeriod3(String operatingMarginForRecentFiscalPeriod3) {
		this.operatingMarginForRecentFiscalPeriod3 = operatingMarginForRecentFiscalPeriod3;
	}

	public String getInventoryTurnover() {
		return inventoryTurnover;
	}

	public void setInventoryTurnover(String inventoryTurnover) {
		this.inventoryTurnover = inventoryTurnover;
	}

	public String getInventoryTurnoverPeriod2() {
		return inventoryTurnoverPeriod2;
	}

	public void setInventoryTurnoverPeriod2(String inventoryTurnoverPeriod2) {
		this.inventoryTurnoverPeriod2 = inventoryTurnoverPeriod2;
	}

	public String getInventoryTurnoverPeriod3() {
		return inventoryTurnoverPeriod3;
	}

	public void setInventoryTurnoverPeriod3(String inventoryTurnoverPeriod3) {
		this.inventoryTurnoverPeriod3 = inventoryTurnoverPeriod3;
	}

	public String getRecentQTRCurrentRatio() {
		return recentQTRCurrentRatio;
	}

	public void setRecentQTRCurrentRatio(String recentQTRCurrentRatio) {
		this.recentQTRCurrentRatio = recentQTRCurrentRatio;
	}

	public String getRecentQTRCurrentRatioForPeriod1() {
		return recentQTRCurrentRatioForPeriod1;
	}

	public void setRecentQTRCurrentRatioForPeriod1(String recentQTRCurrentRatioForPeriod1) {
		this.recentQTRCurrentRatioForPeriod1 = recentQTRCurrentRatioForPeriod1;
	}

	public String getRecentQTRCurrentRatioForPeriod2() {
		return recentQTRCurrentRatioForPeriod2;
	}

	public void setRecentQTRCurrentRatioForPeriod2(String recentQTRCurrentRatioForPeriod2) {
		this.recentQTRCurrentRatioForPeriod2 = recentQTRCurrentRatioForPeriod2;
	}

	public String getRecentQTRLongTermDebtToTotalCapitalization() {
		return recentQTRLongTermDebtToTotalCapitalization;
	}

	public void setRecentQTRLongTermDebtToTotalCapitalization(String recentQTRLongTermDebtToTotalCapitalization) {
		this.recentQTRLongTermDebtToTotalCapitalization = recentQTRLongTermDebtToTotalCapitalization;
	}

	public String getRecentQTRLongTermDebtToTotalCapitalization1() {
		return recentQTRLongTermDebtToTotalCapitalization1;
	}

	public void setRecentQTRLongTermDebtToTotalCapitalization1(String recentQTRLongTermDebtToTotalCapitalization1) {
		this.recentQTRLongTermDebtToTotalCapitalization1 = recentQTRLongTermDebtToTotalCapitalization1;
	}

	public String getRecentQTRLongTermDebtToTotalCapitalization2() {
		return recentQTRLongTermDebtToTotalCapitalization2;
	}

	public void setRecentQTRLongTermDebtToTotalCapitalization2(String recentQTRLongTermDebtToTotalCapitalization2) {
		this.recentQTRLongTermDebtToTotalCapitalization2 = recentQTRLongTermDebtToTotalCapitalization2;
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

	public String getRecentQTRQuickRatio() {
		return recentQTRQuickRatio;
	}

	public void setRecentQTRQuickRatio(String recentQTRQuickRatio) {
		this.recentQTRQuickRatio = recentQTRQuickRatio;
	}

	public String getRecentQTRQuickRatio1() {
		return recentQTRQuickRatio1;
	}

	public void setRecentQTRQuickRatio1(String recentQTRQuickRatio1) {
		this.recentQTRQuickRatio1 = recentQTRQuickRatio1;
	}

	public String getRecentQTRQuickRatio2() {
		return recentQTRQuickRatio2;
	}

	public void setRecentQTRQuickRatio2(String recentQTRQuickRatio2) {
		this.recentQTRQuickRatio2 = recentQTRQuickRatio2;
	}

	public String getRatioOfRecentQTRLongTermDebtAndRecentQTREquity() {
		return ratioOfRecentQTRLongTermDebtAndRecentQTREquity;
	}

	public void setRatioOfRecentQTRLongTermDebtAndRecentQTREquity(
			String ratioOfRecentQTRLongTermDebtAndRecentQTREquity) {
		this.ratioOfRecentQTRLongTermDebtAndRecentQTREquity = ratioOfRecentQTRLongTermDebtAndRecentQTREquity;
	}

	public String getRatioOfRecentQTRLongTermDebtAndRecentQTREquity1() {
		return ratioOfRecentQTRLongTermDebtAndRecentQTREquity1;
	}

	public void setRatioOfRecentQTRLongTermDebtAndRecentQTREquity1(
			String ratioOfRecentQTRLongTermDebtAndRecentQTREquity1) {
		this.ratioOfRecentQTRLongTermDebtAndRecentQTREquity1 = ratioOfRecentQTRLongTermDebtAndRecentQTREquity1;
	}

	public String getRatioOfRecentQTRLongTermDebtAndRecentQTREquity2() {
		return ratioOfRecentQTRLongTermDebtAndRecentQTREquity2;
	}

	public void setRatioOfRecentQTRLongTermDebtAndRecentQTREquity2(
			String ratioOfRecentQTRLongTermDebtAndRecentQTREquity2) {
		this.ratioOfRecentQTRLongTermDebtAndRecentQTREquity2 = ratioOfRecentQTRLongTermDebtAndRecentQTREquity2;
	}

	public String getDifferenceOfTwelveMonthPayoutAndFiveYearAvgPayout() {
		return differenceOfTwelveMonthPayoutAndFiveYearAvgPayout;
	}

	public void setDifferenceOfTwelveMonthPayoutAndFiveYearAvgPayout(
			String differenceOfTwelveMonthPayoutAndFiveYearAvgPayout) {
		this.differenceOfTwelveMonthPayoutAndFiveYearAvgPayout = differenceOfTwelveMonthPayoutAndFiveYearAvgPayout;
	}

	public String getQtrEPSGrowth() {
		return qtrEPSGrowth;
	}

	public void setQtrEPSGrowth(String qtrEPSGrowth) {
		this.qtrEPSGrowth = qtrEPSGrowth;
	}

	public String getQtrEPSGrowth1() {
		return qtrEPSGrowth1;
	}

	public void setQtrEPSGrowth1(String qtrEPSGrowth1) {
		this.qtrEPSGrowth1 = qtrEPSGrowth1;
	}

	public String getQtrEPSGrowth2() {
		return qtrEPSGrowth2;
	}

	public void setQtrEPSGrowth2(String qtrEPSGrowth2) {
		this.qtrEPSGrowth2 = qtrEPSGrowth2;
	}

	public String getQtrEPSGrowth3() {
		return qtrEPSGrowth3;
	}

	public void setQtrEPSGrowth3(String qtrEPSGrowth3) {
		this.qtrEPSGrowth3 = qtrEPSGrowth3;
	}

	public String getRatioOfCurrentPriceAndTTMOfTotalRevenues() {
		return ratioOfCurrentPriceAndTTMOfTotalRevenues;
	}

	public void setRatioOfCurrentPriceAndTTMOfTotalRevenues(String ratioOfCurrentPriceAndTTMOfTotalRevenues) {
		this.ratioOfCurrentPriceAndTTMOfTotalRevenues = ratioOfCurrentPriceAndTTMOfTotalRevenues;
	}

	public String getPriceToEarningForEPSGrowthRatio() {
		return priceToEarningForEPSGrowthRatio;
	}

	public void setPriceToEarningForEPSGrowthRatio(String priceToEarningForEPSGrowthRatio) {
		this.priceToEarningForEPSGrowthRatio = priceToEarningForEPSGrowthRatio;
	}

	public String getRecentCompletedQTR() {
		return recentCompletedQTR;
	}

	public void setRecentCompletedQTR(String recentCompletedQTR) {
		this.recentCompletedQTR = recentCompletedQTR;
	}

	public String getRecentCompletedQTRThreeMonths() {
		return recentCompletedQTRThreeMonths;
	}

	public void setRecentCompletedQTRThreeMonths(String recentCompletedQTRThreeMonths) {
		this.recentCompletedQTRThreeMonths = recentCompletedQTRThreeMonths;
	}

	public String getRecentCompletedQTRSixMonths() {
		return recentCompletedQTRSixMonths;
	}

	public void setRecentCompletedQTRSixMonths(String recentCompletedQTRSixMonths) {
		this.recentCompletedQTRSixMonths = recentCompletedQTRSixMonths;
	}
}