package testcases.xsolla;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.xsolla.WeatherHomePage;
import objectRepository.xsolla.WeatherListingPage;

import org.testng.annotations.Parameters;

import settings.xsolla.BrowserSetting;

public class VerifyTempTest {
	
	@Parameters({ "location" })
	@Test
	public void CheckLocTemperatureFahrenheit(String param) {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings(); 

		searchInHomePage(driver, param);
		String suhu = getTemperature(driver).replaceAll("\\D", "");
		
		//System.out.println("\n LALALA " + suhu);
		Integer temperature = Integer.valueOf(suhu);
		SoftAssert softAssertion= new SoftAssert();

		softAssertion.assertTrue(temperature <=10, "Temperature for tomorrow is > 10 ");
		System.out.println("softAssert Method Was Executed");

		//softAssertion.assertAll();

		driver.quit();

	}
	

	private void searchInHomePage(WebDriver driver, String param){
		WeatherHomePage page = new WeatherHomePage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("LocationSearch_input")));

		page.textSearchPath().click();		
		page.textSearchPath().sendKeys(param);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.textSearchPath().sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		page.linkSearchPath().click();
	}
	
	private String getTemperature(WebDriver driver) {
		WeatherListingPage page = new WeatherListingPage(driver);
		return page.TempPath();
	}
	
}
