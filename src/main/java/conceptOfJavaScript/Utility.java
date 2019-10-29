
/**
 * Highlight element in Selenium using JavaScriptExecutor: INTERFACE

Must have feature Highlight element Selenium for better execution.
In Automation, testing sometimes element highlighter plays very important role. 

It helps us to track our execution flow which step is being processed. 
Some tools like QTP, Sahi etc. you will get this inbuilt feature. 

For Selenium, we have to write small code, which simply highlights element based on our parameter values. 
let’s get started and see Highlight element Selenium using CSS values.

In Selenium, we can use JavascriptExecutor (interface) to execute Javascript code into webdriver.
 */


package conceptOfJavaScript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String backgrounndColor = element.getCssValue("backgroundColor");
				for(int i=0; i<100; i++) {
					changeColor("rgb(0,200,0)", element, driver);
					changeColor(backgrounndColor,element,driver);
				}
	}
	
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}
		
	}
	

}
