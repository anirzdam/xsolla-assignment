package settings.xsolla;

import static variables.xsolla.UrlVariables.*;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

public class BrowserSetting {
	
	public WebDriver BrowserSettings() {
		

		
		WebdriverSetting wds = new WebdriverSetting();
		WebDriver driver = wds.driverSettings();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		driver.get(BASE_URL_WEATHER);
		return driver;
	}

}
