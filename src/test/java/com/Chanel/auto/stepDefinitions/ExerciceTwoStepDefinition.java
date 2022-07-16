package com.Chanel.auto.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Chanel.auto.pageObjects.ExerciceOnePageObeject;
import com.Chanel.auto.pageObjects.ExerciceTwoPageObject;
import com.Chanel.auto.utils.Assertions;
import com.Chanel.auto.utils.CommonUtils;
import com.Chanel.auto.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExerciceTwoStepDefinition {

	CommonUtils commonUtils;
	ExerciceTwoPageObject exerciceTwoPageObject;
	Assertions assertions;

	public ExerciceTwoStepDefinition() {

		this.commonUtils = new CommonUtils();
		this.exerciceTwoPageObject = new ExerciceTwoPageObject();
		this.assertions = new Assertions();
	}

	@When("J accède à la catégorie Makeup lipStick")
	public void jAccèdeÀLaCatégorieMakeupLipStick() throws InterruptedException {

		try {
			exerciceTwoPageObject.clickMenu(ExerciceTwoPageObject.menu);
			Thread.sleep(3000);
			commonUtils.clickOnElementUsingJs(ExerciceTwoPageObject.lipStick);
		} catch (Exception e) {
			System.out.println("exception");
		}

	}

	@When("Je clique sur le produit ROUGE ALLURE")
	public void jeCliqueSurLeProduitROUGEALLURE() throws InterruptedException {

		commonUtils.scrollPage(ExerciceTwoPageObject.rougeAllure);
		Thread.sleep(3000);
		commonUtils.clickOnElementUsingJs(ExerciceTwoPageObject.rougeAllure);
		Thread.sleep(3000);
	}

	@When("Je l ajoute au panier")
	public void jeLAjouteAuPanier() throws InterruptedException {
		
		Thread.sleep(3000);
		commonUtils.clickOnElementUsingJs(ExerciceTwoPageObject.addBag);
	}

	
	@Then("Je vérifie si {string} dans le panier")
	public void jeVérifieSiDansLePanier(String string) {
	    
		String text = ExerciceTwoPageObject.productBag.getText();
		System.out.println(text);
		
	}

	
	@Then("je vérifie quantité egale à {string}")
	public void jeVérifieQuantitéEgaleÀ(String string) {
	   
	}



	@Then("je vérifie prix égale au prix de produit")
	public void jeVérifiePrixÉgaleAuPrixDeProduit() {

	}

}
