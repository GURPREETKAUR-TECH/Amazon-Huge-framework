package pomPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class Productpage_pom extends Baseclass {
	
	
	@FindBy(id="twotabsearchtextbox") WebElement searchbox   ;
	
	@FindBy(id="nav-search-submit-button") WebElement searchbtn   ;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']/descendant::span[@class='a-size-base-plus a-color-base a-text-normal']") 
	List <WebElement> namebeforefilter    ;
	
	@FindBy(xpath="//li[@aria-label='Elegant Comfort']//i[@class='a-icon a-icon-checkbox']") 
	WebElement filter   ;

	@FindBy(xpath="//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/descendant::span[@class='a-size-medium a-color-base a-text-normal']") 
	public List <WebElement> nameafterfilter    ;
	
	@FindBy(xpath="//a[@aria-label='Go to page 2']") WebElement nextbtn   ;
	
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/descendant::span[@class='a-size-medium a-color-base a-text-normal']") 
	List <WebElement> nameafterfilternextpage  ;
	
	//create constructor to initiate page elements
	public Productpage_pom() {
		PageFactory.initElements(driver,this);
	}
		
	//execute actions on web elements by creating methods	

	public void searchbox() {
		searchbox.sendKeys("bedsheet");
	}

	public void searchbtn() {
		searchbtn.click();
	}
	
	public int numofproducts_on_firstpage() {
		int b=namebeforefilter.size();
		return b;
	}

	public void filter() {
		filter.click();
	}

	public void nextpage() throws InterruptedException {
		nextbtn.click();
		Thread.sleep(5000);
	}

	public int numofproducts_on_nextpage() {
		int a=nameafterfilternextpage.size();
		return a;
	}

		
}
