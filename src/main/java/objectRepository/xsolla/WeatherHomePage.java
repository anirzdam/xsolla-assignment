package objectRepository.xsolla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherHomePage {

	WebDriver driver;

	@FindBy(id = "LocationSearch_input")
	WebElement inp_search;
	
	@FindBy(xpath="//span[contains(text(),'10 Day')]")
	WebElement lnk_10_day;
	
	@FindBy(xpath="//div/span[contains(text(),'°F')]")
	WebElement div_selector;
	
	@FindBy(xpath="//span[contains(text(),'°C')]")
	WebElement spn_celcius;
	
	// constructor
	public WeatherHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement textSearchPath() {
		return inp_search;
	} 
	
	public WebElement linkSearchPath() {
		return lnk_10_day;
	}

	public WebElement divSelectorPath() {
		return div_selector;
	}
	
	public WebElement spanCelciusPath() {
		return spn_celcius;
	}
}
