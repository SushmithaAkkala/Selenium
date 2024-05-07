package Amazon_Script1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_FooterLinks3 {

	public static void main(String[] args) throws Exception {
		//create browser instance
		WebDriver driver=new ChromeDriver();
		//open test app
		driver.get("https://www.amazon.in");
		//identify the element
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Noise");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']/span[text()=' smart watches']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/a[2]/div/div[1]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-logo-sprites")).click();
		Thread.sleep(3000);
	    
		
	     
		driver.findElement(By.linkText("Facebook")).click();
		System.out.println("opened facebook");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Twitter")).click();
		System.out.println("opened twitter");
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Instagram")).click();
	    System.out.println("opened insta");
	    
		

	}

}
