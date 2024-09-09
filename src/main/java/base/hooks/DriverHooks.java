package base.hooks;

import base.driver.DriverActions;
import io.cucumber.java.*;

public class DriverHooks {

    @AfterAll
    public static void closeBrowser() {
        // Cerramos el driver luego de haber ejecutado todos los escenarios.
        System.out.println("Cerrando el WebDriver...");
        DriverActions.quitDriver();
    }

}
