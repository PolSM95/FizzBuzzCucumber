package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
class FizzbuzzCheck{

}
public class StepDefinitions {
    String result;
    String[] arguments;

    @Given("we send no params")
    public void we_send_no_params() {
        result = "";
    }

    @When("we call fizzbuzz app")
    public void we_call_fizzbuzz_app() {
        FizzBuzzApp fizzBuzzApp = new FizzBuzzApp();
        result = fizzBuzzApp.main(arguments);
    }

    @Then("we should see nothing")
    public void we_should_see_nothing() {
        assertEquals("", result);
    }

    @Then("we should see {string}")
    public void we_should_see(String string) {
        assertEquals(string, result);
    }

    @Given("we send {string}")
    public void we_send(String string) {
        arguments = string.split(" ");
    }
}
