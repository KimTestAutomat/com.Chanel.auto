package com.Chanel.auto.pageObjects;

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
	
	
	/*FindBy*/
//	@FindBy(how = How.XPATH, using = ALEATOIRE_LINK)
//	public static WebElement menuAleatoire;
	@FindBy(how = How.XPATH, using = SEARCH_BAR)
	public static WebElement search;
	
	/*Methods*/
	
	public void clickOn() {
		
		jsExecutor.executeScript("arguments[0].click();", search);

	}
}
