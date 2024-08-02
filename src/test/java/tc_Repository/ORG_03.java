package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.Homepage;
import ObjectRepo.OrganizationPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;
import genericlib.JavaLibrary;

public class ORG_03 extends BaseClass{
	@Test(groups = "smoke")
	public void ORG03Tc() throws Exception
	{
		JavaLibrary JUTIL=new JavaLibrary();
		int num=JUTIL.generateRandomNumber(4000);
		ExcelutilityorLib EUTIL=new ExcelutilityorLib();
		String ORNAME=EUTIL.readDatafromexcel("Organisation", 7, 1);
		String WEBSITE=EUTIL.readDatafromexcel("Organisation", 7, 2);
		String BILLADD=EUTIL.readDatafromexcel("Organisation", 7, 3);
		String BILLCTY=EUTIL.readDatafromexcel("Organisation", 7, 4);
		String BILLST=EUTIL.readDatafromexcel("Organisation", 7, 5);
		
		
		Homepage hp=new Homepage(driver);
		hp.clickOnOrg();
		OrganizationPage op=new OrganizationPage(driver);
		op.ClickOnCreateOrgButton();
		
		CreateNewOrganizationPage CNO=new CreateNewOrganizationPage(driver);
		CNO.createorg(ORNAME+num, WEBSITE, BILLADD, BILLCTY, BILLST);
		System.out.println("ORG03 execution successfull!!");
		Thread.sleep(3000);
}
}
