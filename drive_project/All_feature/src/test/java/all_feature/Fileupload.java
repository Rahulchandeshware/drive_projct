package all_feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//	driver.manage().timeouts().implicitlyWait(20,timeout);


		driver.get("https://demoqa.com/upload-download");

		// upload files20
		driver.findElement(By.xpath("//input[@id='uploadFile'])[1]")).sendKeys("C:\\java learning\\drive_project\\test_data\\test.xlsx");
		

	}

}
