package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement shadowDomRoot()
	{
		return driver.findElement(By.cssSelector("#usercentrics-root"));
	}
	public WebElement shadowDomElement()
	{
		return driver.findElement(By.cssSelector(".sc-dcJsrY.eIFzaz"));
	}
	
	public WebElement perfum(String criteria)
	{
		return driver.findElement(By.xpath("//div[@class='swiper-wrapper']//a[text()='"+criteria+"']"));
	}
	
	public WebElement icon()
	{
	return driver.findElement(By.xpath("//*[@class='button button__with-icon button__normal swiper-arrow swiper-arrow swiper-button-next swiper-next']//*[@class='PtbKk9ogBoi2GdnLM7lW Q2V8KxgHDakQ2L3catrp']"));
	}
	
	
	public WebElement productartClick()
	{
	return driver.findElement(By.xpath("//div[@data-testid='classificationClassName']"));
	}
	public WebElement productartFilter(String producttype)
	{
	return driver.findElement(By.xpath("//div[@class='facet-option__label']//div[text()='"+producttype+"']"));
	}
	
	
	public WebElement markeClick()
	{
	return driver.findElement(By.xpath("//div[@data-testid='brand']"));
	}
	public WebElement markeFilter(String brand)
	{
	return driver.findElement(By.xpath("//div[@class='facet-option__label']//div[text()='"+brand+"']"));
	}
	
	
	public WebElement forwhomClick()
	{
	return driver.findElement(By.xpath("//div[@data-testid='gender']"));
	}
	public WebElement forwhomFilter(String gender)
	{
	return driver.findElement(By.xpath("//div[text()='"+gender+"']"));
	}
	
	
	public WebElement more()
	{
	return driver.findElement(By.xpath("//*[@class='PtbKk9ogBoi2GdnLM7lW Q2V8KxgHDakQ2L3catrp facet-list__show-more-icon']"));
	}
	
	
	public WebElement giftforClick()
	{
	return driver.findElement(By.xpath("//div[@data-testid='Geschenk für']"));
	}
	public WebElement giftforFilter(String gift)
	{
	return driver.findElement(By.xpath("//div[text()='"+gift+"']"));
	}
	
	public WebElement products()
	{
	return driver.findElement(By.xpath("(//div[@class='ui-grid product-grid-row'])[1]//div[text()='Acqua di Parma']"));
	}
	
	
	
	
	
	
	
	
	

}
