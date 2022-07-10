package com.Chanel.auto.stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Chanel.auto.pageObjects.ExerciceOnePageObeject;
import com.Chanel.auto.utils.Assertions;
import com.Chanel.auto.utils.BasePage;
import com.Chanel.auto.utils.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExerciceOneStepDefinition extends BasePage {

	ExerciceOnePageObeject exerciceOnePageObeject;
	Assertions assertions;
	CommonUtils commonUtils;

	public ExerciceOneStepDefinition() {

		this.exerciceOnePageObeject = new ExerciceOnePageObeject();
		this.assertions = new Assertions();
		this.commonUtils = new CommonUtils();
	}

	@Given("Je me connecte sur le site Chanel")
	public void jeMeConnecteSurLeSiteChanel() throws IOException {

		commonUtils.getUrl("url");
		System.out.println(driver.getCurrentUrl());

	}

	@When("Je clique sur la barre de recherche")
	public void jeCliqueSurLaBarreDeRecherche() throws InterruptedException {

		commonUtils.clickOnElementUsingJs(ExerciceOnePageObeject.search);
		Thread.sleep(3000);
		System.out.println("ok");

	}

	@When("Je cherche le mot {string}")
	public void jeChercheLeMot(String product) throws InterruptedException {

		exerciceOnePageObeject.searchProduct(product, ExerciceOnePageObeject.input_Search);
		Thread.sleep(3000);

	}

	@Then("Je vérifie si les éléments de la liste affichée contiennent {string}")
	public void jeVérifieSiLesÉlémentsDeLaListeAffichéeContiennent(String string) throws InterruptedException {
	
		
		while (ExerciceOnePageObeject.moreView.isDisplayed())
		{
		commonUtils.scrollPage(ExerciceOnePageObeject.moreView);
		commonUtils.clickOnElementUsingJs(ExerciceOnePageObeject.moreView);
		
		Thread.sleep(3000);
		
        }
		
	}

	@When("Je selectionne le deuxième élément de la liste")
	public void jeSelectionneLeDeuxièmeÉlémentDeLaListe() {

	}

	@Then("Je vérifie que le nom de produit est le même selectionné")
	public void jeVérifieQueLeNomDeProduitEstLeMêmeSelectionné() {

	}

}
