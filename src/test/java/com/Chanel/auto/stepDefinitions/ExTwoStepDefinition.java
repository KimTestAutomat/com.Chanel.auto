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
	public void jeCliqueSurADDTOBAG()  {
		exOnePageObject.clickOnBag();
	
	}
//	@Then("Je verifie que le produit ROUGE ALLURE est dans le panier")
//	public void jeVerifieQueLeProduitROUGEALLUREEstDansLePanier() {
//		 String rec = (ExerciceOnePageObeject.qte).getText();
//		 System.out.println(rec);
//			String[] qtList = rec.split("");
//			System.out.println("la valeur est :  "+qtList[4]);
//		Assert.assertEquals(1, qtList[4]);
//	}
//	@Then("Je vérifie que  la quantité={int}")
//	public void jeVérifieQueLaQuantité(Integer int1) throws InterruptedException {
//		Thread.sleep(5000);
//
//		 String rec = (ExerciceOnePageObeject.qte).getText();
//		 System.out.println(rec);
//			String[] qtList = rec.split("");
//			System.out.println("la valeur est :  "+qtList[4]);
//	
//		
//        try{
//            int number = Integer.parseInt(qtList[4]);
//            System.out.println(number);
//        	//Assert.assertEquals(1, qtList[4]);
//        	Assert.assertEquals(qtList[4],1);
//        }
//        catch (NumberFormatException ex){
//            ex.printStackTrace();
//        }
//        
//	}
	 

	@Then("Je vérifie que la quantité {string}")
	public void jeVérifieQueLaQuantité(String qte)throws InterruptedException {
	
			Thread.sleep(5000);
	
			 String rec = (ExerciceOnePageObeject.qte).getText();
			 System.out.println(rec);
				String[] qtList = rec.split("");
				System.out.println("la valeur est :  "+qtList[4]);
				//	Assert.assertEquals(qtList[4],1);
				Assert.assertEquals(qte, qtList[4]);
	        	//Assert.assertTrue(qtList[4]);
	        
	}



	@Then("Je vérifie que le total panier est égal au prix du produit")
	public void jeVérifieQueLeTotalPanierEstÉgalAuPrixDuProduit() {
	 
	}




}
