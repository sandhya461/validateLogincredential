package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest{
	
  ElementFetch ele = new ElementFetch();
  HomePageEvents homePage = new HomePageEvents();
  LoginPageEvents loginPage = new LoginPageEvents();
  
  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("Entering into LoginPage");
	  homePage.loginButton();
	  
	  logger.info("Verifying if Login text is visible or not");
	  loginPage.verifyIfLoginPageIsLoaded();
	  
	  logger.info("enter the credentials");
	  loginPage.enterCredentials();
  }
}
