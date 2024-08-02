package tc_Repository;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadpage;
import ObjectRepo.Homepage;
import ObjectRepo.LeadPage;
import genericlib.BaseClass;
import genericlib.ExcelutilityorLib;

public class LE_02 extends BaseClass
{
	@Test(groups = "regression")
public void le02Tc() throws Exception
{
	ExcelutilityorLib EUTIL=new ExcelutilityorLib();
	String FNAME=EUTIL.readDatafromexcel("Leads", 5, 1);
	String LNAME=EUTIL.readDatafromexcel("Leads", 5, 2);
	String CNAME=EUTIL.readDatafromexcel("Leads", 5, 3);
	String Title=EUTIL.readDatafromexcel("Leads", 5, 4);
	String PHONE=EUTIL.readDatafromexcel("Leads", 5, 5);
	String MOBILE=EUTIL.readDatafromexcel("Leads", 5, 6);
	String EMAIL=EUTIL.readDatafromexcel("Leads", 5, 7);
	String NOE=EUTIL.readDatafromexcel("Leads", 5, 8);
	String ST=EUTIL.readDatafromexcel("Leads", 5, 9);
	String POBOX=EUTIL.readDatafromexcel("Leads", 5, 10);
	String PCODE=EUTIL.readDatafromexcel("Leads", 5, 11);
	String CITY=EUTIL.readDatafromexcel("Leads", 5, 12);
	String COUNTRY=EUTIL.readDatafromexcel("Leads", 5, 13);
	String STATE=EUTIL.readDatafromexcel("Leads", 5, 14);

	
	Homepage hp=new Homepage(driver);
	hp.clickOnLeads();
	LeadPage lp=new LeadPage(driver);
	lp.clickOnCreateLeadButton();
	
	CreatingNewLeadpage CNL=new CreatingNewLeadpage(driver);
	CNL.createLead(FNAME, LNAME, CNAME,Title, PHONE, MOBILE, EMAIL, NOE, ST, POBOX, PCODE, CITY, COUNTRY, STATE);
	System.out.println("LE02 execution successfull!!");

}
}