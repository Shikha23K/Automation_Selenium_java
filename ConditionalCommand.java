package test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ConditionalCommand {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement user=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		//isDisplayed()
		//isEnabled()
		if(user.isDisplayed() && user.isEnabled())
			{
				
				user.sendKeys("standard_user");
				System.out.println("Search box displayed  : "+user.isEnabled());
			}
		System.out.println("Search button displayed  : "+pwd.isDisplayed());
		if(pwd.isDisplayed() && pwd.isEnabled())
			{	
				pwd.sendKeys("secret_sauce");
				System.out.println("Search button displayed  : "+pwd.isEnabled());
			}
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement fem=driver.findElement(By.xpath("//*[@id=\"sex-1\"]"));
		WebElement male=driver.findElement(By.xpath("//*[@id=\"sex-0\"]"));
		if(male.isSelected()==false)
			fem.click();
		else
			male.click();
		driver.close();
		System.out.println("Female Radio button seletion  : "+fem.isSelected());		
		System.out.println("Male Radio button seletion : "+male.isSelected());
			
	}

}
