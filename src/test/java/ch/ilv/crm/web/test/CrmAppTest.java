package ch.ilv.crm.web.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrmAppTest {
	
	@Before
	public void setup() {
		// Configure firefox driver
		System.setProperty("webdriver.gecko.driver", "D:\\DevTools\\geckodriver.exe");
	}
	
	@Test
	public void test() {
		// Start firefox driver
		WebDriver driver = new FirefoxDriver();
        //Launch the Online Store Website
		driver.get("http://localhost:7070");
		
		// start testing
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));
		// driver.findElement(By.xpath("//link[@linktext='Manage Customers']")).click();
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Linux");
		// driver.findElement(By.xpath("//input[@name='q']")).submit();
		
		//Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        // Close the driver
        driver.quit();
	}
}
