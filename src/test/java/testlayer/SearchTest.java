package testlayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import basePackage.Baseclass;
import pomPackage.Search_pom;
import pomPackage.Signin_pom;

public class SearchTest extends Baseclass {
	
	 Search_pom sr;
	 Signin_pom sign;
	 
	// create constructor
	public SearchTest() {
		
	// calling the constructor of parent class
		super();
	}

	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
	// create object of signin_pom class
		  sr=new Search_pom();
		  
		  sign=new Signin_pom();
	}
	
@DataProvider(name="keyword")
public Object[][] key(){
	Object[][] data=new Object[][] {{"toys"},{"home appliances"},{"gadgets"}};
	return data;
}
	@Test(dataProvider="keyword")
	public void search(String k) throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(k);
		sr.searchby_CategoryKeyword();
		System.out.println("the title of the page is "+driver.getTitle());
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}





