package all_feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Tester");

	}

}
