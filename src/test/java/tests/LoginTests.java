package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CommonMethods;
import pages.LogOffPage;
import pages.SignInPage;
import pages.WelcomePage;

public class LoginTests  extends CommonMethods {
	
	String sURL="http://107.170.213.234/catalog/";
	String ExpectedText = "Welcome to iBusiness";
	public CommonMethods CM;
	WelcomePage WP;
	SignInPage SI;
	LogOffPage LOP;

@BeforeMethod
	public void setUp(){
	CM=new CommonMethods();
	
		CM.openBrowser("chrome");
		CM.openUrl(sURL);
		
	}
@AfterMethod
public void tearDown(){
	CM.closeBrowser();

}


@Test
public void testcase02(){
WP=new WelcomePage();
WP.clickLogyourselfLink();
SI=new SignInPage();
SI.Login("ecalix@test.com", "test123");
CM.verifyText(ExpectedText);
LOP=new LogOffPage();
LOP.clickLogoff();

}

	
}


