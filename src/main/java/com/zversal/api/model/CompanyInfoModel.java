package com.zversal.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
/**
 * This class holds the details that will be stored about Company on MongoDB.
 * 
 * @author dinuka
 *
 */
@Document(collection = "newCollection")
public class CompanyInfoModel {
	@Id
	private String id;
	@Field("Ticker")
	private String ticker;
	@Field("Z15")
	private Z15 z15;
	@Field("CZ2")
	private CZ2 cz2;
   
	@Field("ZN1")
	private ZN1 zn1;
	
	@Field("META")
	private META meta;
	@Field("SALES")
	private Sales sales;
	
	@Field("SALES PERC")
	private SalesPerc salesPerc;
	@Field("EPS")
	private EPS eps;
	@Field("EPS PERCENT")
	private EpsPercent epsPercent;
	@Field("ZN3")
	private ZN3 zn3;
	@Field("CZ1")
	private CZ1 cz1;
	@Field("ZK3")
	private ZK3 zk3;
	@Field("ZN5")
	private ZN5 zn5;
	@Field("Z2B")
	private Z2B z2B;
	@Field("Z6C")
	private Z6C z6c;
	
	@Field("COMPANY_iNFO")
	private ComapnyInfo comapnyInfo;
	@Field("DAILY")
	private DAILY daily;
	@Field("NAICS")
	private NAICS naics;
	
	@Field("SIC")
	private SIC sic;
	@Field("CZ3")
	private CZ3 cz3;
	@Field("Last Updated")
	private String lastUpdated;
	
	@Field("DVR")
	private DVR dvr;
    
	public CZ2 getCz2() {
		return cz2;
	}

	public void setCz2(CZ2 cz2) {
		this.cz2 = cz2;
	}

	public ZN3 getZn3() {
		return zn3;
	}

	public void setZn3(ZN3 zn3) {
		this.zn3 = zn3;
	}

	public CZ1 getCz1() {
		return cz1;
	}

	public void setCz1(CZ1 cz1) {
		this.cz1 = cz1;
	}

	public ZK3 getZk3() {
		return zk3;
	}

	public void setZk3(ZK3 zk3) {
		this.zk3 = zk3;
	}

	public ZN5 getZn5() {
		return zn5;
	}

	public void setZn5(ZN5 zn5) {
		this.zn5 = zn5;
	}

	public Z2B getZ2B() {
		return z2B;
	}

	public void setZ2b(Z2B z2b) {
		this.z2B = z2b;
	}

	public Z6C getZ6c() {
		return z6c;
	}

	public void setZ6c(Z6C z6c) {
		this.z6c = z6c;
	}

	public ComapnyInfo getComapnyInfo() {
		return comapnyInfo;
	}

	public void setComapnyInfo(ComapnyInfo comapnyInfo) {
		this.comapnyInfo = comapnyInfo;
	}

	public DAILY getDaily() {
		return daily;
	}

	public void setDaily(DAILY daily) {
		this.daily = daily;
	}

	public NAICS getNaics() {
		return naics;
	}

	public void setNaics(NAICS naics) {
		this.naics = naics;
	}

	public SIC getSic() {
		return sic;
	}

	public void setSic(SIC sic) {
		this.sic = sic;
	}

	public CZ3 getCz3() {
		return cz3;
	}

	public void setCz3(CZ3 cz3) {
		this.cz3 = cz3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public Z15 getZ15() {
		return z15;
	}

	public void setZ15(Z15 z15) {
		this.z15 = z15;
	}

	public CZ2 getCZ2() {
		return cz2;
	}

	public void setCZ2(CZ2 cZ2) {
		this.cz2 = cZ2;
	}

}
