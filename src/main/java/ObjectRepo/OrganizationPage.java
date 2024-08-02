package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is a pom class to click on create org button
 * 
 */
public class OrganizationPage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgButton;

	public WebElement getCreateNewOrgButton() {
		return createNewOrgButton;
	}

	public OrganizationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * business library to click on create new organisation
	 */
	public void ClickOnCreateOrgButton()
	{
		createNewOrgButton.click();
	}

}
