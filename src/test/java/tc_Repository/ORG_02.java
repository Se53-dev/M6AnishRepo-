package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.Homepage;
import ObjectRepo.OrganizationPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;
import genericlib.JavaLibrary;

public class ORG_02 extends BaseClass
{
	@Test(groups = "regression")
	public void ORG02Tc() throws Exception
	{
		JavaLibrary JUTIL=new JavaLibrary();
		int num=JUTIL.generateRandomNumber(4000);
		ExcelutilityorLib EUTIL=new ExcelutilityorLib();
		String ORNAME=EUTIL.readDatafromexcel("Organisation", 4, 1);
		String WEBSITE=EUTIL.readDatafromexcel("Organisation", 4, 2);
		String EMP=EUTIL.readDatafromexcel("Organisation", 4, 3);
		String PHNO=EUTIL.readDatafromexcel("Organisation", 4, 4);
		String OTPH=EUTIL.readDatafromexcel("Organisation", 4, 5);
		String MAIL=EUTIL.readDatafromexcel("Organisation", 4, 6);
		
		Homepage hp=new Homepage(driver);
		hp.clickOnOrg();
		OrganizationPage op=new OrganizationPage(driver);
		op.ClickOnCreateOrgButton();
		
		CreateNewOrganizationPage CNO=new CreateNewOrganizationPage(driver);
		CNO.createorg(ORNAME+num, WEBSITE, EMP, PHNO, OTPH, MAIL);
		System.out.println("ORG02 execution successfull!!");
		Thread.sleep(3000);
}
}