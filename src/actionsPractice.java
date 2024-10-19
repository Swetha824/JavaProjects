import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> it = wind.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String userName = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0].trim();
		System.out.println(userName);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(userName);
		
		
		

	}

}
