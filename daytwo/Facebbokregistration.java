package assignment.weektwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebbokregistration {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\Java\\eclipse\\basics\\Driver\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://en-gb.facebook.com");
Thread.sleep(2000);
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(2000);
driver.findElement(By.name("firstname")).sendKeys("A");	
driver.findElement(By.name("lastname")).sendKeys("B");
WebElement ele=driver.findElement(By.id("day"));
Select sel=new Select(ele);
sel.selectByIndex(10);
WebElement mon=driver.findElement(By.id("month"));
Select month=new Select(mon);
month.selectByVisibleText("Apr");
WebElement y=driver.findElement(By.id("year"));
Select year=new Select(y);
year.selectByValue("2000");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Male']/input")).click();
driver.findElement(By.name("reg_email__")).sendKeys("xx@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("Welcomekpmg@2023");
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
Thread.sleep(2000);
String pagename=driver.getTitle();
System.out.println(pagename);
Thread.sleep(5000);
driver.close();
			}

		}



