package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zomato_Test {

	public WebDriver driver;
	@Test
	
	public void Browsersetup() throws IOException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		driver.quit();
		
	}
}
