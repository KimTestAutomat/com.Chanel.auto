package com.Chanel.auto.pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Chanel.auto.utils.BasePage;
import com.Chanel.auto.utils.CommonUtils;

public class ExerciceOnePageObeject extends BasePage {

	CommonUtils commonUtils;

	public ExerciceOnePageObeject() {

		PageFactory.initElements(driver, this);
	}

	/* Locators */
	final static String SEARCH = "//button[@title='Search']";
	final static String INPUT_SEARCH = "searchInput";
	final static String MORE_VIEW = "//button[@class = 'button is-secondary is-loadmore js-plp-loadmore']";
	public final static String LIST_PRODUCT = "product-list-inline";
	public final static String PRODUCT = "//span[@class='heading product-details__title ']";

	/* FindBy */
	@FindBy(how = How.XPATH, using = SEARCH)
	public static WebElement search;

	@FindBy(how = How.ID, using = INPUT_SEARCH)
	public static WebElement input_Search;

	@FindBy(how = How.XPATH, using = PRODUCT)
	public static WebElement product;

	@FindBys({ @FindBy(className = "product-list-inline") })
	public static List<WebElement> listPrdt;
	
	@FindBy(how = How.XPATH, using = MORE_VIEW)
	public static WebElement moreView;


	/* Methods */

	public void searchProduct(String prduct, WebElement element) {

		element.sendKeys(prduct);
		element.sendKeys(Keys.ENTER);

	}

	public void clickButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
		}
	}
}
