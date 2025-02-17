package all_feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanmic_element {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// we use wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 // Locate username & password fields, login button
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        // Perform login with valid credentials
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
       
		
		
		
		

	}

}
