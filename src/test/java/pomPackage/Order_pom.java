package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class Order_pom extends Baseclass {
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement dropdown  ;
	@FindBy(xpath="//div[@data-card-identifier='YourOrders']") WebElement order   ;
	@FindBy(css=".a-button.a-button-dropdown") WebElement orderhistory  ;
	@FindBy(xpath="(//ul[@tabindex='-1']/li/a)[1]") WebElement options ;
	@FindBy(xpath="(//div[@id='ordersContainer']/div)[2]") WebElement msg  ;
	
	// create constructor to initiate page elements
	public Order_pom() {
		PageFactory.initElements(driver,this);
	}
		
	//execute actions on web elements by creating methods	

	public void myorder() {
		 dropdown.click();
		 order.click();
	}
	
	public void selectoptions() {
		 orderhistory.click();
		 options.click();
	}
	
	public String messageonscreen() {
		String message= msg.getText();
		return message;
	}

}
