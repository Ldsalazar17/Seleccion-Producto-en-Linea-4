@test
Feature: administrar la cuenta de usuario

  como usuario de la pagina DEMO
  necesito poder administrar mi cuenta


  @seccion1
  Scenario: el usuario deberia ver la informacion de la cuenta
    Given el usuario se encuentre en la pagina principal
    When que el usuario se encuentra logueado
      | usuario       | contrasena |
      | PruebaDaniela | 123Dany    |
    And el usuario hace click en my Account
    Then  deberia poder ver la informacion de la cuenta
      | nombreApellido | pais          | numerotelefono |
      | Prueba Daniela | United States | 3545345      |
