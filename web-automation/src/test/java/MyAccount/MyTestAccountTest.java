package MyAccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestAccountTest {
	

	WebDriver driver;
	//String browsername = "chrome";
	
	@Parameters("browsername")
	@BeforeTest
	public void lauch_browser(String browsername) throws Exception{
     if (browsername.equals("firefox")) {
    	 System.setProperty("webdriver.gecko.driver", "C:\\\\selenium downloads\\\\Firefox\\\\geckodriver.exe");
    	 driver = new FirefoxDriver();
     }else if (browsername.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\selenium downloads\\google chrome\\chromedriver.exe");
    	 ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized");
    	 driver = new ChromeDriver(options);
     } else if(browsername.equals("edge")){
    	 System.setProperty("webdriver.edge.driver", "C:\\selenium downloads\\microsoft edge\\MicrosoftWebDriver.exe");
    	   driver=new EdgeDriver();
    	   Thread.sleep(9000);
    	   driver.manage().window().maximize();
     }else {
    	 throw new Exception("Invalide browsrnmae");
     }
	}
		 
	
	@Parameters("url")
	 @BeforeClass
	 public void enteringurl(String url){
	  driver.get(url);
	//  String title=driver.getTitle();
	//  Assert.assertEquals("maplin | The First Choice For Smart Home", title);
	 }
	 @Test
	 public void Account() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div[6]/ul/li[1]/a/span")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("j_username")).sendKeys("phaneendra.gondi@maplin.co.uk");
		 driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/div[2]/div/div[2]/label")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("j_password")).sendKeys("Gondi08676");
		 driver.findElement(By.id("sign-in")).click();
		/* //driver.switchTo().frame(0);
		 if(driver.switchTo().alert() != null)
		 {
		     Alert alert = driver.switchTo().alert();
		     String alertText = alert.getText();
		     alert.dismiss(); // alert.accept();
            //driver.findElement(By.xpath("//*[@id=\"acsMainInvite\"]/div/a[1]")).click();
		 }
			// driver.switchTo().alert().dismiss();
*/		 
		 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div[6]/ul/li[1]/a/span")).click();
		 
		 // STARTS Capturing THE ELEMENTS
		 
		 String home =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[1]/ul/li[1]/a/i")).getText(); 
		 String profile =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[1]/ul/li[2]/a/span")).getText();
		 String myaccount =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[1]/h2")).getText(); 
	String accountname =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/h2")).getText();
	
	String orderhistory =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[1]/div/ul/li[2]/a")).getText();
	String addressbook =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[1]/div/ul/li[3]/a")).getText();
	
	String personaldetails =  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/h3")).getText();
	
	String name = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/label")).getText();
	String phonenumber = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/div[1]/label")).getText();
	
	String editperdetails = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[1]/div/div[1]/div[3]/a")).getText();
	
	
	String Logindetails = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[2]/h3")).getText();
	String Email = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/label")).getText();
	String editemail = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/a")).getText();
	
	String password = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/label")).getText();
	String changepassword = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/a")).getText();
	String marketingpref = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[3]/h3")).getText();
	String marketingtext = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[3]/form/div/label")).getText();
	 
	//System.out.println(marketingtext);
	
	// ends capturing of elements ---------
	
// verification started ----------
	Assert.assertEquals("home", home);
	     Assert.assertEquals("Profile", profile);
	     Assert.assertEquals("My Account", myaccount);
		 Assert.assertEquals("Account Details", accountname);
		 Assert.assertEquals("Order History", orderhistory);
		 Assert.assertEquals("Address Book", addressbook);
		 
		 Assert.assertEquals("Personal details", personaldetails);
		 Assert.assertEquals("Name:", name);
		 Assert.assertEquals("Phone number:", phonenumber);
		 Assert.assertEquals("EDIT PERSONAL DETAILS", editperdetails);
		 Assert.assertEquals("Log in details", Logindetails);
		 
		 Assert.assertEquals("Email:", Email);
		 Assert.assertEquals("EDIT EMAIL", editemail);
		 Assert.assertEquals("Password:", password);
		 Assert.assertEquals("CHANGE PASSWORD", changepassword);
		 Assert.assertEquals("Marketing preferences", marketingpref);
		 Assert.assertEquals("Receive the latest offers, news and competitions from Maplin. For more information on how we use your personal details, please refer to our Privacy & Cookies policy", marketingtext); 
		 //   verification ends------
		 
		 
		 //starts click function works
		//clicks on privacy policy text to tick and untick
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[3]/form/div/label")).click();
		 Thread.sleep(4000);
		 //clicks on privacy policy link
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[3]/form/div/label/a")).click();
		 Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//start of edit personal details testing
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div/div/section/div/div[2]/div[2]/div/div[1]/div/div[1]/div[3]/a")).click();
			
			String title = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[1]/label")).getText();
			System.out.println(title);
			String toptional = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[1]/label/span")).getText(); 
			System.out.println(toptional);
			Select tiledropdown = new Select(driver.findElement(By.xpath("//*[@id=\"title\"]")));
			List<WebElement> dd = tiledropdown.getOptions();
			for (int i=0;i<dd.size();i++) {
				System.out.println(dd.get(i).getText());
			}
			
			tiledropdown.selectByVisibleText("Dr");
		
			String firstname = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[2]/label")).getText(); 
			//enter firstname
			driver.findElement(By.xpath("//*[@id=\"edit-first-name\"]")).clear();
			 driver.findElement(By.xpath("//*[@id=\"edit-first-name\"]")).sendKeys("don");
			
			String frequired = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[2]/label/span")).getText(); 
			System.out.println(frequired);
			String lastname = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[3]/label")).getText(); 
			//enter last name
			driver.findElement(By.xpath("//*[@id=\"edit-last-name\"]")).clear();
		       driver.findElement(By.xpath("//*[@id=\"edit-last-name\"]")).sendKeys("last"); 
			
			String lrequired = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[3]/label/span")).getText();
			System.out.println(lrequired);
			String phonenumber1 = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[4]/label")).getText(); 
			//enter number
			driver.findElement(By.id("edit-phone")).clear();
			driver.findElement(By.id("edit-phone")).sendKeys("01111111111");
			
		//	String save = driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[5]/input")).getText();
			//*[@id="edit-personal-details"]/div[5]/input
			
			
			
			//comparing the edit personal details 
			 
			 Assert.assertEquals(title,"TitleOptional");
			 Assert.assertEquals(toptional, "Optional");
			 Assert.assertEquals(firstname,"First name: Required");
			 Assert.assertEquals(frequired, "Required");
			 Assert.assertEquals(lastname,"Last name: Required");
			 Assert.assertEquals(lrequired, "Required");
			 Assert.assertEquals( phonenumber1,"Phone number:");
			// Assert.assertEquals(save,"SAVE");
			 
			 //click on save button
			 driver.findElement(By.xpath("//*[@id=\"edit-personal-details\"]/div[5]/input")).click();
			 Thread.sleep(3000);
			//end of edit personal details testing
			
			// start of edit email
			 
			 //click on edit email
			 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/a")).click();
			String email =  driver.findElement(By.xpath("//*[@id=\"edit-email-details\"]/div[1]/label")).getText();
			Assert.assertEquals(email,"Email:Required");
			 driver.findElement(By.xpath("//*[@id=\"edit-email\"]")).clear();
			 driver.findElement(By.xpath("//*[@id=\"edit-email\"]")).sendKeys("map@gmail.com");
			   
			 driver.findElement(By.xpath("//*[@id=\"edit-email-details\"]/div[2]/input")).click();
			 Thread.sleep(3000);
			 
			// end of edit email
			 
			// start of change password
			//click on change password
			 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/a")).click();
			 String oldpassword =  driver.findElement(By.xpath("//*[@id=\"edit-password-details\"]/div[2]/label")).getText();
			 driver.findElement(By.xpath("//*[@id=\"old-password\"]")).sendKeys("Gondi08676");
			 
			 String newpassword =  driver.findElement(By.xpath("//*[@id=\"edit-password-details\"]/div[3]/label")).getText();
			  driver.findElement(By.xpath("//*[@id=\"edit-password-details\"]/div[3]/a")).click();
		       driver.findElement(By.xpath("//*[@id=\"new-password\"]")).sendKeys("Gondi08676");
			 
			 String show =  driver.findElement(By.xpath("//*[@id=\"edit-password-details\"]/div[3]/a")).getText();
			 String minlength =  driver.findElement(By.xpath("//*[@id=\"new-password_minchar\"]")).getText();
			
			 
			 String confirmnewpasssword =  driver.findElement(By.xpath("//*[@id=\"edit-password-details\"]/div[5]/label")).getText();
			  driver.findElement(By.xpath("//*[@id=\"confirm-new-password\"]")).sendKeys("Gondi08676");
			 
			  
			  Assert.assertEquals(oldpassword,"Old passwordRequired");
			  Assert.assertEquals(newpassword,"New passwordRequired");
			  //Assert.assertEquals(show,"Email:Required");
			  Assert.assertEquals(minlength,"Minimum length is 6 characters");
			  Assert.assertEquals(confirmnewpasssword,"Confirm New passwordRequired");
			 
			//click on save for save password
			  driver.findElement(By.xpath("//*[@id=\"edit-password-details\"]/div[6]/input")).click();
			  
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div/div/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/a")).click();
				 driver.findElement(By.xpath("//*[@id=\"edit-email\"]")).clear();
				 driver.findElement(By.xpath("//*[@id=\"edit-email\"]")).sendKeys("phaneendra.gondi@maplin.co.uk");
				 driver.findElement(By.xpath("//*[@id=\"edit-email-details\"]/div[2]/input")).click();
			// change of change password
			 
			//personal details
			
		
		/* driver.findElement(By.id("check-list-item-0")).click();
			WebElement marketingtick = driver.findElement(By.id("check-list-item-0"));
			Actions a1=new Actions(driver);
			a1.click(marketingtick).perform();*/
			
			
			
		 
	 }
	 
	 
	 @AfterSuite
	 public void close_browser(){
	  driver.quit();
	 }
}
