package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pomPackage.AddtoCart_pom;
import pomPackage.Signin_pom;
import pomPackage.SpecificProduct_pom;

public class AddtoCartTest extends Baseclass {

	Signin_pom sign;
	AddtoCart_pom ad;
	SpecificProductTest st;
	SpecificProduct_pom sp;
	SpecificProduct_pom p=new SpecificProduct_pom ();
	
// create constructor
public AddtoCartTest() {
	
// calling the constructor of parent class
	super();
}

@BeforeMethod
public void initsetup() {
	// "initiation" method is commented because we are using @test from different class and driver is already initiated in that test once
	initiation();
	
// create object of addtocart_pom class
	  ad=new AddtoCart_pom();
	 
// create object of signintest class to get 'signin' method
     st=new SpecificProductTest();
     
  // create object of signin_pom class
  	 sign=new Signin_pom();
  	 
  	// create object of signin_pom class
	 sp=new SpecificProduct_pom();
     
}

// used "dependsOngroups" mechanism to use the test from different class
@Test(priority=4)
public void validateAddtoCart() throws InterruptedException {
sp.searchbox();
sp.clickonproduct();
sp.productnamebeforecart();
sp.productpricebeforecart();
ad.addtocartbtn();
ad.addtocarticon();
ad.price1aftercart();
ad.productnameaftercart();
ad.validateSubTotal();
}

@AfterMethod
public void close() {
	driver.quit();
}
}
