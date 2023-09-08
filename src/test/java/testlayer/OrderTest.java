package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pomPackage.Order_pom;
import pomPackage.Signin_pom;

public class OrderTest extends Baseclass {

	 Order_pom od ;
	 Signin_pom sign;
	 
	// create constructor
	public OrderTest() {
		
	// calling the constructor of parent class
		super();
	}

	@BeforeMethod
	public void initsetup() {
		initiation();
		
	// create object of signin_pom class
		  od=new Order_pom();
		  
	// create object of signin_pom class
		   sign=new Signin_pom();

	}
	
	@Test
	public void orderhistory() {
		sign.mousehover();
		sign.signintab();
		sign.enteremail(prop.getProperty("email"));
		sign.continuebtn();
		sign.enterpassword(prop.getProperty("password"));
		sign.signinbtn();
		od.myorder();
		od.selectoptions();
		String a=od.messageonscreen();
		System.out.println("message on the screen is "+a);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
