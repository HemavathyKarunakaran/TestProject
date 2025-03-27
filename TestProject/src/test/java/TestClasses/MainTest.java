package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.HomePage;
import com.Util.ReadExcel;

public class MainTest extends BaseClass{
	
	public MainTest()
	{
		super();
	}
	
	@BeforeClass
	public void setUp()
	{
		initialization();
		WebElement shadowElement=driver.findElement(By.cssSelector("#usercentrics-root")).getShadowRoot().findElement(By.cssSelector(".sc-dcJsrY.eIFzaz"));
		shadowElement.click();
	}
	
	
	@Test(dataProvider="filterData", dataProviderClass = ReadExcel.class)
	public void testMethod(String criteria, String producttype, String brand, String gender, String gift) 
	{
		HomePage homePage=new HomePage(driver);
		explicitwait(homePage.perfum(criteria));
		explicitwait(homePage.productartClick());
		explicitwait(homePage.productartFilter(producttype));
		explicitwait(homePage.markeClick());
		explicitwait(homePage.markeFilter(brand));
		explicitwait(homePage.forwhomClick());
		explicitwait(homePage.forwhomFilter(gender));
		explicitwait(homePage.giftforClick());
		explicitwait(homePage.giftforFilter(gift));
	}
	
	
	@AfterClass()
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}


