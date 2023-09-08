package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Timeutils;

public class Baseclass {

// create object of properties class to have access to 'config.properties' file
	public static Properties prop=new Properties();
	
// declare driver object
	public static WebDriver driver;

// create variable for actions class
 // public static Actions action;
  
	
// create constructor
	public Baseclass() {
	
// to import config.properties file
   try {
	
	  FileInputStream file=new FileInputStream("C:\\Users\\gurpr\\eclipse-workspace\\newguru\\Amazonhuge_Framework\\src\\test\\java\\environVariables\\config.properties");
    
	// to read properties of file
	prop.load(file);
   } 
   catch (FileNotFoundException e) {
	
	e.printStackTrace();
	} 
   
   catch (IOException a) {
	
	a.printStackTrace();
}
   
	}
	
// create methods for common commands
	public static void initiation() {
		
// to fetch browser information from config.properties file
  String browsername=prop.getProperty("browser");
  
  if(browsername.equals("chrome")) {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\gurpr\\eclipse-workspace\\newguru\\Amazonhuge_Framework\\chromedriver-win64\\chromedriver.exe");
  driver= new ChromeDriver();
  }
  
  else if (browsername.equals("firefox")) {
  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
  driver=new FirefoxDriver();
  }
  
  driver.manage().window().maximize();
  
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Timeutils.implicit));
 
 driver.get(prop.getProperty("url"));
 
// action=new Actions(driver);
 

 
	}
	
	


}
