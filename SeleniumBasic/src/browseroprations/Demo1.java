package browseroprations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https;//demo.actitime.com/");
String sourceCode=driver.getPageSource();
System.out.println("Appliction source Code:"+sourceCode);
System.out.println("Source Code Length:"+sourceCode.length());
System.out.println("Apllication Current URL:"+driver.getCurrentUrl());
System.out.println("Apllication Current Title:"+driver.getTitle());
if(driver.getTitle().equals("Actitime")){
	System.out.println("Actitime Page Open Succesfully");
}else {System.out.println("Actitime Page not Open");
}
driver.close();
	}

}
