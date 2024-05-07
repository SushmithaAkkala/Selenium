package DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_FindElements {

	public static void main(String[] args) throws Exception {
	/* Array is used to store multiple values in single array. Size limit is there
	 * Collections is a type of framework, it doesnt contain any size limit.
	 *FindElement=Used  to identify specific element
	 *FindElements=used to identify group of elements.
	 */
		//create browser instance
		WebDriver driver= new ChromeDriver();
		//open test application
		driver.get("https://www.amazon.in");
		List<WebElement> names= driver.findElements(By.tagName("div"));
		System.out.println(names);
		//to get all names go for iterations
		for(int i=0;i<=names.size();i++)
		{
			Thread.sleep(3000);
			System.out.println(names.get(i).getText());
		}
	}

}
