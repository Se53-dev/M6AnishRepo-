package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreateNewContact;
import ObjectRepo.Homepage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;
import genericlib.JavaLibrary;

public class CON_01 extends BaseClass
{
    @Test(retryAnalyzer=genericlib.RetryAnalyzerImplementationClass.class)
	public void con_01TC() throws Exception
	{
		JavaLibrary JLIB=new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		ExcelutilityorLib EUTIL=new ExcelutilityorLib();
		String FNAME=EUTIL.readDatafromexcel("Contacts", 1, 1);
		String LNAME=EUTIL.readDatafromexcel("Contacts", 1, 2);
		String TITLE=EUTIL.readDatafromexcel("Contacts", 1, 3);
		
		Homepage hp=new Homepage(driver);
		hp.clickOnContacts();
		ContactPage CP=new ContactPage(driver);
		CP.ClickOnContactButton();
		CreateNewContact CNC=new CreateNewContact(driver);
		CNC.createContact(FNAME+num, LNAME, TITLE);
		System.out.println("CON01 execution successfull!!");
		Thread.sleep(3000);
		}
}
