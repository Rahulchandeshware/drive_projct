package all_feature;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_pops {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		Alert alert = driver.switchTo().alert();

		driver.findElement(By.id("alertButton")).click();

		alert.accept();
		
		
		WebElement send = driver.findElement(By.id("(//button[@id='promtButton'])[1]"));
		
		send.sendKeys("sending the message");
		
		
		alert.accept();

	}

}
