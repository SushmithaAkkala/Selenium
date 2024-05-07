package Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		//create browser driver
		WebDriver driver=new ChromeDriver();
		//open test application
		driver.get("https://www.facebook.com");
		
		//click on create account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		//select day
		WebElement daydropdown=driver.findElement(By.id("day"));
		Select dropdown=new Select(daydropdown);
		dropdown.selectByValue("9");
		Thread.sleep(2000);
		
		//select month
		WebElement month=driver.findElement(By.id("month"));
		Select dropdown1=new Select(month);
		dropdown1.selectByIndex(8);
		
		//select year
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.id("year"));
		Select dropdown2=new Select(year);
		dropdown2.selectByVisibleText("2009");
		
		//close browser
		driver.close();
		
		
		

	}

}
