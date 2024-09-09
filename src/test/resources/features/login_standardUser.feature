# language: es
@Login
@LoginStandardUser
Característica: Login en Swag Labs con un usuario estandar
  Se realiza un inicio de sesión con usuario standard en la página de Swag Labs.

  Escenario: Login con 'STANDARD_USER'
    Dada la pagina de login
    Cuando el usuario 'STANDARD_USER' ingresa sus datos de ingreso
    Entonces el usuario hace click en el boton de login
