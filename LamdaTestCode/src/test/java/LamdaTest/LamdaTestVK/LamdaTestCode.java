package LamdaTest.LamdaTestVK;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LamdaTestCode extends BaseTest{
	public String username = "vijaykumarsajjan32";
	public String accesskey = "Fb0dtfafvntRYZfBR6WPd3oUOgEexd6V08UqduAJkbiP047g3T";


	@Test
	public void testSimple() throws Exception {
		try {

			driver.get("https://www.lambdatest.com");
			driver.manage().window().maximize();

			Thread.sleep(3000);
			//WebDriverWait wait = new WebDriverWait(driver,3);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

			WebElement element = driver.findElement(By.xpath("//a[contains(@class,'tracking-widest')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(3000); 

			String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElement(By.xpath("//a[contains(@class,'tracking-widest')]")).sendKeys(clicklnk);

			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			String title =driver.switchTo().window(tabs.get(1)).getCurrentUrl();
			System.out.println(title);
			String title1 ="https://www.lambdatest.com/integrations";
			Assert.assertEquals(title, title1);


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



}
