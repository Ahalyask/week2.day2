package week2.day2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.navigate().back();
		List<WebElement> findElement = driver.findElements(By.tagName("a"));
		System.out.println("number of links present in the page - "+findElement.size());
		
		
		 try {
			//Use URL Class - Create object of the URL Class and pass the urlLink as parameter
			 String blink = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
			URL link = new URL(blink);
			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			//Set the timeout for 2 seconds
			httpConn.setConnectTimeout(2000);
			//connect using connect method
			httpConn.connect();
			//use getResponseCode() to get the response code.
			if(httpConn.getResponseCode()== 200) {
			System.out.println(blink+" - "+httpConn.getResponseMessage());
			}
			if(httpConn.getResponseCode()== 404) {
			System.out.println(blink+" - "+httpConn.getResponseMessage());
			}
			}
			//getResponseCode method returns = IOException - if an error occurred connecting to the server.
			catch (Exception e) {
			//e.printStackTrace();
			}
	}

}
