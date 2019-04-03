package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details about META which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class META {
	@Field("SymbologyType")
	private String symbologyType;
	@Field("Currency")
	private String currency;
	@Field("MarketTier")
	private String MarketTier;
	@Field("ProductType")
	private String ProductType;
	@Field("PrimaryMarketCode")
	private String PrimaryMarketCode;
	@Field("Country")
	private String Country;
	@Field("ListingMarket")
	private String ListingMarket;
	@Field("FinancialStatus")
	private String FinancialStatus;
	@Field("AlternateSymbol")
	private String AlternateSymbol;
	public String getSymbologyType() {
		return symbologyType;
	}
	public void setSymbologyType(String symbologyType) {
		this.symbologyType = symbologyType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMarketTier() {
		return MarketTier;
	}
	public void setMarketTier(String marketTier) {
		MarketTier = marketTier;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public String getPrimaryMarketCode() {
		return PrimaryMarketCode;
	}
	public void setPrimaryMarketCode(String primaryMarketCode) {
		PrimaryMarketCode = primaryMarketCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getListingMarket() {
		return ListingMarket;
	}
	public void setListingMarket(String listingMarket) {
		ListingMarket = listingMarket;
	}
	public String getFinancialStatus() {
		return FinancialStatus;
	}
	public void setFinancialStatus(String financialStatus) {
		FinancialStatus = financialStatus;
	}
	public String getAlternateSymbol() {
		return AlternateSymbol;
	}
	public void setAlternateSymbol(String alternateSymbol) {
		AlternateSymbol = alternateSymbol;
	}
	
}
