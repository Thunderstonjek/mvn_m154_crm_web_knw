package ch.ilv.crm.web.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.*;

public class CrmAppTest {

	public static void main(String[] args) {
		// Configure firefox driver
		System.setProperty("webdriver.gecko.driver", "D:\\DevTools\\geckodriver.exe");
		// Start firefox driver
		WebDriver driver = new FirefoxDriver();
		
		// Start website
		driver.get("http://localhost:7070");

		// Use website
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));

		// Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close driver
		driver.quit();
	}

}
