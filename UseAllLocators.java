package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UseAllLocators {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		//driver.findElement(By.xpath("//a[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed']")).click();
		WebElement ele=driver.findElement(By.linkText("Input Form Submit"));
		ele.click();
		WebElement name=driver.findElement(By.name("name"));
		WebElement pwd=driver.findElement(By.id("inputPassword4"));
		WebElement email=driver.findElement(By.id("inputEmail4"));
				
		name.sendKeys("Saroj Singh");
		pwd.sendKeys("password");
		email.sendKeys("shikhakumari98@gmail.com");
		driver.findElement(By.name("company")).sendKeys("None");
		driver.findElement(By.id("websitename")).sendKeys("google.com");
		driver.findElement(By.name("city")).sendKeys("Patna");
		driver.findElement(By.id("inputAddress1")).sendKeys("Boring Road");
		driver.findElement(By.id("inputState")).sendKeys("Bihar");
		driver.findElement(By.id("inputAddress2")).sendKeys("Anandpuri");
		driver.findElement(By.name("zip")).sendKeys("800001");
		driver.findElement(By.xpath("//button[@type='submit' ][text()='Submit']")).click();
	}

}
