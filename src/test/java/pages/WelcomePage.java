package pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.CommonMethods;

public class WelcomePage {  
	
	//WebDriver driver;
	 //@FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/h1")
    // private WebElement LogyourselfLink;

	 public CommonMethods CM;
	 public void clickLogyourselfLink(){
		 
		// driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		  System.out.println("Welcome page");
		CM = new CommonMethods();
		
		CM.click("//*[@id='bodyContent']/div/div[1]/a[1]/u");
	}
	
		

	
	
}
