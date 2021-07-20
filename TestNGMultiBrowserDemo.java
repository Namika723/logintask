package TestNGDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestNGMultiBrowserDemo{
	
	WebDriver driver= null;
		
		@BeforeTest
		public void appLaunch()
		{
			//String browsername = null;
			//System.out.print("Browser name is: "+ browsername);
			
			
			String driverPath= System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/login");
		}
	
		@Test(priority=1)
		public void test1() 
		{
			
				
			driver.findElement(By.id("userName")).sendKeys("anamikasharma");
			driver.findElement(By.id("password")).sendKeys("Anamika@123");
			driver.findElement(By.id("login")).click();
			//driver.findElement(By.id("gotoStore")).click();
		}
			
		
		@Test(priority=2)
		
		public void bookStore() throws InterruptedException 
		{
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			driver.findElement(By.id("gotoStore")).click();
			Thread.sleep(2000);
					
			JavascriptExecutor ps = (JavascriptExecutor) driver;
			ps.executeScript("window.scrollBy(0,350)", "");
			WebElement n=driver.findElement(By.linkText("Speaking JavaScript"));
			n.click();
			Thread.sleep(2000);
			
			JavascriptExecutor ts = (JavascriptExecutor) driver;
			ts.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add To Your Collection']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Back To Book Store']")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.id("delete-record-undefined")).click();
			//driver.findElement(By.xpath("//button[text()='OK']")).click();
			
			
			
			JavascriptExecutor gs = (JavascriptExecutor) driver;
			gs.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(2000);
			WebElement d=driver.findElement(By.linkText("Programming JavaScript Applications"));
			d.click();
			Thread.sleep(2000);
			JavascriptExecutor ds = (JavascriptExecutor) driver;
			ds.executeScript("window.scrollBy(0,600)", "");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add To Your Collection']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Back To Book Store']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			
		
			
		}
		
			/*@Test(priority=3)
			public void deleteBook()
			{
			driver.findElement(By.xpath("//span[@id='delete-record-undefined']/preceding-sibling::div[Text()='Eric Elliott']")).click();
				
				driver.findElement(By.xpath("//button[text()='OK']")).click();
			}*/
			
			@Test(priority=3)
			public void logOut() throws InterruptedException
			
			{
				
				driver.findElement(By.xpath("//button[text()='Log out']")).click();
				Thread.sleep(3000);
			}
		
		
		
		

		@AfterTest
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(2000);
		driver.close();
		System.out.print("Test completed");
	
		}
}

