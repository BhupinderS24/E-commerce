package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details about ZN3 which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class ZN3 {
	//ZN3
	private String ticker;
	private String company;
	private String mostRecentQTREndDate;
	private String mostRecentQTR_EPS;
	private String actualEPSRecentQTR;
	private String mostRecentQTRDifference;
	@Field("mostRecentQTRSurprise%")
	private String mostRecentQTRSurprise;
	private String oneQTRPriorEndDate;
	private String oneQTRPriorEPS;
	private String actualEPSOneQTR;
	private String oneQTRPriorDiffernce;
	@Field("oneQTRPriorSurprise%")
	private String oneQTRPriorSurprise;
	private String twoQTRPriorEndDate;
	private String twoQTRPriorEPS;
	private String actualEPSTwoQTR;
	private String twoQTRPriorDiffernce;
	@Field("twoQTRPriorSurprise%")
	private String twoQTRPriorSurprise;
	private String threeQTRPriorEndDate;
	private String threeQTR_EPS;
	private String actualEPSThreeQTR;
	private String threeQTRPriorDiffernce;
	@Field("threeQTRPriorSurprise%")
	private String threeQTRPriorSurprise;
	private String fourQTRPriorEndDate;
	private String fourQTRPriorEPS;
	private String actualEPSFourQTR;
	private String fourQTRPriorDiffernce;
	@Field("fourQTRPriorSurprise%")
	private String fourQTRPriorSurprise;
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
	public String getMostRecentQTREndDate() {
		return mostRecentQTREndDate;
	}
	public void setMostRecentQTREndDate(String mostRecentQTREndDate) {
		this.mostRecentQTREndDate = mostRecentQTREndDate;
	}
	public String getMostRecentQTR_EPS() {
		return mostRecentQTR_EPS;
	}
	public void setMostRecentQTR_EPS(String mostRecentQTR_EPS) {
		this.mostRecentQTR_EPS = mostRecentQTR_EPS;
	}
	public String getActualEPSRecentQTR() {
		return actualEPSRecentQTR;
	}
	public void setActualEPSRecentQTR(String actualEPSRecentQTR) {
		this.actualEPSRecentQTR = actualEPSRecentQTR;
	}
	public String getMostRecentQTRDifference() {
		return mostRecentQTRDifference;
	}
	public void setMostRecentQTRDifference(String mostRecentQTRDifference) {
		this.mostRecentQTRDifference = mostRecentQTRDifference;
	}
	public String getMostRecentQTRSurprise() {
		return mostRecentQTRSurprise;
	}
	public void setMostRecentQTRSurprise(String mostRecentQTRSurprise) {
		this.mostRecentQTRSurprise = mostRecentQTRSurprise;
	}
	public String getOneQTRPriorEndDate() {
		return oneQTRPriorEndDate;
	}
	public void setOneQTRPriorEndDate(String oneQTRPriorEndDate) {
		this.oneQTRPriorEndDate = oneQTRPriorEndDate;
	}
	public String getOneQTRPriorEPS() {
		return oneQTRPriorEPS;
	}
	public void setOneQTRPriorEPS(String oneQTRPriorEPS) {
		this.oneQTRPriorEPS = oneQTRPriorEPS;
	}
	public String getActualEPSOneQTR() {
		return actualEPSOneQTR;
	}
	public void setActualEPSOneQTR(String actualEPSOneQTR) {
		this.actualEPSOneQTR = actualEPSOneQTR;
	}
	public String getOneQTRPriorDiffernce() {
		return oneQTRPriorDiffernce;
	}
	public void setOneQTRPriorDiffernce(String oneQTRPriorDiffernce) {
		this.oneQTRPriorDiffernce = oneQTRPriorDiffernce;
	}
	public String getOneQTRPriorSurprise() {
		return oneQTRPriorSurprise;
	}
	public void setOneQTRPriorSurprise(String oneQTRPriorSurprise) {
		this.oneQTRPriorSurprise = oneQTRPriorSurprise;
	}
	public String getTwoQTRPriorEndDate() {
		return twoQTRPriorEndDate;
	}
	public void setTwoQTRPriorEndDate(String twoQTRPriorEndDate) {
		this.twoQTRPriorEndDate = twoQTRPriorEndDate;
	}
	public String getTwoQTRPriorEPS() {
		return twoQTRPriorEPS;
	}
	public void setTwoQTRPriorEPS(String twoQTRPriorEPS) {
		this.twoQTRPriorEPS = twoQTRPriorEPS;
	}
	public String getActualEPSTwoQTR() {
		return actualEPSTwoQTR;
	}
	public void setActualEPSTwoQTR(String actualEPSTwoQTR) {
		this.actualEPSTwoQTR = actualEPSTwoQTR;
	}
	public String getTwoQTRPriorDiffernce() {
		return twoQTRPriorDiffernce;
	}
	public void setTwoQTRPriorDiffernce(String twoQTRPriorDiffernce) {
		this.twoQTRPriorDiffernce = twoQTRPriorDiffernce;
	}
	public String getTwoQTRPriorSurprise() {
		return twoQTRPriorSurprise;
	}
	public void setTwoQTRPriorSurprise(String twoQTRPriorSurprise) {
		this.twoQTRPriorSurprise = twoQTRPriorSurprise;
	}
	public String getThreeQTRPriorEndDate() {
		return threeQTRPriorEndDate;
	}
	public void setThreeQTRPriorEndDate(String threeQTRPriorEndDate) {
		this.threeQTRPriorEndDate = threeQTRPriorEndDate;
	}
	public String getThreeQTR_EPS() {
		return threeQTR_EPS;
	}
	public void setThreeQTR_EPS(String threeQTR_EPS) {
		this.threeQTR_EPS = threeQTR_EPS;
	}
	public String getActualEPSThreeQTR() {
		return actualEPSThreeQTR;
	}
	public void setActualEPSThreeQTR(String actualEPSThreeQTR) {
		this.actualEPSThreeQTR = actualEPSThreeQTR;
	}
	public String getThreeQTRPriorDiffernce() {
		return threeQTRPriorDiffernce;
	}
	public void setThreeQTRPriorDiffernce(String threeQTRPriorDiffernce) {
		this.threeQTRPriorDiffernce = threeQTRPriorDiffernce;
	}
	public String getThreeQTRPriorSurprise() {
		return threeQTRPriorSurprise;
	}
	public void setThreeQTRPriorSurprise(String threeQTRPriorSurprise) {
		this.threeQTRPriorSurprise = threeQTRPriorSurprise;
	}
	public String getFourQTRPriorEndDate() {
		return fourQTRPriorEndDate;
	}
	public void setFourQTRPriorEndDate(String fourQTRPriorEndDate) {
		this.fourQTRPriorEndDate = fourQTRPriorEndDate;
	}
	public String getFourQTRPriorEPS() {
		return fourQTRPriorEPS;
	}
	public void setFourQTRPriorEPS(String fourQTRPriorEPS) {
		this.fourQTRPriorEPS = fourQTRPriorEPS;
	}
	public String getActualEPSFourQTR() {
		return actualEPSFourQTR;
	}
	public void setActualEPSFourQTR(String actualEPSFourQTR) {
		this.actualEPSFourQTR = actualEPSFourQTR;
	}
	public String getFourQTRPriorDiffernce() {
		return fourQTRPriorDiffernce;
	}
	public void setFourQTRPriorDiffernce(String fourQTRPriorDiffernce) {
		this.fourQTRPriorDiffernce = fourQTRPriorDiffernce;
	}
	public String getFourQTRPriorSurprise() {
		return fourQTRPriorSurprise;
	}
	public void setFourQTRPriorSurprise(String fourQTRPriorSurprise) {
		this.fourQTRPriorSurprise = fourQTRPriorSurprise;
	}

}
