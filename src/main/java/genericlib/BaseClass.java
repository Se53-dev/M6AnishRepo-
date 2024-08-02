package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import ObjectRepo.Homepage;
import ObjectRepo.Loginpage;

public class BaseClass {
public static WebDriver driver=null;
public Propertiesutilorlib PUTIL=null;
public SeleniumUtility SUTIL=new SeleniumUtility();
@BeforeSuite(alwaysRun = true)
public void Createdbconnection()
{
	System.out.println("dbconnection sucessfull!!");
}
@BeforeClass(alwaysRun = true)
public void LaunchBrowser(String browser) throws Exception
{
	PUTIL=new Propertiesutilorlib();
	String URL=PUTIL.getDataFromProperties("url");
	//if(browser.equals("Chrome"))
	//{
	driver=new ChromeDriver();
	//System.out.println("chrome started");
	//}
	//else if(browser.equals("Firefox"))
	//{
	//	driver=new FirefoxDriver();
		//System.out.println("firefox started");
	//}
	
	SUTIL.implicitWait(driver,10);
	SUTIL.maximization(driver);
	driver.get(URL);
	System.out.println("Launching successfully");
	
}
@BeforeMethod(alwaysRun = true)
public void LoginOperation() throws Exception
{
	String USERNAME=PUTIL.getDataFromProperties("username");
	String PASSWORD=PUTIL.getDataFromProperties("password");
	Loginpage LP=new Loginpage(driver);
	LP.loginToApplication(USERNAME, PASSWORD);
	System.out.println("Login Successfully!!");
	
}
@AfterMethod(alwaysRun = true)
public void LogoutOperation()
{
Homepage hp=new Homepage(driver);
hp.logoutopertaion(driver);
System.out.println("Logout Sucessfully!!");
}
@AfterClass(alwaysRun = true)
public void CloseBrowser()
{
driver.close();
System.out.println("Browser closed sucessfulluy!!");
}
@AfterSuite(alwaysRun = true)
public void ClosedbConnection()
{
	System.out.println("db connection closed!!");
}
}

