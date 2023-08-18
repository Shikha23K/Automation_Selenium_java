package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqaCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
		//driver.findElement(By.cssSelector("#isAgeSelected")).click();
		//String lable1=driver.findElement(By.id("txtAge")).getText();
		//System.out.println(lable1);
		WebElement op1=driver.findElement(By.xpath("//*[@value='Male']"));
		
		op1.click();
		boolean isIt=op1.isSelected();
		System.out.println(isIt);
		//driver.close();
		
	}

}
