package all_feature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regestration {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Rahul");
		
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("software Tester");
		
		driver.findElement(By.xpath("(//textarea[@class='form-control ng-pristine ng-untouched ng-valid'])[1]")).sendKeys("HSR layout");
		
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("Rahul@gmail.com");
		
		driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("8879546231");
		
		driver.findElement(By.xpath("(//input[@value='Male'])[1]")).click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size = checkbox.size();
		
		for(int i=0; i<size; i++) {
			
			checkbox.get(i).click();
			
		}
		
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("French");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}