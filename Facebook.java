package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation projects\\SeleniumProject\\driverfolder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ahalya");
		driver.findElement(By.name("lastname")).sendKeys("S K");
		driver.findElement(By.name("reg_email__")).sendKeys("ahalya@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("wertfde");
		WebElement day = driver.findElement(By.id("day"));
		Select dd1 = new Select(day);
		dd1.selectByIndex(18);
		WebElement month = driver.findElement(By.id("month"));
		Select dd2 = new Select(month);
		dd2.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select dd3 = new Select(year);
		dd3.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		
	}

}
