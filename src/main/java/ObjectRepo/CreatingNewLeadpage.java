package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is createLead class
 * @author Anish Babu
 * @version 7.1.24
 */

public class CreatingNewLeadpage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	 
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNo;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noofEmp;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	
	
	public CreatingNewLeadpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNoofEmp() {
		return noofEmp;
	}
	public WebElement getStreet() {
		return street;
	}
	public WebElement getPoBox() {
		return poBox;
	}
	public WebElement getPostalCode() {
		return postalCode;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * Business logic
	 */
      public void createLead(String fname, String lname , String comp)
      {
    	  firstName.sendKeys(fname);
    	  lastName.sendKeys(lname);
    	  company.sendKeys(comp);
    	  saveBtn.click();
      }
      /**
       * this is business library to create lead with all creds
       * 
       */
     public void createLead(String fname, String lname, String comp,String desg, String phNo, String mob, String mailId, 
    		 String employees, String strt, String pb, String postcode, String city, String cntry, String st )
     {
    	 firstName.sendKeys(fname);
    	 lastName.sendKeys(lname);
    	 company.sendKeys(comp);
    	 title.sendKeys(desg);
    	 phone.sendKeys(phNo);
    	 mobileNo.sendKeys(mob);
    	 email.sendKeys(mailId);
    	 noofEmp.sendKeys(employees);
    	 street.sendKeys(strt);
    	 poBox.sendKeys(pb);
    	 postalCode.sendKeys(postcode);
    	 City.sendKeys(city);
    	 Country.sendKeys(cntry);
    	 State.sendKeys(st);
    	 saveBtn.click();
    	 
     }
     /**
      * this is business library to create lead with employee creds
      */
     public void createLead(String fname, String lname, String comp,String desg, String phNo, String mob, String mailId, 
    		 String employees)
     {
    	 firstName.sendKeys(fname);
    	 lastName.sendKeys(lname);
    	 company.sendKeys(comp);
    	 title.sendKeys(desg);
    	 phone.sendKeys(phNo);
    	 mobileNo.sendKeys(mob);
    	 email.sendKeys(mailId);
    	 noofEmp.sendKeys(employees);
    	 saveBtn.click();
     }
     /**
      * this is business library to create lead with employee address
      */
     public void createLead(String fname, String lname, String comp,String strt, String pb, String postcode, String city, 
    		 String cntry, String st)
     {
    	 firstName.sendKeys(fname);
    	 lastName.sendKeys(lname);
    	 company.sendKeys(comp);
    	 street.sendKeys(strt);
    	 poBox.sendKeys(pb);
    	 postalCode.sendKeys(postcode);
    	 City.sendKeys(city);
    	 Country.sendKeys(cntry);
    	 State.sendKeys(st);
    	 saveBtn.click();
     }
}
