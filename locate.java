package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locate {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.chrome.driver","D:\\corizo\\software testing\\All_Drivers\\chromedriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String ExpectTitle= "Single Page Apps for GitHub Pages";//right click->view page source 
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		//Validation
		if(ExpectTitle.equals(ActTitle))
			System.out.println("Test is Passed");
		else
			System.out.println("Test is failed");
		driver.navigate().to("https://www.facebook.com/");
		String ExpectTitle1= "Facebook – log in or sign up";
		String ActTitle1=driver.getTitle();
		//Validation
		if(ExpectTitle1.equals(ActTitle1))
			System.out.println("Test is Passed");
		else
			System.out.println("Test is failed");

		driver.close();
		//driver.close();
	}

}
