package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CommonMethods;

public class CreateAccountPage {
	private WebDriver driver;
	public CommonMethods CM;
	

	
//	public CreateAccountPage() {
//		this.driver = driver;
//		CM = new CommonMethods();
//		
//	}

public void clickCreateAccount(){
	System.out.println("Inside CreateAccPage");
	CM = new CommonMethods();
	CM.click(".//*[@id='bodyContent']/div/div[1]/a[2]/u");
}
	public void testcase01() throws InterruptedException
	{
		
		CM=new CommonMethods();

		CM.click(".//*[@id='bodyContent']/div/div[1]/a[2]/u");
		System.out.println("Click the Create An Account");
		CM.click(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]");
	    System.out.println("Click the Gender");
	    CM.sendvalue(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input", "FirstName");
	    System.out.println("Enter the FirstName");
	    CM.sendvalue(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input","LastName");
	    System.out.println("Enter the LastName");
	    CM.sendvalue(".//*[@id='dob']","Date Of Birth");
	    System.out.println("Date Of Birth");
	    CM.sendvalue(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[5]/td[2]/input","E-mail Address");
	    System.out.println("E-mail Address");
	    CM.sendvalue(".//*[@id='bodyContent']/form/div/div[3]/table/tbody/tr/td[2]/input","Company Name");
		System.out.println("enter the Company Name");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[1]/td[2]/input","Street Address");
		System.out.println("enter the Street Address");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[2]/td[2]/input","SubUrb");
		System.out.println("enter the SubUrb");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[3]/td[2]/input","Post Code");
		System.out.println("enter the Post Code");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[4]/td[2]/input","City");
		System.out.println("enter  the City");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[5]/td[2]/input","State/Province");
		System.out.println("enter  the State/Province");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select","Country");
		System.out.println("Select  the Country");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[1]/td[2]/input","Telephone Number");
		System.out.println("enter  the Telephone Number");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[2]/td[2]/input","Fax Number");
		System.out.println("enter  the Fax Number");
		CM.click(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input");
		System.out.println("Click The NewsLetter");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input","Password");
		System.out.println("enter  the Password");
		CM.sendvalue(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input","Password Confirmation");
		System.out.println("enter  the Password Confirmation");
		CM.click(".//*[@id='tdb4']");
	    System.out.println("Click the Continue");
	    Thread.sleep(5000);
		String expectedText = "Welcome to iBusiness";
		String actualText = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		System.out.println("ExpectedText="+expectedText+"\n"+"ActualText="+actualText);

	}}

