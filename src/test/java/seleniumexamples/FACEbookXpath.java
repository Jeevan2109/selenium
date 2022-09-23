package seleniumexamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FACEbookXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");//chrome.driver path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");//link of FACE BOOK CREATE ACCOUNT PAGE
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jeevan");//FirstName
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");//LAST NAME
		
		driver.findElement(By.name("reg_email__")).sendKeys("jk@gmail.com");//GMAIL
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jk@gmail.com");//RE ENTER GMAIL	
		driver.findElement(By.name("reg_passwd__")).sendKeys("2109@2109");//PASSWORD MUST BE UNIQUE SPL CHAR
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("21");
		
		driver.findElement(By.id("month")).sendKeys("Sep");//MONTH
		driver.findElement(By.id("year")).sendKeys("2001");//YEAR
		
		driver.findElement(By.xpath("//input[@value='2']")).click();//GENDER
		driver.findElement(By.name("websubmit")).click();//SING UP
		
	}

	}


