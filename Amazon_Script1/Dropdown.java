package Amazon_Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		//create a browser instance
		WebDriver driver= new ChromeDriver();
		
		//open test application
		driver.get("https://www.amazon.in");
		
		/*identify dropdown
		 * an object for select class and pass the webelement as arg
		 
		
		
		
		Thread.sleep(2000);
		dropdown.selectByIndex(0);*/
		driver.findElement(By.id("searchDropdownBox")).click();
		WebElement drpdwn=driver.findElement(By.id("searchDropdownBox"));
		Select dropdown=new Select(drpdwn);
		dropdown.selectByIndex(1);
		
		
		
		
		

	}

}
