package settings.xsolla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverSetting {
	
	public WebDriver driverSettings() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\Chrome\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-gpu");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--ignore-ssl-errors=yes");

		//chromeOptions.addArguments("--window-size=1920,1080"); //to avoid uninteractable issue 
		WebDriver driver = new ChromeDriver(chromeOptions);
		return driver;
	}
	
}
