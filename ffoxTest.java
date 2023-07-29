package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ffoxTest {

	public static void main(String[] args) {
//		Invoking firefox
		FirefoxDriver driver= new FirefoxDriver();
//		maximising window
		driver.manage().window().maximize();
//		open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Locating elememts by Name
		By locator=By.name("username");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		driver.findElement(locator).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");;
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		String ExpectTitle= "OrangeHRM";
		String ActTitle=driver.getTitle();
		//Validation
		if(ExpectTitle.equals(ActTitle))
			System.out.println("Test is Passed");
		else
			System.out.println("Test is failed");
		
		
		//driver.close();
		
	}

}
