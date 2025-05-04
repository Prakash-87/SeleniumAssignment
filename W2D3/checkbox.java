package W2D3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java\\eclipse\\basics\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://leafground.com/checkbox.xhtml");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Basic']")).click();
        driver.findElement(By.xpath("//span[text()='Ajax']")).click();
        driver.findElement(By.xpath("//label[text()='Java']")).click();
        driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
        driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul")).click();
        WebElement enable=driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']"));
        boolean e=enable.isEnabled();
        System.out.println(e);
        driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul/li[4]/div")).click();
        driver.findElement(By.xpath("//li[@data-item-value='Paris']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
        Actions act =  new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"))).click().perform();
        driver.findElement(By.xpath("//li[@data-item-value='Miami']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
        driver.close();
}
}