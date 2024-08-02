package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a loginPage POM class
 * @author Anish Babu 
 */
public class Loginpage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement UsernameTextfield;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PasswordTextfield;
	
	@FindBy(xpath="(//input[@value='Login'])[2]")
	private WebElement LoginButton;

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getusernameTextfield() {
		return UsernameTextfield;
		}
	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
		
	}
	public WebElement getLoginButton() {
		return LoginButton;
		
	}
	/**
	 * this is a business library method to perform login operation to application
	 * @param Username
	 * @param Password
	 */
	public void loginToApplication(String Username, String Password)
	{
		getusernameTextfield().sendKeys("admin");
		getPasswordTextfield().sendKeys("root");
		getLoginButton().click();
	}
}
