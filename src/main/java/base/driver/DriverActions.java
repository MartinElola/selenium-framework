package base.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverActions {

    private static WebDriver driver;
    private static Properties props = new Properties();


    public DriverActions() {
        driver = getDriver();
    }

    private static void ConfigProperties() {
        // Cargo el archivo de properties de esta manera para arrojar una excepción si no se puede cargar
        try {
            FileInputStream fis = new FileInputStream("environment/driver.properties");
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo cargar el archivo driver.properties");
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            ConfigProperties();
            String browser = props.getProperty("DRIVER_BROWSER");
            switch (browser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
