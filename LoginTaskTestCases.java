package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTaskTestCases {
	WebDriver chDriver;

	@BeforeMethod
	public void browserLaunch() 
	
	{
			//System.out.println("@beforemethod--chdriver");
		String driverPath= System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		 WebDriver chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
	

	/*@Test
	public void appLaunch()
	{
		//System.out.println("@test.app login");
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
	

}*/
	
	@Test(priority=1)
	public void validUsername()
	{
		
		
	chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	chDriver.findElement(By.id("btnlogin")).click();

}
	

	@Test(priority=2)
	public void invalidUsername()
	{
		
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
	chDriver.findElement(By.id("txtUsername")).sendKeys("Ad@min");
	chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	chDriver.findElement(By.id("btnlogin")).click();

}
	@AfterMethod
	public void tearDown()
	{
		chDriver.quit();
	}
	
	
	/*@Test
	public void validPassword()
	{
		
	
	chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	chDriver.findElement(By.id("btnlogin")).click();

}

	@Test
	public void invalidPassword()
	{
		
	
	chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	chDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	chDriver.findElement(By.id("btnlogin")).click();

}
	

	@Test
	public void lengthlessthenfive()
	{
		
	
	chDriver.findElement(By.id("txtUsername")).sendKeys("Admn");
	chDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	chDriver.findElement(By.id("btnlogin")).click();

}


	@Test
	public void lengthgreaterthenfive()
	{
		
	
	chDriver.findElement(By.id("txtUsername")).sendKeys("Admiin");
	chDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	chDriver.findElement(By.id("btnlogin")).click();*/

}

	
	
	
	
	
	
	
	
	
