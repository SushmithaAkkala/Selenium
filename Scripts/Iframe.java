package Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws Exception 
	{
		//iframe=a frame within main frame is iframe
		//process----open application,identify iframe, switch the driver from main frame to another frame.
		
		//create browser instance
		WebDriver driver= new ChromeDriver();
	    
		//maximize the browser
		driver.manage().window().maximize();
		
		//open test application
		driver.get("https://demo.guru99.com/");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Guru99 Demo Page')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dismiss-button")).click();
		

	}

}
