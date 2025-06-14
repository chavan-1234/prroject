package baseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
   public WebDriver driver;
    
    @Parameters("browser")
	@BeforeClass
  public void setup(String br) throws IOException {
	  
		switch (br) {
		case "chrome": driver= new ChromeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		default:  System.out.println("didnt browser"); return;
		
			
		}
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prroject\\config.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		driver.get(pro.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
  }
    
                public void teardown() {
                	if(driver!= null) {
                	driver.quit();
                	}
                }
                
                
                
                
                
                public String capturescreen(String tname) {
                	String timestamp = new SimpleDateFormat("yy.mm.dd.hh.mm.ss").format(new Date());
                	TakesScreenshot ts=(TakesScreenshot)driver;
                	          File sourcefile = ts.getScreenshotAs(OutputType.FILE);
                String	 targetfilepath=System.getProperty("user.dir")+"Screenshots"+tname+"-" +timestamp+ ".png";
                File targetfile=new File(targetfilepath);
                   sourcefile.renameTo(targetfile);
                   
                return targetfilepath;
                
                }
                
                
                
                
                
                
                
                
                
                
}
