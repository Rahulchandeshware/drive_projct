package all_feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//using click action method

		driver.get("https://www.browserstack.com/");
		Actions action = new Actions(driver); 
		
		WebElement element = driver.findElement(By.linkText("Get started free"));

		action.moveToElement(element).click();

	}

}
