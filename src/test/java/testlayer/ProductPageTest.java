package testlayer;

import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pomPackage.Productpage_pom;


public class ProductPageTest extends Baseclass {
	Productpage_pom prod;
	// create constructor
	public ProductPageTest()  {
		
	// calling the constructor of parent class
		super();
	}

@BeforeMethod
public void initsetup() {
 initiation();
		
// create object of signin_pom class
  prod =new Productpage_pom();
	}

@Test(priority=1)
public void filtertest() throws InterruptedException {
	prod.searchbox();
	prod.searchbtn();
	prod.filter();
	
  for(int i=0;i<prod.nameafterfilter.size();i++)
  {
	 String afterfilter=prod.nameafterfilter.get(i).getText();
	 if( !afterfilter.contains("Elegant Comfort"))
	 {
		 System.out.println("filteration test is failed");
	 }
	 else {
		 System.out.println("filteration test is passed");
  }
}

}

@Test(enabled=true,priority=2)
public void paginationtest() throws InterruptedException {
	prod.searchbox();
	prod.searchbtn();
	int x=prod.numofproducts_on_firstpage();
	prod.filter();
	prod.nextpage();
	int y=prod.numofproducts_on_nextpage();
	
	System.out.println("no. of products on first page is "+x);
	System.out.println("no. of products on next page is "+y);
	
	
}

@AfterMethod
public void close() {
	driver.quit();
}

}







