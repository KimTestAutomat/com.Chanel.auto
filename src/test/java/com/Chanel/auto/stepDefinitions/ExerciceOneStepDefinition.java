package com.Chanel.auto.stepDefinitions;

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
		this.commonUtils =new CommonUtils();
	}
		

	@Given("Je me connecte sur le site Chanel")
	public void jeMeConnecteSurLeSiteChanel() {
	   
	}
	@When("Je clique sur la barre de recherche")
	public void jeCliqueSurLaBarreDeRecherche() {
	   
	}
	@When("Je cherche le mot {string}")
	public void jeChercheLeMot(String string) {
	
	}
	@Then("Je vérifie si les éléments de la liste affichée contiennent {string}")
	public void jeVérifieSiLesÉlémentsDeLaListeAffichéeContiennent(String string) {
	  
	}
	@When("Je selectionne le deuxième élément de la liste")
	public void jeSelectionneLeDeuxièmeÉlémentDeLaListe() {
	 
	}
	@Then("Je vérifie que le nom de produit est le même selectionné")
	public void jeVérifieQueLeNomDeProduitEstLeMêmeSelectionné() {
	   
	}



}
