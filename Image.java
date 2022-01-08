package week2.day2;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		driver.navigate().back();
		
		Actions action = new Actions(driver);
		WebElement mouseclickimage = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
		action.moveToElement(mouseclickimage).click().perform();
	}
	

}
