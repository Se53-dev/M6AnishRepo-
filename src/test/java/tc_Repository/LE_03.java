package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadpage;
import ObjectRepo.Homepage;
import ObjectRepo.LeadPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;

public class LE_03 extends BaseClass
{
	@Test(groups = "smoke")
public void le03Tc() throws Exception
{
	ExcelutilityorLib EUTIL=new ExcelutilityorLib();
	String FNAME=EUTIL.readDatafromexcel("Leads", 8, 1);
	String LNAME=EUTIL.readDatafromexcel("Leads", 8, 2);
	String CNAME=EUTIL.readDatafromexcel("Leads", 8, 3);
	String Title=EUTIL.readDatafromexcel("Leads", 8, 4);
	String PHONE=EUTIL.readDatafromexcel("Leads", 8, 5);
	String MOBILE=EUTIL.readDatafromexcel("Leads", 8, 6);
	String EMAIL=EUTIL.readDatafromexcel("Leads", 8, 7);
	String NOE=EUTIL.readDatafromexcel("Leads", 8, 8);
	

	
	Homepage hp=new Homepage(driver);
	hp.clickOnLeads();
	LeadPage lp=new LeadPage(driver);
	lp.clickOnCreateLeadButton();
	
	CreatingNewLeadpage CNL=new CreatingNewLeadpage(driver);
	CNL.createLead(FNAME, LNAME, CNAME,Title, PHONE, MOBILE, EMAIL, NOE);
	System.out.println("LE03 execution successfull!!");

}
}
