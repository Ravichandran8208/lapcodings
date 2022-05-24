package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenowloginpage {
	@Test

	public  void servicenow() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev103117.service-now.com");
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("w6hnF2FRhwLC");
	driver.findElement(By.id("sysverb_login")).click();
	WebElement element = driver.findElement(By.id("filter"));
	element.sendKeys("incidents");

	}

}
