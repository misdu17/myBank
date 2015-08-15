package base;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends Driver{
	
	public void navigateTo(String url){
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public WebElement findElementFromList(List<WebElement> searchList, String searchString){
		WebElement desireElement = null;
		for(int i=0; i < searchList.size() ; i++ ){
			String sValue = searchList.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase(searchString)){ 
				desireElement = searchList.get(i);
				break;
			}
		}
		return desireElement;	
	}
	public Alert handleAlert(){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert pageAlert = driver.switchTo().alert();
		return pageAlert;
	}

}
