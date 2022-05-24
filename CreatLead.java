package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead  {
	ChromeDriver driver;
	
	
	
		
	
	
	@Test

	public  void main() throws IOException {
		String ActTitle="My Home | opentaps CRM";
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream(new File("src/main/resources/app1.properties"));
	prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id(prop.getProperty("Username"))).sendKeys("DemoSalesManager");
		driver.findElement(By.id(prop.getProperty("Password"))).sendKeys("crmsfa");
		driver.findElement(By.className(prop.getProperty("loginbtn"))).click();
		driver.findElement(By.linkText(prop.getProperty("CRMbtnclick"))).click();
		String title = driver.getTitle();
		if(ActTitle.equals(title)) {
			System.out.println("propereties files should be worked");
		}else
			System.out.println("propereties files should be  not worked");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}

	}


