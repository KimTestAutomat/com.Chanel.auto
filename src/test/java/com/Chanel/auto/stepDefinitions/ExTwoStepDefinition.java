package com.Chanel.auto.stepDefinitions;

import com.Chanel.auto.pageObjects.ExerciceOnePageObeject;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ExTwoStepDefinition {
	ExerciceOnePageObeject exOnePageObject;

	public ExTwoStepDefinition() {
		this.exOnePageObject = new ExerciceOnePageObeject();
	}

	@When("Je clique sur Makeup  dans le navbar")
	public void jeCliqueSurMakeupDansLeNavbar() {
		exOnePageObject.clickOnMakeUp();

	}

	@When("Je clique sur Lipstick")
	public void jeCliqueSurLipstick() {
		exOnePageObject.clickOnLip();
	}

	@When("Je clique sur le produit ROUGE ALLURE")
	public void jeCliqueSurLeProduitROUGEALLURE() throws InterruptedException {
		Thread.sleep(3000);
		exOnePageObject.scrollToRougeAllure();
		exOnePageObject.clickOnRougeAllure();

	}

	@When("Je clique sur ADD TO BAG")
	public void jeCliqueSurADDTOBAG() {
		exOnePageObject.clickOnBag();

	}

	@Then("Je verifie que le produit {string} est dans le panier")
	public void jeVerifieQueLeProduitEstDansLePanier(String rg) throws InterruptedException {
		Thread.sleep(7000);
		String obj = (ExerciceOnePageObeject.red).getText().toUpperCase();
		//.toLowerCase())
		System.out.println("OBJET ROUGE ALLURE :  " + obj);

		System.out.println("ROUGE ALLURE :  " + rg);
		Assert.assertEquals(rg, obj);

	}

	@Then("Je vérifie que la quantité {string}")
	public void jeVérifieQueLaQuantité(String qty) throws InterruptedException {

		Thread.sleep(5000);

		String rec = (ExerciceOnePageObeject.qte).getText();
		System.out.println(rec);
		String[] qtList = rec.split("");
		System.out.println("la valeur est :  " + qtList[4]);

		Assert.assertEquals(qty, qtList[4]);

	}

	@Then("Je vérifie que le total panier est égal au prix du produit")
	public void jeVérifieQueLeTotalPanierEstÉgalAuPrixDuProduit() {
//		String rec = (ExerciceOnePageObeject.qte).getText();
//		System.out.println(rec);
//		String[] qtList = rec.split("");
//		System.out.println("la valeur est :  " + qtList[4]);
//
//		Assert.assertEquals(qty, qtList[4]);
		
		String price = (ExerciceOnePageObeject.prix).getText();
		String total = (ExerciceOnePageObeject.total).getText();

		System.out.println("le prix est :  " + price);
		System.out.println("le total est :  " + total);

		Assert.assertEquals(price,total);



	}

}
