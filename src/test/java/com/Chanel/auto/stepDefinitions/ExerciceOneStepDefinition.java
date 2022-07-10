package com.Chanel.auto.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Chanel.auto.pageObjects.ExerciceOnePageObeject;
import com.Chanel.auto.utils.Assertions;
import com.Chanel.auto.utils.CommonUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExerciceOneStepDefinition {

	ExerciceOnePageObeject exerciceOnePageObeject;
	Assertions assertions;
	CommonUtils commonUtils;

	public ExerciceOneStepDefinition() {

		this.exerciceOnePageObeject = new ExerciceOnePageObeject();
		this.assertions = new Assertions();
		this.commonUtils = new CommonUtils();
	}

	@Given("Je me connecte sur le site Chanel")
	public void jeMeConnecteSurLeSiteChanel() throws IOException, InterruptedException {
		commonUtils.getUrl("url");
		Thread.sleep(3000);
	}

	@When("Je clique sur la barre de recherche")
	public void jeCliqueSurLaBarreDeRecherche() throws InterruptedException {

		exerciceOnePageObeject.clickOn();
		Thread.sleep(3000);

	}

	@When("Je cherche le mot {string}")
	public void jeChercheLeMot(String string) {
		exerciceOnePageObeject.sumbitToDo(string);

	}

	@Then("Je vérifie si les éléments de la liste affichée contiennent {string}")
	public void jeVérifieSiLesÉlémentsDeLaListeAffichéeContiennent(String string) throws InterruptedException {
		Thread.sleep(3000);
		exerciceOnePageObeject.scrollToView();
		// commonUtils.clickOnElementUsingActions(ExerciceOnePageObeject.view);;
		//commonUtils.clickOnElementUsingActions(By WebElement);
		boolean verificator = ExerciceOnePageObeject.view.isDisplayed();
				while(verificator)
				          {
				        Thread.sleep(4000);
				         try {
				     		exerciceOnePageObeject.scrollToView();

				           Thread.sleep(4000);
				         
				        } catch (Exception e) {
				           verificator = false;
				        } 

				     }

	}

	@When("Je selectionne le deuxième élément de la liste")
	public void jeSelectionneLeDeuxièmeÉlémentDeLaListe() {

	}

	@Then("Je vérifie que le nom de produit est le même selectionné")
	public void jeVérifieQueLeNomDeProduitEstLeMêmeSelectionné() {

	}

}
