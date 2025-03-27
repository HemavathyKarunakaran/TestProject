package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Util.UtilsClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static XSSFWorkbook workbook;
	public static XSSFCell cell;
	
	public BaseClass()
	{	
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("D:\\Eclipse Workspace\\Douglas\\src\\main\\java\\com\\Douglas\\config\\Config.properties");
			prop.load(file);
			
			File src =new File(prop.getProperty("excelpath"));
			FileInputStream fis = new FileInputStream(src);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheetAt(0);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "D:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(UtilsClass.Page_Load_Timeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilsClass.Implicit_Wait));
		
		driver.get(prop.getProperty("url"));
	
	}
	
	 public static void typeText(WebElement ele, String value)
	 {
		 ele.sendKeys(value);
	 }
	
	 public static void clickShadowElement(WebElement ele, WebElement ele1)
	 {
//		 WebElement shadowElement=ele.getShadowRoot().findElement(By.cssSelector(".sc-dcJsrY.eIFzaz"));
//			shadowElement.click();
		 	WebElement shadowHost=ele;
		 	SearchContext shadowRoot=shadowHost.getShadowRoot();
		 
	 }
	 
	 

	public static void click(WebElement ele)
	 {
		 ele.click();
	 }
	
	 public static void javascriptClick(WebElement ele)
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", ele);
	 }
	 
	 public static void explicitwait(WebElement ele)
	 {
		 WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		 w.until(ExpectedConditions.visibilityOf(ele)).click();
	
			
	 }
	 public static void isDisplayed(WebElement ele) 
	 {
		 ele.isDisplayed();
	 }
	 
	 public static int getRowCount()
	 {
		 return sheet.getPhysicalNumberOfRows();
	 }
	 
	 public static String getDataFromExcel(int row, int col)
	 {
		 cell=sheet.getRow(row).getCell(col);
		 if(cell.getCellType()==CellType.STRING)
		 {
			 return cell.getStringCellValue();
		 }else if(cell.getCellType()==CellType.NUMERIC)
		 {
			 return String.valueOf((int)cell.getNumericCellValue());
		 }
		 return "";
	 }
		 
	 public static void closeExcel() throws IOException
	 {
		 workbook.close();
	 }
	 public static void getTittle() 
	 {
	      String title = driver.getTitle();
		  System.out.println(title);
	 }
	 public static void getUrl() 
	 {
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
	 }
	 public static void closeBrowser()
	 {
		 driver.quit();
	 }

}
