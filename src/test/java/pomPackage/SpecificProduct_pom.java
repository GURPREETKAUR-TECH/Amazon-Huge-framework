package pomPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.Baseclass;
import utility.Timeutils;

public class SpecificProduct_pom extends Baseclass {
	
@FindBy(id="twotabsearchtextbox") WebElement searchbox    ;
	
@FindBy(id="nav-search-submit-button") WebElement searchbtn    ;

@FindBy(xpath="//div[@data-component-type='s-impression-counter']//div//div//div//div//span[contains(text(),'Shuttle Art Highlighters, 15 Colors Pastel Highlig')]") 
WebElement click ;

@FindBy(id="productTitle") 
WebElement namebefore_addtocart    ;

@FindBy(xpath="/html/body/div[2]/div/div[5]/div[4]/div[4]/div[10]/div/div[1]/div[3]/div[1]/span[1]/span[1]") 
WebElement pricebefore_addtocart   ;

//@FindBy(id="add-to-cart-button") 
//WebElement nameafter_addtocart   ;
//
//@FindBy(id="add-to-cart-button") 
//WebElement priceafter_addtocart    ;



 public String name1beforecart;

 public String price1beforecart;

WebDriverWait wait;

JavascriptExecutor js;

Actions action;




//create constructor to initiate page elements
	public SpecificProduct_pom() {
		PageFactory.initElements(driver,this);
	}
		
	//execute actions on web elements by creating methods	

	public void searchbox() {
	 action=new Actions	(driver);
	action.moveToElement(searchbox).doubleClick().keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).sendKeys("art highlighter").build().perform();
		searchbtn.click();
		  wait= new WebDriverWait(driver,Duration.ofSeconds(16));
		  wait.until(ExpectedConditions.elementToBeClickable(click));
		
	}
	
	public void clickonproduct() throws InterruptedException {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", click);	
		Thread.sleep(10000);
	}
	
	public String productnamebeforecart() {
		String name1beforecart=	namebefore_addtocart.getText();
		System.out.println("name1 is "+name1beforecart);
		return name1beforecart;
	}
	
	public String productpricebeforecart() {
		String price1beforecart=pricebefore_addtocart.getText();
		System.out.println("price1 is "+price1beforecart);
		return price1beforecart ;
	}


}
