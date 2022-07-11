package com.Chanel.auto.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Chanel.auto.utils.BasePage;
import com.Chanel.auto.utils.CommonUtils;

public class ExerciceOnePageObeject extends BasePage {

	
	CommonUtils commonUtilsObject;
	public ExerciceOnePageObeject() {

		PageFactory.initElements(driver, this);
		this.commonUtilsObject = new CommonUtils();
	}

	/* Locators */
	final static String SEARCH_BAR = "//button[@title='Search']";
	final static String SEARCH_INPUT = "//input[@id='searchInput']";
	final static String VIEW_PRODUCTS = "button[role='button'] span[class='button__wrapper'] span";
	final static String ROUGE_ALLURE= "//*[contains(text(),'ROUGE ALLURE')]";


	/* FindBy */

	@FindBy(how = How.XPATH, using = SEARCH_BAR)
	public static WebElement search;
	@FindBy(how = How.XPATH, using = SEARCH_INPUT)
	public static WebElement inputText;
	@FindBy(how = How.CSS, using = VIEW_PRODUCTS)
	public static WebElement view;

	/* Methods */

	public void clickOn() {

		jsExecutor.executeScript("arguments[0].click();", search);

	}

	public void sumbitToDo(String todo) {

		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);

	}

	public void scrollToView() {
		
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", view);
		view.click();
		//actions.moveToElement(view).perform();

	}
    public List<WebElement> findElements(By ROUGE_ALLURE)
    {
        try
        {
            return driver.findElements(ROUGE_ALLURE);
        }
        catch (NoSuchElementException e)
        {
            log.error(this.getClass().getName(), "findElements", "element not found" + ROUGE_ALLURE);
            throw new NoSuchElementException(e.getMessage());
        }
    }

	
}
