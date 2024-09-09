package base.hooks;

import base.driver.DriverActions;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DriverHooks {


    @AfterAll
    public static void closeBrowser() {
        // Cerramos el driver luego de haber ejecutado todos los escenarios.
        System.out.println("Cerrando el driver...");
        DriverActions.quitDriver();
    }

}
