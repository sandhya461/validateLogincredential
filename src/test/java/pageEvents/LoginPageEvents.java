package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele = new ElementFetch();
	public void verifyIfLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Element not found");
		//to get a screenshot to make it fail i have given == 0 here
		//Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size() == 0, "Element not found");
	}

	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("testaccount1@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("test1");
	}
}
