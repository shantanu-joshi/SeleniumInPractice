package SeleniumRevise.SeleniumProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/checkboxes");
		
		dr.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		
	//	dr.quit();

	}

}
