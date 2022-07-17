@achat
Feature: Acheter un produit sur le site de Chanel
  ETQ user je souhaite acheter un produit

  @achat_ok
  Scenario: Achat ROUGE ALLURE sur le site de Chanel
    Given Je me connecte sur le site Chanel
    When Je clique sur Makeup  dans le navbar
    And Je clique sur Lipstick
    And Je clique sur le produit ROUGE ALLURE
    And Je clique sur ADD TO BAG
    Then Je verifie que le produit "ROUGE ALLURE" est dans le panier
    And Je vérifie que la quantité "1"
    And Je vérifie que le total panier est égal au prix du produit
