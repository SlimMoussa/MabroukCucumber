#Author: CSI


Feature: Verification Menu HomePageXiaomi
  

  
  Scenario: Accéder à Chemises & Blouses via le menu
  
    Given Utilisateur  sur la Page dacceuil
    When je survole le MenuHaut "Femme" et Cliquer Sur "Chemises & Blouses" 
    Then La page est affiché "Chemises & Blouses" 
