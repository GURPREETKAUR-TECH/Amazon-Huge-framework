package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pomPackage.Signin_pom;
import pomPackage.SpecificProduct_pom;

public class SpecificProductTest extends Baseclass {

	Signin_pom sign;
	SpecificProduct_pom sp;
	SigninTest sig;
	
// create constructor
public SpecificProductTest() {
	
// calling the constructor of parent class
	super();
}

@BeforeMethod
public void initsetup() {
	initiation();
	
// create object of signin_pom class
	 sp=new SpecificProduct_pom();
	 
// create object of signintest class to get 'signin' method
     sig=new SigninTest();
     
  // create object of signin_pom class
  	 sign=new Signin_pom();
     
}

@Test(priority=3)
public void beforecart() throws InterruptedException {
	
	sign.mousehover();
	sign.signintab();
	sign.enteremail(prop.getProperty("email"));
	sign.continuebtn();
	sign.enterpassword(prop.getProperty("password"));
	sign.signinbtn();
	//SigninTest.successfulsignin();
	sp.searchbox();
	sp.clickonproduct();
	sp.productnamebeforecart();
	sp.productpricebeforecart();
}

@AfterMethod
public void close() {
	driver.quit();
}
}
