package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class CustomerRegisteredPage extends PageBase {

	@FindBy(id = "customer")
	public WebElement registeredCustomerTable;

	public void registeredCustomerInfo() {
		List<WebElement> tableRows = registeredCustomerTable.findElements(By
				.tagName("tr"));
		for (int i = 0; i < tableRows.size(); i++) {
			List<WebElement> tableColumn = tableRows.get(i).findElements(
					By.tagName("td"));
			for (int j = 0; j < tableColumn.size(); j++) {
				System.out.print(tableColumn.get(j).getText()+"  ");
			}
			System.out.println("");
			//jjjj
		}
	}
	
	public void clickContinueLink(){
		WebElement continueLink = registeredCustomerTable.findElement(By.linkText("Continue"));
		continueLink.click();
	}
	
	public String getCustomerId(){
		List<WebElement> tableRows = registeredCustomerTable.findElements(By
				.tagName("tr"));
		String customerId = tableRows.get(3).getText();
		return customerId;
	}
	public String getCongratulationMessage(){
		List<WebElement> tableRows = registeredCustomerTable.findElements(By
				.tagName("tr"));
		String congratulationMessage = tableRows.get(0).getText();
		return congratulationMessage;
	}
}
