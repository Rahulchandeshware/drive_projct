package all_feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//initializad driver

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(2000); // Wait for page to load
		
		// Select a radio button
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio2']"));
        radioButton.click();
        System.out.println("Radio button selected: " + radioButton.isSelected());

        // Select a checkbox
        WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));
        checkBox1.click();
        checkBox2.click();

        // Verify if checkboxes are selected
        System.out.println("Checkbox 1 selected: " + checkBox1.isSelected());
        System.out.println("Checkbox 2 selected: " + checkBox2.isSelected());

        // Close the browser
      //  driver.quit();
		
		

		

	}

}
