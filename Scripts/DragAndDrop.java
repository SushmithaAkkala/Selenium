package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		// Create browser Instance
		WebDriver driver=new ChromeDriver();
		
		//open test app
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//maximize the application
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement des= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions actions=new Actions(driver);
		Thread.sleep(4000);
		actions.dragAndDrop(src, des).build().perform();
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		actions.dragAndDrop(src1, des1).build().perform();
		
		Thread.sleep(4000);
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement des2= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		actions.dragAndDrop(src2, des2).build().perform();
		
		Thread.sleep(4000);
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des3= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		actions.dragAndDrop(src3, des3).build().perform();
		
		
		
		
		
		
		
		
		

	}

}
