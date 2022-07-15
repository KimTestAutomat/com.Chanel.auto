package com.Chanel.auto.stepDefinitions;

import com.Chanel.auto.pageObjects.ExerciceOnePageObeject;

import io.cucumber.java.en.*;

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
	public void jeCliqueSurADDTOBAG() throws InterruptedException {
		exOnePageObject.clickOnBag();
		Thread.sleep(3000);
	 String rec = (ExerciceOnePageObeject.qte).getText();
	 System.out.println(rec);

	}
	@Then("Je verifie que le produit ROUGE ALLURE est dans le panier")
	public void jeVerifieQueLeProduitROUGEALLUREEstDansLePanier() {
	}
	@Then("Je vérifie que  la quantité={int}")
	public void jeVérifieQueLaQuantité(Integer int1) {
	}
	@Then("Je vérifie que le total panier est égal au prix du produit")
	public void jeVérifieQueLeTotalPanierEstÉgalAuPrixDuProduit() {
	 
	}




}
