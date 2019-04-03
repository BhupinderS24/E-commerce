package com.zversal.api.model;

import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details about ZN1 which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class ZN1 {
	private String ticker;
	private String company;
	private String currentQTREndDate;
	private String currentQTR_EPS;
	private String nextQTREndDate;
	private String nextQTR_EPS;
	private String currentFYEndDate;
	private String currentFY_EPS;
	private String nextFYEndDate;
	private String nextFY_EPS;
	private String noOfCurrentQTR;
	private String noOfNextQTR;
	private String noOfCurrentFY;
	private String noOfNextFY;
	private String currentQTRHighEPS;
	private String nextQTRHighEPS;
	private String currentFYHighEPS;
	private String nextFYHighEPS;
	private String currentQTRLowEPS;
	private String nextQTRLowEPS;
	private String currentFYLowEPS;
	private String nextFYLowEPS;
	private String threeQTRActualEPS;
	private String twoQTRActualEPS;
	private String lastFYActualEPS;
	private String currentFY_EPS1;
	@Field("currentQTR%Growth")
	private String currentQTRGrowth;
	@Field("nextQTR%Growth")
	private String nextQTRGrowth;
	@Field("currentFY%Growth")
	private String currentFYGrowth;
	@Field("nextFY%Growth")
	private String nextFYGrowth;
	private String longTermGrowth;
	private String noOfLTG;
	private String longTermGrowthHigh;
	private String longTermGrowthLow;
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
	public String getCurrentQTREndDate() {
		return currentQTREndDate;
	}
	public void setCurrentQTREndDate(String currentQTREndDate) {
		this.currentQTREndDate = currentQTREndDate;
	}
	public String getCurrentQTR_EPS() {
		return currentQTR_EPS;
	}
	public void setCurrentQTR_EPS(String currentQTR_EPS) {
		this.currentQTR_EPS = currentQTR_EPS;
	}
	public String getNextQTREndDate() {
		return nextQTREndDate;
	}
	public void setNextQTREndDate(String nextQTREndDate) {
		this.nextQTREndDate = nextQTREndDate;
	}
	public String getNextQTR_EPS() {
		return nextQTR_EPS;
	}
	public void setNextQTR_EPS(String nextQTR_EPS) {
		this.nextQTR_EPS = nextQTR_EPS;
	}
	public String getCurrentFYEndDate() {
		return currentFYEndDate;
	}
	public void setCurrentFYEndDate(String currentFYEndDate) {
		this.currentFYEndDate = currentFYEndDate;
	}
	public String getCurrentFY_EPS() {
		return currentFY_EPS;
	}
	public void setCurrentFY_EPS(String currentFY_EPS) {
		this.currentFY_EPS = currentFY_EPS;
	}
	public String getNextFYEndDate() {
		return nextFYEndDate;
	}
	public void setNextFYEndDate(String nextFYEndDate) {
		this.nextFYEndDate = nextFYEndDate;
	}
	public String getNextFY_EPS() {
		return nextFY_EPS;
	}
	public void setNextFY_EPS(String nextFY_EPS) {
		this.nextFY_EPS = nextFY_EPS;
	}
	public String getNoOfCurrentQTR() {
		return noOfCurrentQTR;
	}
	public void setNoOfCurrentQTR(String noOfCurrentQTR) {
		this.noOfCurrentQTR = noOfCurrentQTR;
	}
	public String getNoOfNextQTR() {
		return noOfNextQTR;
	}
	public void setNoOfNextQTR(String noOfNextQTR) {
		this.noOfNextQTR = noOfNextQTR;
	}
	public String getNoOfCurrentFY() {
		return noOfCurrentFY;
	}
	public void setNoOfCurrentFY(String noOfCurrentFY) {
		this.noOfCurrentFY = noOfCurrentFY;
	}
	public String getNoOfNextFY() {
		return noOfNextFY;
	}
	public void setNoOfNextFY(String noOfNextFY) {
		this.noOfNextFY = noOfNextFY;
	}
	public String getCurrentQTRHighEPS() {
		return currentQTRHighEPS;
	}
	public void setCurrentQTRHighEPS(String currentQTRHighEPS) {
		this.currentQTRHighEPS = currentQTRHighEPS;
	}
	public String getNextQTRHighEPS() {
		return nextQTRHighEPS;
	}
	public void setNextQTRHighEPS(String nextQTRHighEPS) {
		this.nextQTRHighEPS = nextQTRHighEPS;
	}
	public String getCurrentFYHighEPS() {
		return currentFYHighEPS;
	}
	public void setCurrentFYHighEPS(String currentFYHighEPS) {
		this.currentFYHighEPS = currentFYHighEPS;
	}
	public String getNextFYHighEPS() {
		return nextFYHighEPS;
	}
	public void setNextFYHighEPS(String nextFYHighEPS) {
		this.nextFYHighEPS = nextFYHighEPS;
	}
	public String getCurrentQTRLowEPS() {
		return currentQTRLowEPS;
	}
	public void setCurrentQTRLowEPS(String currentQTRLowEPS) {
		this.currentQTRLowEPS = currentQTRLowEPS;
	}
	public String getNextQTRLowEPS() {
		return nextQTRLowEPS;
	}
	public void setNextQTRLowEPS(String nextQTRLowEPS) {
		this.nextQTRLowEPS = nextQTRLowEPS;
	}
	public String getCurrentFYLowEPS() {
		return currentFYLowEPS;
	}
	public void setCurrentFYLowEPS(String currentFYLowEPS) {
		this.currentFYLowEPS = currentFYLowEPS;
	}
	public String getNextFYLowEPS() {
		return nextFYLowEPS;
	}
	public void setNextFYLowEPS(String nextFYLowEPS) {
		this.nextFYLowEPS = nextFYLowEPS;
	}
	public String getThreeQTRActualEPS() {
		return threeQTRActualEPS;
	}
	public void setThreeQTRActualEPS(String threeQTRActualEPS) {
		this.threeQTRActualEPS = threeQTRActualEPS;
	}
	public String getTwoQTRActualEPS() {
		return twoQTRActualEPS;
	}
	public void setTwoQTRActualEPS(String twoQTRActualEPS) {
		this.twoQTRActualEPS = twoQTRActualEPS;
	}
	public String getLastFYActualEPS() {
		return lastFYActualEPS;
	}
	public void setLastFYActualEPS(String lastFYActualEPS) {
		this.lastFYActualEPS = lastFYActualEPS;
	}
	public String getCurrentFY_EPS1() {
		return currentFY_EPS1;
	}
	public void setCurrentFY_EPS1(String currentFY_EPS1) {
		this.currentFY_EPS1 = currentFY_EPS1;
	}
	public String getCurrentQTRGrowth() {
		return currentQTRGrowth;
	}
	public void setCurrentQTRGrowth(String currentQTRGrowth) {
		this.currentQTRGrowth = currentQTRGrowth;
	}
	public String getNextQTRGrowth() {
		return nextQTRGrowth;
	}
	public void setNextQTRGrowth(String nextQTRGrowth) {
		this.nextQTRGrowth = nextQTRGrowth;
	}
	public String getCurrentFYGrowth() {
		return currentFYGrowth;
	}
	public void setCurrentFYGrowth(String currentFYGrowth) {
		this.currentFYGrowth = currentFYGrowth;
	}
	public String getNextFYGrowth() {
		return nextFYGrowth;
	}
	public void setNextFYGrowth(String nextFYGrowth) {
		this.nextFYGrowth = nextFYGrowth;
	}
	public String getLongTermGrowth() {
		return longTermGrowth;
	}
	public void setLongTermGrowth(String longTermGrowth) {
		this.longTermGrowth = longTermGrowth;
	}
	public String getNoOfLTG() {
		return noOfLTG;
	}
	public void setNoOfLTG(String noOfLTG) {
		this.noOfLTG = noOfLTG;
	}
	public String getLongTermGrowthHigh() {
		return longTermGrowthHigh;
	}
	public void setLongTermGrowthHigh(String longTermGrowthHigh) {
		this.longTermGrowthHigh = longTermGrowthHigh;
	}
	public String getLongTermGrowthLow() {
		return longTermGrowthLow;
	}
	public void setLongTermGrowthLow(String longTermGrowthLow) {
		this.longTermGrowthLow = longTermGrowthLow;
	}
	
}
