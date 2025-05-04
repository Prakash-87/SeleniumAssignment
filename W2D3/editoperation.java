package W2D3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class editoperation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java\\eclipse\\basics\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		WebElement element = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']")).click();
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='createLeadForm_companyName']")));
        element1.sendKeys("Orion Innovation");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Prakash");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("A");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prakash");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("Having 7.3 Years of Testing Experience");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("prakashfrenz@gmail.com");
        WebElement state=driver.findElement(By.xpath("//select[@name=\"generalStateProvinceGeoId\"]"));
        Select sel=new Select(state);
        sel.selectByVisibleText("New York");
        Thread.sleep(3000);
      /*WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@id='ext-gen588']/input")));
        element2.click();*/
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        System.out.println(driver.getTitle());
        driver.close();
        
}
}