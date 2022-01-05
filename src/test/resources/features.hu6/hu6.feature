@test
Feature: administrar la cuenta de usuario

  como usuario de la pagina DEMO
  necesito poder administrar mi cuenta


  @seccion1
  Scenario: el usuario deberia ver la informacion de la cuenta
    Given que el usuario se encuentra logueado
      | usuario       | contrasena |
      | PruebaDaniela | 123Dany    |
    When el usuario hace click es my Account
    Then  deberia poder ver la informacion de la cuenta
      | nombreApellido | pais          | numerotelefono |
      | Prueba Daniela | United States | 3545345      |

    @seccion2
  Scenario: el usuario deberia ver la informacion del detalle del envio
    Given que el usuario se encuentra logueado
      | usuario       | contrasena |
      | PruebaDaniela | 123Dany    |
    When el usuario hace click en my Account
    Then  deberia poder ver la informacion del detalle del envio
      | nombreApellido | pais          | numerotelefono |
      | Prueba Daniela | United States | 3545345      |

      @seccion3

      Scenario: el usuario deberia poder editar y hacer cambios como su contraseña
        Given que el usuario se encuentra logueado
          | usuario       | contrasena |
          | PruebaDaniela | 123Dany    |
        When el usuario hace click en my Account

        Then  deberia poder editar la informacion
        And deberia poder ver un boton de editar la informacion
