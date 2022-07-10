package com.Chanel.auto.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Chanel.auto.utils.BasePage;

public class ExerciceOnePageObeject extends BasePage {
	
	public ExerciceOnePageObeject() {
		
		PageFactory.initElements(driver, this);
	}

	/*Locators*/
	//final static String SEARCH_BAR= "//*[contains(text(),'Aléatoire')]";
	final static String SEARCH_BAR = "//button[@title='Search']";
	final static String SEARCH_INPUT = "//input[@id='searchInput']";

	
	
	/*FindBy*/

	@FindBy(how = How.XPATH, using = SEARCH_BAR)
	public static WebElement search;
	@FindBy(how = How.XPATH, using = SEARCH_INPUT)
	public static WebElement inputText;
	
	
	/*Methods*/
	
	public void clickOn() {
		
		jsExecutor.executeScript("arguments[0].click();", search);

	}
	
	public void sumbitToDo(String todo) {

		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);

	}
	
}
