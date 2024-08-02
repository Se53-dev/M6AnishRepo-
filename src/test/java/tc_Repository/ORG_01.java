package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.Homepage;
import ObjectRepo.OrganizationPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;
import genericlib.JavaLibrary;

public class ORG_01 extends BaseClass{
	@Test(groups = "regression")
	public void ORG01Tc() throws Exception
	{
		JavaLibrary JUTIL=new JavaLibrary();
		int num=JUTIL.generateRandomNumber(4000);
		ExcelutilityorLib EUTIL=new ExcelutilityorLib();
		String ORNAME=EUTIL.readDatafromexcel("Organisation", 1, 1);
		String WEBSITE=EUTIL.readDatafromexcel("Organisation", 1, 2);
		String EMP=EUTIL.readDatafromexcel("Organisation", 1, 3);
		
		Homepage hp=new Homepage(driver);
		hp.clickOnOrg();
		OrganizationPage op=new OrganizationPage(driver);
		op.ClickOnCreateOrgButton();
		
		CreateNewOrganizationPage CNO=new CreateNewOrganizationPage(driver);
		CNO.createorg(ORNAME+num, WEBSITE, EMP);
		System.out.println("ORG01 execution successfull!!");
		Thread.sleep(3000);
}
}

