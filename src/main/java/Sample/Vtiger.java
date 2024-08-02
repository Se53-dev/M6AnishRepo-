package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtiger {
	public static void main(String[] args) throws Exception {
		Select S=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin", Keys.TAB , "root", Keys.ENTER);
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		WebElement FN=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		S=new Select(FN);
		S.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Babu", Keys.TAB, "8970151067", Keys.TAB ,"Carelon", Keys.TAB, "8970151067");
		WebElement LS=driver.findElement(By.xpath("//select[@name='leadsource']"));
		S=new Select(LS);
		S.selectByValue("Employee");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anishbabu94@yahoo.com");
		Thread.sleep(2000);
		WebElement ind=driver.findElement(By.xpath("//select[@name='industry']"));
		S=new Select(ind);
		S.selectByIndex(17);
		WebElement LeadStatus=driver.findElement(By.xpath("//select[@name='leadstatus']"));
		S=new Select(LeadStatus);
		S.selectByIndex(4);
		WebElement Rat=driver.findElement(By.xpath("//select[@name='rating']"));
		S=new Select(Rat);
		S.selectByIndex(2);
	driver.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("Flat#211, SLV Flora Apartment", Keys.TAB, "Hormavu Agara", Keys.TAB, "560043", Keys.TAB, "Bangalore", Keys.TAB, "India", Keys.TAB, "karnataka");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
		
		
		
	}


}
