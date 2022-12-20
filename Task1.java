package assign5;
/*Open below application
*https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Capture the application url and verify url ends with “login”
Capture the application url and verify url contains “demo”
Capture the application title and verify title contains HRM 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String url=driver.getCurrentUrl();
		boolean verify=url.endsWith("login");
		System.out.println(url+" "+verify);
		
		boolean contains=url.contains("demo");
		System.out.println(contains);
		
		String title=driver.getTitle();
		boolean verify1=title.contains("HRM");
		System.out.println(title+" "+verify1);
		
		driver.quit();
	}

}
