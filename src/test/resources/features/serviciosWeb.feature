# language: es
@ServiciosWEB
@ServicioML
Característica: Prueba de Servicio Web - Mercado Libre
  Obtenemos los distintos departamentos de Mercado Libre.

  @Api
  Escenario: Obtencion de departamentos
    Dado un servicio de MercadoLibre para obtener departamentos
    Cuando el usuario realiza una peticion para obtener departamentos
    Entonces se valida la existencia de un campo 'departments'
      Y se valida la existencia de un campo 'Celulares y Smartphones'
