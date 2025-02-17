package all_feature;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_bar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");
		
		
		
		WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]"));
		
		search.click();
		search.sendKeys("laptop");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
		
		String currenturl = driver.getCurrentUrl();
		
		String exp ="https://tutorialsninja.com/demo/index.php?route=product/search&search=laptop";
		
		assertEquals(currenturl,exp);
		
		System.out.println(currenturl);
		
		
		
		
	}

}