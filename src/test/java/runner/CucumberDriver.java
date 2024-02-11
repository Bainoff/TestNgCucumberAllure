package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class CucumberDriver {

    private static WebDriver driver;

    @Before
    public  static void before(Scenario scenario){
        getDriver();

    }

    @After
    public static void after(Scenario scenario) {
        /*if(scenario.isFailed()) {
            BaseUtils.captureScreenFile(driver, scenario.getName(), "CucumberTest");
        }*/
//        driver.quit();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

    public static void initializeDriver(){
        driver = BaseUtils.createDriver();
    }



}
