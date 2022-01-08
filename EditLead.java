package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		//driver.findElement(By.name("firstName")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("ahalya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("correct page - "+driver.getTitle());
		}else {
			System.out.println("wrong page - "+driver.getTitle());
		}
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Noesys234");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyname.contains("Noesys234")) {
			System.out.println("company name updated");
		}else {
			System.out.println("company name is not updated");
		}
	}

}
