import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;


public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String monthNo = "7";
		String date = "10";
		String year = "2024";
		
		String inputDate = year + "-" + monthNo + "-" + date ;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		List<WebElement> Months = driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"));
		Months.get(Integer.parseInt(monthNo)-1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		
		System.out.println(driver.findElement(By.className("react-date-picker__inputGroup")).getText());
		String selectedDate = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']//input")).getAttribute("value");
		System.out.println(selectedDate);
		
		
		
	}
}