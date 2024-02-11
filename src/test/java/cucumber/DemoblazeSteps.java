package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import runner.CucumberDriver;

public class DemoblazeSteps {

    @Given("Unauthorized user is on the main page")
    public void openDemoblazePage() {
        CucumberDriver.getDriver().get("https://www.demoblaze.com/");
    }

    @When("User clicks 'Sign up' button on page header")
    public void clickSignUpButton() {
        CucumberDriver.getDriver().findElement(By.cssSelector("a#signin2")).click();
    }

    @When("User enters username {string} in Sign up popup window")
    public void typeSignInUsername(String username) {
        CucumberDriver.getDriver().findElement(By.cssSelector("input#sign-username")).sendKeys(username);
    }

    @When("User enters password {string} in Sign up popup window")
    public void typeSignInPassword(String password) {
        CucumberDriver.getDriver().findElement(By.cssSelector("input#sign-password")).sendKeys(password);
    }

    @When("User clicks 'Sign up' button in popup window")
    public void clickSubmitSignUpButton() {
        CucumberDriver.getDriver().findElement(By.cssSelector("button[onclick='register()']")).click();
    }

    @Then("Alert window 'Sign up successful.' appears.")
    public void checkAlertSignUpSuccessful() {
        Assert.assertEquals(CucumberDriver.getDriver().switchTo().alert().getText(), "Sign up successful.");
        CucumberDriver.getDriver().switchTo().alert().accept();
    }

    @Then("Alert window 'This user already exist.' appears.")
    public void checkAlertSignUpFailed() {
        Assert.assertEquals(CucumberDriver.getDriver().switchTo().alert().getText(), "This user already exist.");
        CucumberDriver.getDriver().switchTo().alert().accept();
    }

    @Given("User has already registered with credentials {string} and {string} and is on the main page")
    public void registeredUserOnTheMainPage() {
        CucumberDriver.getDriver().get("https://www.demoblaze.com/");
    }

    @When ("User clicks 'Log in' button on page header")
    public void clickLogInButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("a#login2")).click();
    }

    @When ("User enters username {string} in Log in popup window")
    public void typeLogInUsername(String username){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#loginusername")).sendKeys(username);
    }

    @When ("User enters password {string} in Log in popup window")
    public void typeLogInPassword(String password){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#loginpassword")).sendKeys(password);
    }

    @When ("User clicks 'Log in' button in popup window")
    public void clickLogInSubmitButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("button[onclick='logIn()']")).click();
    }

    @Then ("Main page with greeting 'Welcome {string}' opens")
    public void checkLoggedInStatus(String username){
        Assert.assertEquals(CucumberDriver.getDriver().findElement(By.cssSelector("a#nameofuser")).getText(), "Welcome " + username);
    }

    @Then ("Alert window 'User does not exist.' appears.")
    public void checkAbsentUserLoggingStatus(){
        Assert.assertEquals(CucumberDriver.getDriver().switchTo().alert().getText(), "User does not exist.");
        CucumberDriver.getDriver().switchTo().alert().accept();
    }

    @Then ("Alert window 'Wrong password.' appears.")
    public void checkUserLoggingWrongPassword(){
        Assert.assertEquals(CucumberDriver.getDriver().switchTo().alert().getText(), "Wrong password.");
        CucumberDriver.getDriver().switchTo().alert().accept();
    }

    @Given ("Authorized user is on the main page")
    public void authorizedUserIsOnTheMainPage(){
        CucumberDriver.getDriver().get("https://www.demoblaze.com/");
        this.clickLogInButton();
        this.typeLogInUsername("supertester");
        this.typeLogInPassword("12345678");
        this.clickLogInSubmitButton();
    }

    @When ("User clicks on 'HTC One M9' item image on the main page")
    public void clickHtcItem(){
        CucumberDriver.getDriver().findElement(By.cssSelector("a[href='prod.html?idp_=7'].hrefch")).click();
    }

    @When ("User clicks on 'Add to cart' button on product page")
    public void clickProductPageAddToCartButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("a[onclick='addToCart(7)']")).click();
    }

    @Then ("Alert with text 'Product added.' appears")
    public void checkAlertProductAddedPresence(){
        Assert.assertEquals(CucumberDriver.getDriver().switchTo().alert().getText(), "Product added.");
        CucumberDriver.getDriver().switchTo().alert().accept();
    }
    @Given ("Authorized user is on the main page, product added to the cart")
    public void authorizedUserIsOnTheMainPageProductAddedToCart(){
        this.authorizedUserIsOnTheMainPage();
        this.clickHtcItem();
        this.clickProductPageAddToCartButton();
        CucumberDriver.getDriver().switchTo().alert().accept();
    }

    @When ("User clicks on 'Cart' button in the header")
    public void clickHeaderCartButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("a#cartur")).click();
    }

    @When ("User clicks 'Place Order' button on Cart page")
    public void clickCartPagePlaceOrderButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("button[data-target='#orderModal']")).click();
    }

    @When ("User enters name {string} in popup 'Place order'")
    public void typePopupNameInPlaceOrder(String name){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#name")).sendKeys(name);
    }

    @And ("User enters country {string} in popup 'Place order'")
    public void typePopupCountryInPlaceOrder(String country){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#name")).sendKeys(country);
    }

    @And ("User enters city {string} in popup 'Place order'")
    public void typePopupCityInPlaceOrder(String city){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#name")).sendKeys(city);
    }

    @And ("User enters credit card {string} in popup 'Place order'")
    public void typePopupCreditCardInPlaceOrder(String creditCard){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#name")).sendKeys(creditCard);
    }

    @And ("User enters month {string} in popup 'Place order'")
    public void typePopupMonthInPlaceOrder(String month){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#name")).sendKeys(month);
    }

    @And ("User enters year {string} in popup 'Place order'")
    public void typePopupYearInPlaceOrder(String year){
        CucumberDriver.getDriver().findElement(By.cssSelector("input#name")).sendKeys(year);
    }

    @And ("User clicks 'Purchase' button")
    public void clickPopupPurchaseButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("button[onclick='purchaseOrder()']")).click();
    }

    @Then ("Popup with text 'Thank you for your purchase!' appears")
    public void checkPopupThankForPurchasePresence(){
        Assert.assertEquals(CucumberDriver.getDriver().findElement(By.cssSelector("div.sweet-alert h2")).getText(), "Thank you for your purchase!");
    }

    @When ("User clicks 'OK' button")
    public void clickPopupThankForPurchaseOkButton(){
        CucumberDriver.getDriver().findElement(By.cssSelector("button.confirm")).click();
    }

    @Then ("Main page opens")
    public void checkUserIsOnMainPage(){
        Assert.assertEquals(CucumberDriver.getDriver().getCurrentUrl(), "https://www.demoblaze.com/index.html");
    }
}