package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadpage;
import ObjectRepo.Homepage;
import ObjectRepo.LeadPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;

public class LE_04 extends BaseClass
{
	@Test(groups = "smoke")
public void le04Tc() throws Exception
{
	ExcelutilityorLib EUTIL=new ExcelutilityorLib();
	String FNAME=EUTIL.readDatafromexcel("Leads", 11, 1);
	String LNAME=EUTIL.readDatafromexcel("Leads", 11, 2);
	String CNAME=EUTIL.readDatafromexcel("Leads", 11, 3);
	String ST=EUTIL.readDatafromexcel("Leads", 11, 4);
	String POBOX=EUTIL.readDatafromexcel("Leads", 11, 5);
	String PCODE=EUTIL.readDatafromexcel("Leads", 11, 6);
	String CITY=EUTIL.readDatafromexcel("Leads", 11, 7);
	String COUNTRY=EUTIL.readDatafromexcel("Leads", 11, 8);
	String STATE=EUTIL.readDatafromexcel("Leads", 11, 9);

	
	Homepage hp=new Homepage(driver);
	hp.clickOnLeads();
	LeadPage lp=new LeadPage(driver);
	lp.clickOnCreateLeadButton();
	
	CreatingNewLeadpage CNL=new CreatingNewLeadpage(driver);
	CNL.createLead(FNAME, LNAME, CNAME, ST, POBOX, PCODE, CITY, COUNTRY, STATE);
	System.out.println("LE04 execution successfull!!");
}
}
