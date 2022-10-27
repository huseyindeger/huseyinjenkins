package Code.stepsDefinitions;

import Code.Utils.BrowserUtils;
import Code.Utils.ConfigurationsReader;
import Code.Utils.Driver;
import Code.pages.guru99GateWayOrderSuccess;
import Code.pages.guru99GatewayHome;
import Code.pages.guru99GatewayPaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class guru99steps extends BrowserUtils {
    guru99GatewayHome guru99GatewayHome=new guru99GatewayHome();
    guru99GateWayOrderSuccess guru99GateWayOrderSuccess=new guru99GateWayOrderSuccess();
    guru99GatewayPaymentPage guru99GatewayPaymentPage=new guru99GatewayPaymentPage();
    @Given("The user wants to go Payment Gateway Website")
    public void the_user_wants_to_go_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        setWaitTime();

    }
    @When("The user wants to buy a elephant toy")
    public void the_user_wants_to_buy_a_elephant_toy() {
        Driver.getDriver().switchTo().frame("ccpa-consent-notice");
        Driver.getDriver().findElement(By.id("saveAndExit")).click();
        Driver.getDriver().switchTo().parentFrame();
        staticWait(10);
        guru99GatewayHome.getQuantityDropdown("1");
        guru99GatewayHome.getBuyNow();
    }
    @Then("The user wants to provide payment information")
    public void the_user_wants_to_provide_payment_information() {
        guru99GatewayPaymentPage.setCardNumber("1234567891234567");
        guru99GatewayPaymentPage.setMonth("10");
        guru99GatewayPaymentPage.setYear("2024");
        guru99GatewayPaymentPage.setCvvCode("455");
    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        guru99GatewayPaymentPage.setPayButton();

    }
    @Then("The user wants to verify message is successful")
    public void the_user_wants_to_verify_message_is_successful() {
        guru99GateWayOrderSuccess.setVerificationText("Payment successfull!");

    }

    //--------
    @When("The user wants to buy  elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String string) {
        guru99GatewayHome.getQuantityDropdown(string);
        guru99GatewayHome.getBuyNow();

    }
    @Then("The user wants to enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        guru99GatewayPaymentPage.setCardNumber(string);

    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        guru99GatewayPaymentPage.setMonth(string);
    }
    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        guru99GatewayPaymentPage.setYear(string);
    }
    @Then("The user wants to enter CVVCode as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guru99GatewayPaymentPage.setCvvCode(string);
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99GateWayOrderSuccess.setVerificationText(string);
    }
    @Then("The user wants to provite enter payment information as fallowing")
    public void the_user_wants_to_provite_enter_payment_information_as_fallowing(Map<String,String> dataTable) {
        guru99GatewayPaymentPage.setCardNumber(dataTable.get("CardNumber"));
        guru99GatewayPaymentPage.setMonth(dataTable.get("EMonth"));
        guru99GatewayPaymentPage.setYear(dataTable.get("EYear"));
        guru99GatewayPaymentPage.setCvvCode(dataTable.get("CvvCode"));
    }
    @When("The user wants to buy  elephant toy as following quantity")
    public void the_user_wants_to_buy_elephant_toy_as_following_quantity(List<List<String>> dataTable) {
        guru99GatewayHome.getQuantityDropdown(dataTable.get(1).get(0));
        guru99GatewayHome.getBuyNow();

    }
    @Then("The user wants to provite enter payment information as fallowing lists")
    public void the_user_wants_to_provite_enter_payment_information_as_fallowing_lists(List<List<String>> dataTable) {
        guru99GatewayPaymentPage.setCardNumber(dataTable.get(0).get(0));
        guru99GatewayPaymentPage.setMonth(dataTable.get(0).get(1));
        guru99GatewayPaymentPage.setYear(dataTable.get(0).get(2));
        guru99GatewayPaymentPage.setCvvCode(dataTable.get(0).get(3));

    }


}
