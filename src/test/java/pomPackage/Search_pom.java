package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class Search_pom extends Baseclass {
	@FindBy(id="twotabsearchtextbox") WebElement searchbox   ;
	
	@FindBy(id="nav-search-submit-button") WebElement searchbtn   ;
	
	//create constructor to initiate page elements
		public Search_pom() {
			PageFactory.initElements(driver,this);
		}


public void searchby_CategoryKeyword() {

	searchbtn.click();
}
}