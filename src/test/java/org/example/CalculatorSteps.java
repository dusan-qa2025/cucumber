package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalculatorSteps {

    private double prviBroj;
    private double drugiBroj;
    private double rezultat;

    @Given("prvi broj je {int}")
    public void prvi_broj_je(Integer int1) {
        // setuj vrednost za prvi broj
        this.prviBroj = int1;
    }

    @Given("drugi broj je {int}")
    public void drugi_broj_je(Integer int1) {
        // setuj vrednost za drugi broj
        this.drugiBroj = int1;
    }
    @When("saberem brojeve")
    public void saberem_brojeve() {
        // pozovi metod za sabiranje
        Calculator calculator = new Calculator();
        rezultat = calculator.saberi(prviBroj, drugiBroj);

    }
    @Then("rezultat treba da bude {int}")
    public void rezultat_treba_da_bude(Integer int1) {
        // proveri rezultat
        Assert.assertEquals(rezultat, int1, 0);
    }
}
