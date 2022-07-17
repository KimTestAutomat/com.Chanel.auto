package com.Chanel.auto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Chanel.auto.utils.BasePage;

public class ExerciceTwoPageObject extends BasePage {

	public ExerciceTwoPageObject() {

		PageFactory.initElements(driver, this);
	}

	/* Locators */

	final static String MENU = "makeup";
	final static String LIPSTICK = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/nav[1]/ul[2]/li[3]/div[1]/div[1]/div[2]/div[4]/div[2]/ul[1]/li[1]/a[1]";
	final static String ROUGE_ALLURE ="//a[@href = '/us/makeup/p/160990/rouge-allure-luminous-intense-lip-colour/']";
	final static String ADD_BAG ="pos-cnc-btn";
	final static String PRODUCT_BAG = "//span[@class= 'heading product-details__title ']"; 
	final static String BAG_QUANTITY ="//p[@class = 'cart-product__quantity']";
	final static String PRICE ="//p[@class = 'cart-product__price js-cart-price-item cart-default-sample']";
	final static String TOTAL_BAG = "//p[@class = 'is-bold price-line']";
	final static String ADD_BUTTON = "//span[@class = 'button__wrapper']";
	/* FindBy */
	@FindBy(how = How.ID, using = MENU)
	public static WebElement menu;
	
	@FindBy(how = How.XPATH, using = LIPSTICK)
	public static WebElement lipStick;
	
	@FindBy(how = How.XPATH, using = ROUGE_ALLURE)
	public static WebElement rougeAllure;
	
	@FindBy(how = How.ID, using = ADD_BAG)
	public static WebElement addBag;

	@FindBy(how = How.XPATH, using = PRODUCT_BAG)
	public static WebElement productBag;
	
	@FindBy(how = How.XPATH, using = BAG_QUANTITY)
	public static WebElement bagQuantity;
	
	@FindBy(how = How.XPATH, using = PRICE)
	public static WebElement price;
	
	@FindBy(how = How.XPATH, using = TOTAL_BAG)
	public static WebElement totalBag;
	
	@FindBy(how = How.XPATH, using = ADD_BUTTON)
	public static WebElement addButton;
	
	/* Methods */
	public void clickMenu(WebElement element) {

		element.click();

	}
}
