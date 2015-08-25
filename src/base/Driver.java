package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import util.ReadProperty;


public class Driver {
	
	public static WebDriver driver;
	static String chromeDriverPath = "/Users/Zakia/git/LocalGuru99Bank/Guru99Bank/";
	
	public static ReadProperty readProperty = new ReadProperty();
	
	public void setWebDriver(String browserType, String baseUrl){
		switch (browserType.toLowerCase()){
		case "chrome":
			driver = initChromeDriver(baseUrl);
			break;
		case "firefox":
			driver = initFirefoxDriver(baseUrl);
			break;
		case "htmlunit":
			driver = initHtmlUnitDriver(baseUrl);
			break;
		case "safari":
			driver = initSafariDriver(baseUrl);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(baseUrl);
		}
	}
	public WebDriver initChromeDriver(String baseUrl) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath + "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		return driver;
	}

	public WebDriver initFirefoxDriver(String baseUrl) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		return driver;
	}
	
	public WebDriver initHtmlUnitDriver(String baseUrl) {
		System.out.println("Launching HtmlUnit browser..");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		return driver;
	}
	
	public WebDriver initSafariDriver(String baseUrl) {
		System.out.println("Launching Safari  browser..");
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	

}
