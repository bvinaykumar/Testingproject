package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CommonMethods{
public static WebDriver driver;

public void openBrowser(String sBrowser){
	String browser = new String("Chrome");
			if (sBrowser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\seliniumproject\\chromedriver.exe");
			  driver = new ChromeDriver();
			System.out.println("opening Chrome"); 
		}
		
		else
		{
				System.out.println("Please open a browser chrome");
				Assert.fail();
			}
		}
			public void closeBrowser(){
				driver.quit();
				System.out.println("close Browser");
				
			}
		
		public void openUrl(String sUrl){
			
			driver.get(sUrl);
			System.out.println("Opening URL");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
					
		}
		public void click(String name){
			try{
			System.out.println(name);
			driver.findElement(By.xpath(name)).click();
			 System.out.println(name+ "click log your self link");
			 try{
				
			  //driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
				 Thread.sleep(3000);
				 
		}catch(InterruptedException e){
			e.printStackTrace();
		}
			}catch(Exception e){
				System.out.println(name+ "not clicked");
				e.printStackTrace();
				Assert.fail();
			}
		}
//		public void dropdown(String sxpath, String svalue){
//			Select dropdown= new Select(mySelectElement);
//		}
		
		public void sendvalue(String sxpath, String svalue){
			try{
				driver.findElement(By.xpath(sxpath)).click();
		    System.out.println("click log your self link");
		    driver.findElement(By.xpath(sxpath)).sendKeys(svalue);
		    System.out.println("Enter the password");
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(svalue+ "notentered");
				Assert.fail();
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		
		}
			
		public void click(WebElement slocator){
			try{
				slocator.click();System.out.println(slocator+ "clicked");
				try{
					Thread.sleep(3000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}catch(Exception e){
				System.out.println(slocator+ "xpath");
				Assert.fail();
			}
			
		}

 public void verifyText(String expected){
	 try{
		 driver.findElement(By.xpath(".//*[contains(text(),'"+ expected.trim() +"')]"));
		 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" verified");
		// return true;
	 }
	 catch(NoSuchElementException e){
		 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
		 Assert.fail("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
	 }
	 
 }
}



