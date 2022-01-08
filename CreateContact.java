package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ahalya");
		driver.findElement(By.id("lastNameField")).sendKeys("S K");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("aa");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("SK");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("test");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ahalya@mail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1= new Select(state);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("imp");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
}
