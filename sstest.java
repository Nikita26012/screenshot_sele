package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class sstest {
	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub)
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=amazon+online+shopping");
		//dr.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click(); 
		String t="Amzaon";
		System.out.println("exp titile " +t);
		String t1=dr.getTitle();
		System.out.println("actual title " +t1);
		if(t1.contains(t))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		TakesScreenshot ts=  (TakesScreenshot)dr;
		File srcfile=((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\91917\\Pictures\\Screenshots","Image8.jpeg");
		Files.copy(srcfile, destfile);
		dr.quit();
	}
}

