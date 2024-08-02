package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement SaveButn;

	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveButn() {
		return SaveButn;
	}
	public void createContact(String fname, String lname, String titl)
	{
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		title.sendKeys(titl);
	}

}
