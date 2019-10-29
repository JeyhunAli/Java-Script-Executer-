
/**
 * in selenium we can use javascript executer and one utility method to highlight the method advantages of this 
 * i can see the my element which is interacting with my command 
 * i can have regulation on that 
 * here this flashing method is not applicable for all the elements it will slower our application
 * its exactly for the specific elements 
 * 
 * 
 * Do something amazing and cool stuff with JavaScriptExecutor With Selenium WebDriver:

1. Highlight an Element
2. DrawBorder around an Element
3. Generate custom Alert during Test Execution
4. Click on an Element by using JaveScript
5. Refresh browser by using JavaScript
6. Get Title by using JavaScript
7. Get InnerText of page by using JavaScript
8. Scroll Into View and Scroll Page Down
 * 
 */


package conceptOfJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighligtTheElement extends Utility{


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jeyhun01");


		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("789456");

		WebElement loginButton = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		flash(loginButton,driver);
		loginButton.click();

        Actions action = new Actions(driver);
		driver.switchTo().frame("mainpanel");
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(20000);





	}



































}
