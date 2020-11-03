package Student.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NukariWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.naukri.com/"); 
	     @SuppressWarnings("unused")
		 Set<String> parenthandel = driver.getWindowHandles();
	     
	     List<String> wind = new ArrayList<String>(parenthandel);
//	     for (String windows : parenthandel) {
//	     driver.switchTo().window(windows);             //close prent to child 
//	     driver.close();
//	     }
	     for (int i = wind.size() - 1 ; i >= 0; i--) {  // close child to parent
			driver.switchTo().window(wind.get(i));
			driver.close();
		}
	     
	}

}
