package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("size")).getSize());
	}

}
