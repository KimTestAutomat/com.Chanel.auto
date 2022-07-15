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
	final static String MAKEUP="//span[contains(text(),'Makeup')]";
	final static String LIPSTICK="//a[normalize-space()='Lipstick']";
	final static String ROUGE_ALLURE_PROD="(//span[contains(@role,'presentation')])[6]"; 
	final static String ADD_TO_BAG= "//span[normalize-space()='Add to bag']";
	//final static String QTY= "//span[contains(text(),'QTY 1']";
		final static String QTY= "//span[contains(text(),'QTY 1')]";




	/* FindBy */

	@FindBy(how = How.XPATH, using = SEARCH_BAR)
	public static WebElement search;
	@FindBy(how = How.XPATH, using = SEARCH_INPUT)
	public static WebElement inputText;
	@FindBy(how = How.CSS, using = VIEW_PRODUCTS)
	public static WebElement view;
	@FindBy(how = How.XPATH, using = MAKEUP)
	public static WebElement makeUp;
	@FindBy(how = How.XPATH, using = LIPSTICK)
	public static WebElement lip;
	@FindBy(how = How.XPATH, using = ROUGE_ALLURE_PROD)
	public static WebElement rougeAllure;
	@FindBy(how = How.XPATH, using = ADD_TO_BAG)
	public static WebElement bag;
	@FindBy(how = How.XPATH, using = QTY)
	public static WebElement qte;

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

    
	public void clickOnMakeUp() {

		jsExecutor.executeScript("arguments[0].click();", makeUp);

	}
	public void clickOnLip() {

		jsExecutor.executeScript("arguments[0].click();", lip);

	}
	
	public void scrollToRougeAllure() {
		
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", rougeAllure);


	}
	
	public void clickOnRougeAllure() {
		

		jsExecutor.executeScript("arguments[0].click();", rougeAllure);

	}
	
	
	public void clickOnBag() {
		

		jsExecutor.executeScript("arguments[0].click();", bag);

	}
	
	public String qty(String qteRec) {
	qteRec = qte.getText();
		return qteRec;
		
	}
}
