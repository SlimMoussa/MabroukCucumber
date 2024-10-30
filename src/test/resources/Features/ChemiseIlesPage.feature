#Author: CSI


Feature: Verification Page Chemise Iles
 


  Scenario: Vérification ajout panier Page Chemise Iles
  
    Given Utilisateur est connécté sur la page produit
    When Utilisateur clique sur le couleur , la taille et ajouter au panier 
    When Utilisateur clique sur Bouton Panier
    Then Vérifier si le produit est dans le panier "CHEMISE ILES"
    

 