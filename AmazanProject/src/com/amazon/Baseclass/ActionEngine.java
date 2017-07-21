package com.amazon.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionEngine extends BaseClass {
	
	@Test
	public void elementClickById(String id) {
		
		WebElement idElement=driver.findElement(By.id(id));
		idElement.click();

	}
	
	@Test
	public void elementClickByXpath(String xpath ,String data) {
		
		WebElement xpathElement=driver.findElement(By.id(xpath));
		xpathElement.click();

	}
	@Test
	public void enterTextById(String id,String data) {
		
		WebElement text=driver.findElement(By.id(id));
		text.clear();
		text.sendKeys(data);

	}
	
	@Test
	public void enterTextByXpath(String xpath,String data) {
		
		WebElement text=driver.findElement(By.id(xpath));
		text.clear();
		text.sendKeys(data);

	}
	
	@Test
	public void enterTextByCss(String css,String data) {
		
		WebElement text=driver.findElement(By.id(css));
		text.clear();
		text.sendKeys(data);

	}
	
	
	
	

}
