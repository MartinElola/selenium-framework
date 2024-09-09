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
        if(scenario.isFailed()) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            saveScreenshotPNG(driver);
            File destiny = new File("target" + File.separator + "screenshots");
            if (! destiny.exists()) {
                destiny.mkdir();
            }
            FileUtils.copyFile(file, new File(destiny.toString() + File.separator + scenario.getId() + ".png"));
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private static File saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    }

}
