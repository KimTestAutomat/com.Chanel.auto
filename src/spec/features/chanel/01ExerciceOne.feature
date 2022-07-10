@searchProduct
Feature: Recherche de produit sur le site de Chanel
  ETQ user je souhaite chercher un produit 
  @searchProduct_ok
  Scenario: Recherche de ROUGE ALLURE sur le site de Chanel
    Given Je me connecte sur le site Chanel
    When Je clique sur la barre de recherche
    And Je cherche le mot "ROUGE ALLURE"
	    Then Je vérifie si les éléments de la liste affichée contiennent "ROUGE ALLURE"
    When Je selectionne le deuxième élément de la liste
    Then Je vérifie que le nom de produit est le même selectionné

 