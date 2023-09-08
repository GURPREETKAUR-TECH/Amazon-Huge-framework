package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pomPackage.Signin_pom;

public class SigninTest extends Baseclass {

 Signin_pom sign;
// create constructor
public SigninTest() {
	
// calling the constructor of parent class
	super();
}

@BeforeMethod
public void initsetup() {
	initiation();
	
// create object of signin_pom class
	  sign=new Signin_pom();
}

@Test(priority=1)
public  void successfulsignin() {
	sign.mousehover();
	sign.signintab();
	sign.enteremail(prop.getProperty("email"));
	sign.continuebtn();
	sign.enterpassword(prop.getProperty("password"));
	sign.signinbtn();
	sign.getusername();
	Assert.assertTrue(sign.getusername().contains("conceptual"));
	  System.out.println("user has successfully signed in");
}

@AfterMethod
public void close() {
	driver.quit();
}
}
