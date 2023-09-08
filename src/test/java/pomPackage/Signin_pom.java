package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class Signin_pom extends Baseclass {
	
 Actions action;
@FindBy(id="nav-link-accountList-nav-line-1") WebElement mousehover    ;
@FindBy(xpath="//span[@class='nav-action-inner']") WebElement signintab    ;
@FindBy(css="#ap_email") WebElement email   ;
@FindBy(css="#continue") WebElement continuebtn   ;
@FindBy(id="ap_password") WebElement password   ;
@FindBy(id="auth-signin-button") WebElement signinbtn   ;
@FindBy(id="nav-link-accountList-nav-line-1") WebElement username  ;

// create constructor to initiate page elements
public Signin_pom() {
	PageFactory.initElements(driver,this);
}
	
//execute actions on web elements by creating methods	

public void mousehover() {
	 action=new Actions(driver);
	action.moveToElement(mousehover).build().perform();
}

public void signintab()	{
	signintab.click();
}
	
public void enteremail(String mail)	{
	email.sendKeys(mail);;
}

public void continuebtn()	{
	continuebtn.click();
}

public void enterpassword(String pass)	{
	password.sendKeys(pass);;
}

public void signinbtn()	{
	signinbtn.click();
}

public String getusername() {
	String u=username.getText();
	return u;
}
	
	
	
	
}
