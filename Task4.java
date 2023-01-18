package assign5;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Task 4
Open the below application and verify the capture all href values from social media icons. 
Store all 4 href values in map in below format.
FaceBook - fburl
Twitter - Twitter url
Youtube - Youtube URL
Linkedin - Linkedin URL
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
*/

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement icon1=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement icon2=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement icon3=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement icon4=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		/*
		String fb=icon1.getText();
		System.out.println(fb);
		*/
		Map<String, WebElement> socialMedia=new LinkedHashMap <>();
		socialMedia.put("FaceBook", icon1);
		socialMedia.put("Twitter", icon2);
		socialMedia.put("Youtube", icon3);
		socialMedia.put("Linkedin", icon4);
		
		System.out.println(socialMedia);
		
	}

}
