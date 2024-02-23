package parallel;

import org.junit.Assert;

import com.factory.FactoryTest;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class LoginSteps 
{

LoginPage loginpage = new LoginPage(FactoryTest.getDriver());
	
@Given("User is on login page")
public void user_is_on_login_page() 
{
   FactoryTest.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Given("User gets title of the page")
public void user_gets_title_of_the_page() 
{
	String title=loginpage.getLoginPageTitle();
	System.out.println(title);
}

@Then("Forgot password link should be displayed")
public void forgot_password_link_should_be_displayed()
{
   Assert.assertTrue(loginpage.isForgotPasswordLinkDisplayed());
   
}
@When("User enters username as {string} and incorrect Password as {string}")
public void user_enters_username_as_and_incorrect_password_as(String username, String inc_pwd) 
{
   loginpage.enterUsername(username);
   loginpage.enterPassword(inc_pwd);
}

@When("User enters username as {string} and Password as {string}")
public void user_enters_username_as_and_password_as(String username, String password)
{
	loginpage.enterUsername(username);
	loginpage.enterPassword(password);
}

@When("User clicks on login button")
public void user_clicks_on_login_button() 
{
   loginpage.ClickonLoginButton(); 
}

@Then("Incorrect credentials message is displayed")
public void incorrect_credentials_message_is_displayed() 
{
    Assert.assertTrue(loginpage.isIncorrectMessageDisplayed());
}

@Then("User gets the title of the page")
public void user_gets_the_title_of_the_page() 
{
	loginpage.getLoginPageTitle();
}
}
