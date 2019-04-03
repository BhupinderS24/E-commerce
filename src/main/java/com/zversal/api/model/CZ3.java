package com.zversal.api.model;
/**
 * This class holds the details about CZ3 which is a member variable of class {@link CompanyInfoModel} and stored on MongoDB.
 * 
 * @author bhupinder
 *
 */
public class CZ3 {
private String	zacksMasterId;
private String	companyDescription;
public String getZacksMasterId() {
	return zacksMasterId;
}
public void setZacksMasterId(String zacksMasterId) {
	this.zacksMasterId = zacksMasterId;
}
public String getCompanyDescription() {
	return companyDescription;
}
public void setCompanyDescription(String companyDescription) {
	this.companyDescription = companyDescription;
}
}
