package com.Chanel.auto.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	List<WebElement> list;

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
	public void jeVérifieSiLesÉlémentsDeLaListeAffichéeContiennent(String product) throws InterruptedException {

		boolean viewDisplayed = ExerciceOnePageObeject.moreView.isDisplayed();
		while (viewDisplayed)
			try {
				{
					commonUtils.scrollPage(ExerciceOnePageObeject.moreView);
					commonUtils.clickOnElementUsingJs(ExerciceOnePageObeject.moreView);

					Thread.sleep(3000);
				}
			} catch (Exception e) {

				viewDisplayed = false;

			}

		list = ExerciceOnePageObeject.listPrdt;
		System.out.println(" The list contains " + list.size() + " product");
		for (WebElement option : list) {

			Assert.assertTrue(option.getText().contains(product.toLowerCase()));

		}

	}

	@When("Je selectionne le deuxième élément de la liste")
	public String jeSelectionneLeDeuxièmeÉlémentDeLaListe() {

		exerciceOnePageObeject.clickButton(list.get(1));
		try {
		String text = list.get(1).getText();
		System.out.println(text);
		}
		catch(Exception e)
		{System.out.println("exception");}				
		
		return "text";

	}

	@Then("Je vérifie que le nom de produit est le même selectionné")
	public void jeVérifieQueLeNomDeProduitEstLeMêmeSelectionné() {

	}

}
