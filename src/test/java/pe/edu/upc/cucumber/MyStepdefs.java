package pe.edu.upc.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    private int balance;
    private int processed;
    private int stock;

    @Given("I have {int} beer cans")
    public void iHaveOpeningBalanceBeerCans(int balance) {
        this.balance = balance;
    }

    @And("I have drunk {int} beer cans")
    public void iHaveDrunkProcessedBeerCans(int processed) {
        this.processed = processed;
        this.stock = this.balance - this.processed;
    }

    @When("I go to my fridge")
    public void iGoToMyFridge() {
    }

    @Then("I should have {int} beer cans")
    public void iShouldHaveInStockBeerCans(int stock) {
        assertEquals(this.stock, stock);
    }
}
