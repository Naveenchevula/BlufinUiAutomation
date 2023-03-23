package utilities;

import org.jboss.aerogear.security.otp.Totp;

public class TOTPGenerator {
	/**
	 * Method is used to get the TOTP based on the security token
	 * 
	 * @return
	 */
	public static String getTwoFactorCode() {

		Totp totp = new Totp("MYYTEMJSGNSGMLJXMFTDSLLEG4YDGLLFGA4GELJQMU4GKYTBGVTDGZDEMY"); // 2FA secret key
		String twoFactorCode = totp.now(); // Generated 2FA code here
		return twoFactorCode;
	}
}
