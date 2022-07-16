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
	final static String PRODUCT_BAG ="//body/div[13]/div[1]/div[4]/div[2]/ol[1]/li[1]/article[1]/form[1]/div[1]/div[1]/div[1]/a[1]/span[1]";
	
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
	/* Methods */
	public void clickMenu(WebElement element) {

		element.click();

	}
}
