package steps;
import cucumber.api.java.en.*;
import pages.LoginPage;

public class LoginSteps {

        @Given("^I open login page$")
        public void iOpenLoginURL(){
            LoginPage.openURL();
        }

        @And("^I login with (.*) and (.*)$")
        public void iLoginToDLG(String username, String password){
            LoginPage.loginWithUserAndPassword(username, password);
        }
        @Then("^I verify the successfull message (.*) is displayed")
        public void iVerifyLoginIsSuccessful(String message){
            LoginPage.i_verify_login_successful_message(message);
        }

        @When("^I enter invalid email format (.*)$")
         public void i_enter_invalid_email_format(String message){
            LoginPage.i_enter_invalid_email_format(message);
        }
    @When("^I verify the (.*) is visible")
    public void i_everify_error_message(String errorMessage){
        LoginPage.i_verify_error_message(errorMessage);
    }

}

