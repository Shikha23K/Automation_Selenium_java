package AutomationProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class useCSS {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		/*driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		driver.findElement(By.cssSelector("#user-message")).sendKeys("Hello World");
		driver.findElement(By.cssSelector("#showInput")).click();
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("222");
		driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("333");
//		driver.findElement(By.xpath("//button[@placeholder='Please enter second value']")).sendKeys("333");
		driver.findElement(By.xpath("//button[text()='Get Sum']")).click();
		int sum=Integer.valueOf(driver.findElement(By.xpath("//*[@id=\"addmessage\"]")).getText());
		if(sum >490)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	*/
		driver.navigate().to("https://phptravels.org/login");
		/*CSS Selector
		1.  tag & ID
				cssSelector("input#id)
		*/
		
		driver.findElement(By.cssSelector("input#inputEmail")).sendKeys("Shikhakumari98@gmail.com");
		
		/*CSS Selector
		1.  tag & class
				cssSelector("input.class)
		*/
		//driver.findElement(By.cssSelector("input.form-control pw-input")).sendKeys("Password");
		driver.findElement(By.cssSelector("input#inputPassword")).sendKeys("Password123");
		

		/*CSS Selector
		1.  tag & attributes
				cssSelector("input[attribute=value]")
		*/
		//driver.findElement(By.cssSelector("i.fa-eye")).click();
		
		/*CSS Selector
		1.  tag,class & attributes
				cssSelector("input.class[attribute=value]")
		*/
		WebElement eye=driver.findElement(By.xpath("/html/body/section/div/div[1]/div/form/div/div[1]/div[3]/div[2]/div[2]/button"));
		eye.click();
		System.out.println(eye.isSelected());
//		WebElement recap=driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]"));
//		System.out.println(recap.isEnabled());
//		recap.click();
//		System.out.println(recap.isSelected());
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]"));
		
		/*CSS Selector
		1.  inner text
			
				cssSelector("font:contains("Value")")
		*/

	}

}
