package assign5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Open below application and verify logo is present or not
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
*/
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']"));
		boolean verify=logo.isDisplayed();
		System.out.println("Logo is present or not :" +verify);
		driver.quit();
	}

}
