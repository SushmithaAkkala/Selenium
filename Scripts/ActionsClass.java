package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClass {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		//open browser instance
		driver.get("https://www.amazon.in");
	//identify the element
		WebElement accountsandsign=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	  Actions actions=new Actions(driver);
	  actions.moveToElement(accountsandsign).build().perform();
	  Thread.sleep(2000);
	  WebElement youracc=driver.findElement(By.xpath("//a//span[text()='Your Account']"));
	  actions.moveToElement(youracc).click().build().perform();
		
		
		
	}

}
