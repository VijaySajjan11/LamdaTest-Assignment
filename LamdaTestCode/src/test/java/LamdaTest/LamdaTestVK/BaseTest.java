package LamdaTest.LamdaTestVK;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;

	@BeforeClass
	public void initialiization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}


}


