package assignment.weektwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java\\eclipse\\basics\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		WebElement element = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.xpath("//*[text()='Create Account']")).click();
		WebElement acc=driver.findElement(By.xpath("//*[@id='accountName']"));
		acc.sendKeys("Z");
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Selenium Automation Tester");
		WebElement indcheck=driver.findElement(By.xpath("//*[@name='industryEnumId']"));
		Select industry=new Select(indcheck);
		industry.selectByIndex(3);
		WebElement own=driver.findElement(By.xpath("//*[@name='ownershipEnumId']"));
		Select Ownership=new Select(own);
		Ownership.selectByVisibleText("S-Corporation");
		WebElement sou=driver.findElement(By.id("dataSourceId"));
		Select Source=new Select(sou);
		Source.selectByValue("LEAD_EMPLOYEE");
		WebElement mar=driver.findElement(By.xpath("//*[@id='marketingCampaignId']"));
		Select marketing=new Select(mar);
		marketing.selectByIndex(6);
		WebElement sta=driver.findElement(By.xpath("//*[@name='generalStateProvinceGeoId']"));
		Select state=new Select(sta);
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
//		if(acc.sendKeys("Z"))	
//		{
//		System.out.print(acc+"AccountName is Correct");
//		}
//		else
//		{
//		System.out.print(acc+"AccountName is not Correct");	
//		}
		Thread.sleep(3000);
		driver.close();
		
		
		//Ownership.selectByIndex(0);
		/*
		driver.findElement(By.linkText("Leads")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(source);
		emp.selectByIndex(4);
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select cooperation=new Select(ownership);
		cooperation.selectByValue("OWN_CCORP");
		WebElement marketing=driver.findElement(By.name("marketingCampaignId"));
		Select automobiles=new Select(marketing);
		automobiles.selectByVisibleText("Automobile");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String currentpageTitle = driver.getTitle();
		System.out.println(currentpageTitle);
		driver.close();
*/
	}

}
