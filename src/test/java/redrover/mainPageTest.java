package redrover;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class mainPageTest extends BaseTest {

    @Epic("Test epic")
    @Story("Open main page")
    @Link("https://redrover.school")
    @Description("desc example2")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void openRedRoverMainPageP(){
        getDriver().get("https://redrover.school");
        Assert.assertEquals(getDriver().getTitle(), "RedRover | Non-commercial it-school");
        Allure.step("check main page title");
        Allure.description("additional description inside test");

    }

/*  @Story("Open main page")
    @Test
    public void openRedRoverMainPageN(){

        getDriver().get("https://redrover.school");
        Assert.assertEquals(getDriver().getTitle(), "RedRover Non-commercial it-school");

    }*/

    @Epic("Test epic")
    @Story("Open main page")
    @Link("https://redrover.school")
    @Severity(SeverityLevel.MINOR)
    @Description("desc example2")
    @Test
    public void header1Present(){
        getDriver().get("https://redrover.school");
        Allure.step("step header check");
        Allure.description("additional description method");
        Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href = '/#training']")).isEnabled());


    }


}
