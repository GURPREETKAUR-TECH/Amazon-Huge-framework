package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class AddtoCart_pom extends Baseclass {
	
@FindBy(id="add-to-cart-button") WebElement addtocartbtn    ;
@FindBy(id="nav-cart-count") WebElement addtocarticon   ;
	
@FindBy(xpath="//span[@aria-hidden='true'][contains(text(),'Shuttle Art Highlighters, 15 Colors Pastel Highlig')]") 
WebElement nameafter_addtocart ;

@FindBy(xpath="//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']") 
WebElement priceafter_addtocart   ;

String name1aftercart;

String price1aftercart;

// create object of 'specificproduct_pom' class
SpecificProduct_pom p=new SpecificProduct_pom ();

//create constructor to initiate page elements
public AddtoCart_pom() {
	PageFactory.initElements(driver,this);
}
	
//execute actions on web elements by creating methods	

public void addtocartbtn() {
	addtocartbtn.click();
}

public void addtocarticon() {
	addtocarticon.click();
}

public String productnameaftercart() {
	String name1aftercart=	nameafter_addtocart.getText();
	System.out.println("product name after addind to cart is  "+name1aftercart);
	return name1aftercart;
}
	
	public String price1aftercart() {
		String price1aftercart=	priceafter_addtocart.getText();
		System.out.println("product price after adding to cart is  "+price1aftercart);
		return price1aftercart;
}

public void validateAddtoCart() {
	 if(p.name1beforecart.contains("Shuttle Art Highlighters, 15 Colors Pastel Highlighter Pens")) {
		 System.out.println(" name test is passed");
	 }
	 else {
		 System.out.println(" name test is failed");
	 }
	 
	 if(price1aftercart.equalsIgnoreCase("$16.99")) {
		 System.out.println(" price test is passed");
	 }
	 else {
		 System.out.println(" price test is failed");
	 }
}

public void validateSubTotal() {
	String b=driver.findElement(By.xpath("//div[@class='a-row a-spacing-mini sc-subtotal sc-subtotal-buybox sc-java-remote-feature']")).getText();
	
	System.out.println(b);

}

}
