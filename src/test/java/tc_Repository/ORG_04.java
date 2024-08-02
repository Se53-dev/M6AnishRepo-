package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.Homepage;
import ObjectRepo.OrganizationPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;
import genericlib.JavaLibrary;

public class ORG_04 extends BaseClass
{
	@Test(groups = "smoke")
	public void ORG04Tc() throws Exception
	{
		JavaLibrary JUTIL=new JavaLibrary();
		int num=JUTIL.generateRandomNumber(4000);
		ExcelutilityorLib EUTIL=new ExcelutilityorLib();
		String ORNAME=EUTIL.readDatafromexcel("Organisation", 10, 1);
		String WEBSITE=EUTIL.readDatafromexcel("Organisation", 10, 2);
		String EMP=EUTIL.readDatafromexcel("Organisation", 10, 3);
		String PHNO=EUTIL.readDatafromexcel("Organisation", 10, 4);
		String OTPH=EUTIL.readDatafromexcel("Organisation", 10, 5);
		String MAIL=EUTIL.readDatafromexcel("Organisation", 10, 6);
		String BILLADD=EUTIL.readDatafromexcel("Organisation", 10, 7);
		String BILLCTY=EUTIL.readDatafromexcel("Organisation", 10, 8);
		String BILLST=EUTIL.readDatafromexcel("Organisation", 10, 9);
		
		Homepage hp=new Homepage(driver);
		hp.clickOnOrg();
		OrganizationPage op=new OrganizationPage(driver);
		op.ClickOnCreateOrgButton();
		
		CreateNewOrganizationPage CNO=new CreateNewOrganizationPage(driver);
		CNO.createorg(ORNAME+num, WEBSITE, EMP, PHNO, OTPH, MAIL,BILLADD,BILLCTY, BILLST);
		System.out.println("ORG04 execution successfull!!");
		Thread.sleep(3000);
}
}
