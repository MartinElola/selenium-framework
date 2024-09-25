#### El presente proyecto es un framework de Selenium realizado en Java 11 que utiliza TestNG como herramienta de ejecución. Además, cuenta también con un pequeño framework hecho en RestAssured que nos permite realizar peticiones básicas. Esta configurado con Maven a fin de poder gestionar bien las dependencias y ejecutar las pruebas de manera eficiente.

## Preparación del entorno:
1.  **Java JDK 11**: se debe instalar la versión 11 del JDK.
2.  **Maven**: se debe contar con Maven instalado y correctamente seteado en las variables de entorno.
3.  Antes de ejecutar las pruebas podremos elegir el navegador modificando el archivo que se encuentra en **environment\driver.properties**

## Instrucciones para la ejecución de pruebas: 
Desde una consola de comandos a elección ejecutar en la ruta principal del proyecto:

1. ```mvn clean test -DskipTests=true```, a fin de instalar todas las dependencias necesarias del proyecto.
2. ```mvn test -DCUCUMBER_FILTER_TAGS=@FeatureAEjecutar```, a fin de ejecutar una feature a elección. 

**Tener en cuenta que contamos con tres features de cucumber para ejecutar con los siguientes tags:**
  - **@AgregadoProductos** <--- Prueba WEB correspondiente al caso de prueba número 5 de la documentación de 'Agregado de productos al carrito'. La misma falla a drede.
  - **@LoginStandardUser** <--- Prueba WEB correspondiente al caso de prueba número 1 de la documentación de 'Inicio de sesión'. La misma deberá correr de forma correcta.
  - **@ServicioML**        <--- Prueba API, correspondiente al punto 5 del challenge.

## Reportería
**Los reportes serán generados automáticamente luego de una ejecución en la carpeta de target, en la raíz del proyecto. Allí encontraremos nuestro reporte cucumber-reports.html con capturas adjuntas en caso de falla.
Adicionalmente contamos con el directorio target\screenshots donde se guardaran las capturas también en caso de falla, por si queremos verlas por separado.**



