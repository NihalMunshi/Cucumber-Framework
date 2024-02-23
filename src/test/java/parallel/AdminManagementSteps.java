package parallel;

import com.factory.FactoryTest;
import com.pages.AdminManagementPage;
import com.pages.LoginPage;
import com.utilities.DataGenerator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminManagementSteps 
{
	DataGenerator data =new DataGenerator();
	AdminManagementPage admin =new AdminManagementPage(FactoryTest.getDriver());
	
	
	@Given("Admin user navigates to create user page")
	public void admin_user_navigates_to_create_user_page() 
	{
	   admin.ClickOnAdminTab();
	   admin.ClickOnUserManagement();
	   admin.ClickOnUser();
	   admin.ClickOnAddButton();
	}

	@When("User selects user role")
	public void user_selects_user_role() 
	{
	    admin.selectUserType();
	}

	@When("User selects status as {string}")
	public void user_selects_status_as(String status) 
	{
	    admin.UserStatus(status);
	}

	@Then("User enters {string}")
	public void user_enters(String string) 
	{
		String Name=data.getFirstname();
	    admin.EnterName(Name);
	}

	@Then("User enters username as {string}")
	public void user_enters_username_as(String username) 
	{
		String Name=data.getUsername();
		admin.EnterUsername(Name);
	   
	}

	@Then("User enters {string} and confirm {string}")
	public void user_enters_password_and_confirm_passowrd() 
	{
		String password=data.getPassword();
	    admin.EnterPassword(password);
	    admin.ConfirmPassword(password);
	}

}
