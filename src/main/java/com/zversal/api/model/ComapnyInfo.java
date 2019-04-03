package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details about CompanyInfo which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class ComapnyInfo {
	@Field("ADDRESS4")
	private String address4;
	@Field("CIK")
	private String cik;

	@Field("PHONENUMBER")
	private String phoneNumber;

	@Field("SHORTNAME")
	private String shortName;
	@Field("MIC")
	private String mic;
	@Field("ZIPCODE")
	private String zipcode;
	@Field("LONGNAME")
	private String longName;
	@Field("EXCHANGECODE")
	private String exchangeCode;
	@Field("REGION")
	private String region;

	@Field("CUSIP")
	private String cusip;

	@Field("STATUS")
	private String status;

	@Field("FYE")
	private String fye;

	@Field("COUNTRYCODE")
	private String CountryCode;

	@Field("CITY")
	private String city;

	@Field("STATECODE")
	private String StateCode;

	@Field("COUNTRY")
	private String Country;

	@Field("FAXNUMBER")
	private String faxNumber;

	@Field("ADDRESS1")
	private String address1;
	@Field("ADDRESS3")
	private String address3;
	@Field("WEBSITE")
	private String website;
	@Field("ADDRESS2")
	private String address2;
	public String getAddress4() {
		return address4;
	}
	public void setAddress4(String address4) {
		this.address4 = address4;
	}
	public String getCik() {
		return cik;
	}
	public void setCik(String cik) {
		this.cik = cik;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getMic() {
		return mic;
	}
	public void setMic(String mic) {
		this.mic = mic;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getExchangeCode() {
		return exchangeCode;
	}
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCusip() {
		return cusip;
	}
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFye() {
		return fye;
	}
	public void setFye(String fye) {
		this.fye = fye;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return StateCode;
	}
	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

}
