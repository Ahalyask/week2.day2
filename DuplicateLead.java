package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("aa");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead")) {
			System.out.println("correct page - "+title);
		}else {
			System.out.println("wrong page - "+title);
		}
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String name1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name1);
		if(name.contains(name1)) {
			System.out.println("yes "+name+ " is duplicate lead");
		}else {
			System.out.println(name+" is not duplicate lead");
		}
	}

}
