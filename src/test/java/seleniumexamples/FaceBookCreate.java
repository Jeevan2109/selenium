package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCreate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");//chrome.driver path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");//link of FACE BOOK CREATE ACCOUNT PAGE
		driver.findElement(By.name("firstname")).sendKeys("Jeevan");//FirstName
		driver.findElement(By.name("lastname")).sendKeys("Kumar");//LAST NAME
		
		driver.findElement(By.name("reg_email__")).sendKeys("jk@gmail.com");//GMAIL
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jk@gmail.com");//RE ENTER GMAIL	
		driver.findElement(By.name("reg_passwd__")).sendKeys("2109@2109");//PASSWORD MUST BE UNIQUE SPL CHAR
		
		driver.findElement(By.name("birthday_day")).sendKeys("21");//DATE
		driver.findElement(By.id("month")).sendKeys("Sep");//MONTH
		driver.findElement(By.id("year")).sendKeys("2001");//YEAR
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();//GENDER
		driver.findElement(By.name("websubmit")).click();//SING UP
		
	}

}
