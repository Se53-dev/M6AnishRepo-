package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is createOrg class
 * @author Anish Babu
* @version 7.1.24
 */
public class CreateNewOrganizationPage {
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement Website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement empNo;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phno;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherphn;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement Email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement BillingCity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;

	public CreateNewOrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getEmpNo() {
		return empNo;
	}

	public WebElement getPhno() {
		return Phno;
	}

	public WebElement getOtherphn() {
		return otherphn;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getBillingCity() {
		return BillingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * business Library to create organisation with name
	 * @param organizationName
	 * @param web
	 * @param eNum
	 */
	public void createorg(String organizationName, String web, String eNum )
	{
		OrgName.sendKeys(organizationName);
		Website.sendKeys(web);
		empNo.sendKeys(eNum);
		saveBtn.click();
	}
	public void createorg(String organizationName, String web, String eNum, String phnNumber, String othPhNum, String mailId )
	{
		OrgName.sendKeys(organizationName);
		Website.sendKeys(web);
		empNo.sendKeys(eNum);
		Phno.sendKeys(phnNumber);
		otherphn.sendKeys(othPhNum);
		Email.sendKeys(mailId);
		saveBtn.click();
	}
	public void createorg(String organizationName, String web, String BillAdd, String Billcity, String Billstate )
	{
		OrgName.sendKeys(organizationName);
		Website.sendKeys(web);
		BillingAddress.sendKeys(BillAdd);
		BillingCity.sendKeys(Billcity);
		billingState.sendKeys(Billstate);
		saveBtn.click();
	}
	public void createorg(String organizationName, String web, String eNum, String phnNumber, String othPhNum, String mailId,String BillAdd, String Billcity, String Billstate  )
	{
		OrgName.sendKeys(organizationName);
		Website.sendKeys(web);
		empNo.sendKeys(eNum);
		Phno.sendKeys(phnNumber);
		otherphn.sendKeys(othPhNum);
		Email.sendKeys(mailId);
		BillingAddress.sendKeys(BillAdd);
		BillingCity.sendKeys(Billcity);
		billingState.sendKeys(Billstate);
		saveBtn.click();
	}
	
}
