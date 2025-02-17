package all_feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		
      //initializad driver
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(2000); // Wait for page to load

        // Locate username & password fields, login button
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        // Perform login with valid credentials
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
        Thread.sleep(3000); // Wait for login
        
	}

}
