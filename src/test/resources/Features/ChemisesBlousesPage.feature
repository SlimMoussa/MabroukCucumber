#Author: CSI


Feature: Page Chemises & Blouses
 

 
  Scenario: Vérification Menu Chemises & Blouses 
  
    Given Utilisateur est connécté sur la page maison connectée
    When  Utilisateur clique sur le produit "CHEMISE ILES"
    Then Redirection vers la page du produit "CHEMISE ILES"
   

 
