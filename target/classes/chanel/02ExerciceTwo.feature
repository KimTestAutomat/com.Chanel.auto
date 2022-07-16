@achatProduct
Feature: Achat de produit sur le site chanel
    ETQ user je souhaite acheter un produit    
      
  @achatProduct_ok
  
  Scenario:  Acheter de ROUGE ALLURE lipStick le site de Chanel
    Given Je me connecte sur le site Chanel
    When J accède à la catégorie Makeup lipStick
    And Je clique sur le produit ROUGE ALLURE
    And Je l ajoute au panier
    Then Je vérifie si "ROUGE ALLURE" dans le panier
    And je vérifie quantité egale à "QTY 1"
    And je vérifie prix égale au prix de produit
    

 