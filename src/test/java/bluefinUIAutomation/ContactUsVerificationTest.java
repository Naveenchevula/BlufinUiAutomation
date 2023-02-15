package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.ContactUsFuctionalityVerification;

public class ContactUsVerificationTest extends ContactUsFuctionalityVerification {
		@Test(priority = 5, description = " Test Description   = Verification of contact us fuctionality form lobby and back office aswell  ")
		public void ContactUsFuctionalityVerification() throws Throwable {

			ContactusVerificationMethod();

		}

	}

