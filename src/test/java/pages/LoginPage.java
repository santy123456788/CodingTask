package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import steps.Hooks;

public class LoginPage {
    private static String userField = "input[name='loginUsername']";
    private static String passwordField="input[name='loginPassword']";
    private static String loginButton="button[type='submit']";
    private static String loginSuccess="div.logged-in__success";
    private static String loginError="div.form-field__error";

    public static void openURL(){
        Hooks.getDriver().get(BasePage.URL);
    }

    public static void loginWithUserAndPassword(String username, String password){
        Hooks.getDriver().findElement(By.cssSelector(userField)).sendKeys(username);
        Hooks.getDriver().findElement(By.cssSelector(passwordField)).sendKeys(password);
        Hooks.getDriver().findElement(By.cssSelector(loginButton)).click();
    }

    public static void i_verify_login_successful_message(String message) {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(message,Hooks.getDriver().findElement(By.cssSelector(loginSuccess)).getText());
    }

    public static void i_enter_invalid_email_format(String username){
        Hooks.getDriver().findElement(By.cssSelector(userField)).sendKeys(username);
    }

    public static void i_verify_error_message(String errorMessage){
        Assert.assertEquals(errorMessage,Hooks.getDriver().findElement(By.cssSelector(loginError)).getText());
    }

}
