package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadpage;
import ObjectRepo.Homepage;
import ObjectRepo.LeadPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;

public class LE_01 extends BaseClass
{
	@Test(groups = "regression")
public void le01Tc() throws Exception
{
	ExcelutilityorLib EUTIL=new ExcelutilityorLib();
	String FNAME=EUTIL.readDatafromexcel("Leads", 2, 1);
	String LNAME=EUTIL.readDatafromexcel("Leads", 2, 2);
	String CNAME=EUTIL.readDatafromexcel("Leads", 2, 3);
	
	Homepage hp=new Homepage(driver);
	hp.clickOnLeads();
	LeadPage lp=new LeadPage(driver);
	lp.clickOnCreateLeadButton();
	
	CreatingNewLeadpage CNL=new CreatingNewLeadpage(driver);
	CNL.createLead(FNAME, LNAME, CNAME);
	System.out.println("LE01 execution successfull!!");
	
}
}

