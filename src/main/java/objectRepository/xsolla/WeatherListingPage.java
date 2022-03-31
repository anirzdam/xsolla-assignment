package objectRepository.xsolla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherListingPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='titleIndex1']/h2/..//span[@class='DetailsSummary--highTempValue--3Oteu']")
	WebElement div_highTemp;
	
	
	// constructor 
	public WeatherListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	public String TempPath() {
		return div_highTemp.getText();
	}

}
