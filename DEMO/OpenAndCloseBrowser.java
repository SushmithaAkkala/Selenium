package DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndCloseBrowser {

	public static void main(String[] args) throws InterruptedException {
     //create browser instance
		System.out.println("hello world");
		WebDriver driver=new ChromeDriver();
		//open test application
		driver.get("https://www.amazon.in/");
		System.out.println("browser opened");
		Thread.sleep(4000);
		driver.close();
		System.out.println("browser closed");
	}

}
