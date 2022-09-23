package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("‪C:\\Users\\EI13125\\Downloads\\WebTable.html");
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]")).click();

	}

}
