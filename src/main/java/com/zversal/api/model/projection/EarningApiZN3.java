package com.zversal.api.model.projection;
/**This interface is used to projecting out the required fields for Earning Api from {@link ZN3}
 * @author bhupinder
 *
 */
public interface EarningApiZN3 {

	 String getCompany();

	 String getMostRecentQTREndDate();

	 String getMostRecentQTR_EPS();

	 String getActualEPSRecentQTR();

	 String getMostRecentQTRDifference();

	 String getMostRecentQTRSurprise();

	 String getOneQTRPriorEndDate();

	 String getOneQTRPriorEPS();

	 String getActualEPSOneQTR();

	 String getOneQTRPriorDiffernce();

	 String getOneQTRPriorSurprise();

	 String getTwoQTRPriorEndDate();

	 String getActualEPSTwoQTR();

	 String getTwoQTRPriorDiffernce();

	 String getTwoQTRPriorSurprise();

	 String getThreeQTRPriorEndDate();

	 String getThreeQTR_EPS();

	 String getActualEPSThreeQTR();

	 String getThreeQTRPriorDiffernce();

	 String getThreeQTRPriorSurprise();

}
