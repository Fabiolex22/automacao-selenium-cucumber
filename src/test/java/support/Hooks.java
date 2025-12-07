package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverFactory.getDriver();
        System.out.println("Iniciando driver...");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            System.out.println("Fechando driver...");
            driver.quit();
            DriverFactory.killDriver();
        }
    }
}
