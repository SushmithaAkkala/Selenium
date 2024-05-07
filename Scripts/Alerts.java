package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		/* alerts are confirmation popups, these are 3 types
		 *             1. simple alert(contains only basic info and ok button)
		 *             2. Confirmation alert(contains basic info and ok and canel)
		 *             3. prompt alert (contains some info with textbox)  
		 */
		//create browser instance
		WebDriver driver= new ChromeDriver();
	
		//open test app
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		//1.simple alert
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		//identify the element
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		//accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//2.confirmation alert
		//identify the alert
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		//identify another linked element
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		//dismiss the alert
		driver.switchTo().alert().dismiss();
		
		//alert with textbox
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		//identify linked element
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(3000);
		
		//text in alert and click on ok
		driver.switchTo().alert().sendKeys("sushmitha");
		driver.switchTo().alert().accept();
		
		
		
	}

}
