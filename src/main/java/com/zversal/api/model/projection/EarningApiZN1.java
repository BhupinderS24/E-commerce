package com.zversal.api.model.projection;

/**This interface is used to projecting out the required fields for Earning Api from {@link ZN1}
 * @author bhupinder
 *
 */
public interface EarningApiZN1 {

	 String getCurrentQTREndDate();

	 String getCurrentQTR_EPS();

	 String getNextQTREndDate();

	 String getNextQTR_EPS();

	 String getCurrentFYEndDate();

	 String getCurrentFY_EPS();

	 String getNextFYEndDate();

	 String getNextFY_EPS();

	 String getNoOfCurrentQTR();

	 String getNoOfNextQTR();

	 String getNoOfCurrentFY();

	 String getNoOfNextFY();

	 String getCurrentQTRHighEPS();

	 String getNextQTRHighEPS();

	 String getCurrentFYHighEPS();

	 String getNextFYHighEPS();

	 String getCurrentQTRLowEPS();

	 String getNextQTRLowEPS();

	 String getCurrentFYLowEPS();

	 String getNextFYLowEPS();

	 String getCurrentFY_EPS1();

}
