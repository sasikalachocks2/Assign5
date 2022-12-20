package assign5;
/*Open below application and verify that footer has 4 social media icons
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement socialMedia=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		boolean lnk=socialMedia.isDisplayed();
		System.out.println("Linkedin icon :"+lnk);
		
		WebElement socialMedia1=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		boolean fb=socialMedia1.isDisplayed();
		System.out.println("Facebook icon :"+fb);
				
		WebElement socialMedia2=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		System.out.println("Twitter icon :"+socialMedia2.isDisplayed());
		
		WebElement socialMedia3=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		System.out.println("Youtube icon :"+socialMedia3.isDisplayed());
		
		driver.quit();
				
	}

}
