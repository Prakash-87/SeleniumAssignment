package W2D3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonoperations {

	public static void main(String[] args) throws InterruptedException 
	{
		int repeat=0;
		System.setProperty("webdriver.chrome.driver","E:\\Java\\eclipse\\basics\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//span[text()='Click']")).click();
        String gettitle=driver.getTitle();
		if(gettitle.equals("Dashboard"))
		{
		System.out.println(gettitle);	
		}
		else
		{
		System.out.println("Dashboard is not title of the page");	
		}
		driver.navigate().back();
		WebElement web=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean result=web.isEnabled();
		System.out.println(result);
		WebElement print=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]"));
		System.out.println("Position of the button: "+print.getLocation());
		WebElement getcolor=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
        System.out.println("Background Color of the Button: "+getcolor.getCssValue("color"));
        WebElement heightwidth=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
       int h= heightwidth.getSize().getHeight();
       int w=heightwidth.getSize().getWidth();
       System.out.println("Height of Submit Button: "+h+"Width of Submit Button: "+w);
       driver.close();
	}
}