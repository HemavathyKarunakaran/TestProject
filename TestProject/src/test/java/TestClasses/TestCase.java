package TestClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
public static WebDriver driver;
	
	/*@DataProvider(name = "filterData")
	public Object[][] filterData() throws IOException {
		
		File src = new File("C:\\Users\\Mani\\git\\TestProject\\TestProject\\TestData\\Douglas.xlsx");
		FileInputStream fileInputStream = new FileInputStream(src);
	    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
	    XSSFSheet sheet = workbook.getSheetAt(0);

	    int rowCount = sheet.getPhysicalNumberOfRows();
	    Object[][] data = new Object[rowCount-1][5];

	    for (int i=1; i<rowCount; i++) {
	        data[i-1][0] = sheet.getRow(i).getCell(0).getStringCellValue();
	        data[i-1][1] = sheet.getRow(i).getCell(1).getStringCellValue();
	        data[i-1][2] = sheet.getRow(i).getCell(2).getStringCellValue();
	        data[i-1][3] = sheet.getRow(i).getCell(3).getStringCellValue();
	        data[i-1][4] = sheet.getRow(i).getCell(4).getStringCellValue();
	    }

	    workbook.close();
	    fileInputStream.close();

	    return data;
	}
	
	@BeforeClass
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.douglas.de/de");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		SearchContext shadow=driver.findElement(By.cssSelector("#usercentrics-root")).getShadowRoot();
		shadow.findElement(By.cssSelector(".sc-dcJsrY.eIFzaz")).click();		
	}
	
	
	@Test(dataProvider="filterData")
	public void test(String criteria, String producttype, String brand, String gender, String gift) throws InterruptedException
	{
	
	WebElement perfum=driver.findElement(By.xpath("//div[@class='swiper-wrapper']//a[text()='"+criteria+"']"));
	if(perfum.isDisplayed())
	{
	perfum.click();
	}else
	{
		WebElement icon=driver.findElement(By.xpath("//*[@class='button button__with-icon button__normal swiper-arrow swiper-arrow swiper-button-next swiper-next']//*[@class='PtbKk9ogBoi2GdnLM7lW Q2V8KxgHDakQ2L3catrp']"));
		icon.click();
	}
	
	WebElement productart=driver.findElement(By.xpath("//div[@data-testid='classificationClassName']"));
	productart.click();
	Thread.sleep(2000);
	WebElement filter1=driver.findElement(By.xpath("//div[@class='facet-option__label']//div[text()='"+producttype+"']"));
	filter1.click();
	Thread.sleep(2000);
	WebElement marke=driver.findElement(By.xpath("//div[@data-testid='brand']"));
	marke.click();
	Thread.sleep(2000);
	WebElement filter2=driver.findElement(By.xpath("//div[@class='facet-option__label']//div[text()='"+brand+"']"));
	filter2.click();
	WebElement forwhom=driver.findElement(By.xpath("//div[@data-testid='gender']"));
	forwhom.click();
	WebElement filter3=driver.findElement(By.xpath("//div[text()='"+gender+"']"));
	filter3.click();
	
	
	WebElement more=driver.findElement(By.xpath("//*[@class='PtbKk9ogBoi2GdnLM7lW Q2V8KxgHDakQ2L3catrp facet-list__show-more-icon']"));
	if(more.isDisplayed())
	{
		more.click();
	}
	
	WebElement giftfor=driver.findElement(By.xpath("//div[@data-testid='Geschenk für']"));
	giftfor.click();
	WebElement filter4=driver.findElement(By.xpath("//div[text()='"+gift+"']"));
	filter4.click();
	
	
	List<WebElement> products = driver.findElements(By.xpath("(//div[@class='ui-grid product-grid-row'])[1]//div[text()='Acqua di Parma']"));
    for (WebElement product : products) {
        System.out.println(product.getText());
    }
	}

	
	@AfterClass()
	public void tearDown()
	{
		driver.quit();
	}
	
*/

}
