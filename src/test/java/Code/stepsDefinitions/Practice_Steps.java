package Code.stepsDefinitions;

import Code.Utils.BrowserUtils;
import Code.Utils.ConfigurationsReader;
import Code.Utils.Driver;
import Code.pages.Practice_PAGES;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

public class Practice_Steps extends BrowserUtils {
    Practice_PAGES practice_pages=new Practice_PAGES();
    private static final org.apache.log4j.Logger logger = Logger.getLogger(Practice_Steps.class);

    @Given("The user wants to go ORANGEHTM")
    public void the_user_wants_to_go_orangehtm() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));

    }
    @When("The user wants to enter user and password")
    public void the_user_wants_to_enter_user_and_password() {
        practice_pages.setUsername(ConfigurationsReader.getProperties("OrangeHRMUsername"));
        logger.info("username provided successfully");
        practice_pages.setPassword(ConfigurationsReader.getProperties("OrangeHRMPassword"));
        logger.info("password provided successfully");
        practice_pages.setLoginButton();
        logger.info("Login Button clicked successfully");

    }
    @Then("The user wants to click on PIM Modulee")
    public void the_user_wants_to_click_on_pim_modulee() {
        practice_pages.setPIMModule();
        logger.info("PIM Module provided successfully");

    }
    @Then("The user wants to click Add Employee Header")
    public void the_user_wants_to_click_add_employee_header() {
       practice_pages.setAddEmployee();
        logger.info("Add Employee Header provided successfully");
    }
    @Then("The user wants to add employee's  name and surname as following")
    public void the_user_wants_to_add_employee_s_name_and_surname_as_following(Map<String,String> dataTable) {
        practice_pages.setFirstName(dataTable.get("Name"));
        logger.info("employee's name provided successfully");
        practice_pages.setLastName(dataTable.get("Surname"));
        logger.info("employee's last name provided successfully");
    }
    @Then("The user wants to click on Save button")
    public void the_user_wants_to_click_on_save_button() {
        practice_pages.setSaveButton();
        logger.info("Save Button clicked successfully");

    }
    @Then("The user wants to add employee's  name and surname as following by list")
    public void the_user_wants_to_add_employee_s_name_and_surname_as_following_by_list(List<List<String>> dataTable) {
      practice_pages.setFirstName(dataTable.get(1).get(0));
      logger.info("Employee's first name provided successfully");
      practice_pages.setLastName(dataTable.get(1).get(1));
      logger.info("Employee's last name provided successfully");

    }
    @Then("The user wants to add employee's  name and surname as following by {string} {string}")
    public void the_user_wants_to_add_employee_s_name_and_surname_as_following_by(String firstname1, String surname) {
        practice_pages.setFirstName(firstname1);
        logger.info("employee's name provided successfully");
        practice_pages.setLastName(surname);
        logger.info("employee's last name provided successfully");

    }

}
