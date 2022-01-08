package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[1]")).isSelected());
		driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[@type='checkbox'][2]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[@type='checkbox'][2]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[@type='checkbox'][3]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[@type='checkbox'][4]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[@type='checkbox'][5]")).click();
		
	}

}
