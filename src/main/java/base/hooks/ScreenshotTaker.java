package base.hooks;

import base.SeleniumActions;
import base.driver.DriverActions;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotTaker {

    @AfterStep
    public static void take(Scenario scenario) throws IOException {
        WebDriver driver = DriverActions.getDriver();

        if (scenario.isFailed()) {
            // Capturo la pantalla como byte array para posteriormente adjuntarla en el reporte html de cucumber..
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            File destiny = new File("target" + File.separator + "screenshots");
            if (!destiny.exists()) {
                destiny.mkdir();  // Creo el directorio si no existe
            }
            File screenshotFile = new File(destiny.toString() + File.separator + scenario.getName() + ".png");
            FileUtils.writeByteArrayToFile(screenshotFile, screenshot);

            // Adjunto la captura de pantalla al reporte de Cucumber
            scenario.attach(screenshot, "image/png", "Screenshot");
        }
    }

}
