package com.Chanel.auto.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Chanel.auto.utils.BasePage;

public class ExerciceOnePageObeject extends BasePage {

	public ExerciceOnePageObeject() {

		PageFactory.initElements(driver, this);
	}

	/* Locators */
	final static String SEARCH = "//button[@title='Search']";
	final static String INPUT_SEARCH = "searchInput";
	final static String MORE_VIEW = "//button[@class = 'button is-secondary is-loadmore js-plp-loadmore']";

	/* FindBy */
	@FindBy(how = How.XPATH, using = SEARCH)
	public static WebElement search;
	
	@FindBy(how = How.ID, using = INPUT_SEARCH)
	public static WebElement input_Search;
	
	@FindBy(how = How.XPATH, using = MORE_VIEW)
	public static WebElement moreView;

	/* Methods */
	
	public void searchProduct(String prduct,WebElement element) {
		
		element.sendKeys(prduct);
		element.sendKeys(Keys.ENTER);
		
		}
	
	public void clickButton(WebElement element) {
		
		element.click();
	}
	
}
