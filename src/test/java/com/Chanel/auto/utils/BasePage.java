package com.Chanel.auto.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

	public static JavascriptExecutor jsExecutor;
	public static Actions actions;


	protected WebDriver driver;
	protected static Logger log = LogManager.getLogger();
	
	public BasePage() {
		this.driver = Setup.driver;
		jsExecutor = (JavascriptExecutor)driver;
		actions = new Actions(driver);


	}
	// Write Text by using JAVA Generic
		public <T> void writeText(T elementAttr, String text) {
			if (elementAttr.getClass().getName().contains("By")) {
				driver.findElement((By) elementAttr).sendKeys(text);
			} else {
				((WebElement) elementAttr).sendKeys(text);
			}
		}
}
