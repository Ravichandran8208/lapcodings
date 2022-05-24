package org.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTeting {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void verify(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
//			driver.get("http://leaftaps.com/opentaps/");
		}
		else if(browser.equalsIgnoreCase("InternetExplorer")){
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
//			driver.get("http://leaftaps.com/opentaps/");
			
		}else
			System.out.println("nothing to open");
		

	}
	@Test
	public void login() {
		driver.get("http://leaftaps.com/opentaps/");

	}

}
