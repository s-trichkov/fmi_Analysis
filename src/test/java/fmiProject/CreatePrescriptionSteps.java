package fmiProject;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenmodels.CreateScreenModel;

public class CreatePrescriptionSteps {
	
	public CreateScreenModel model = new CreateScreenModel();
	
	@Given("^Потребителят се намира на прозореца за създаване на рецепта$")
	public void потребителят_се_намира_на_прозореца_за_създаване_на_рецепта() throws Throwable {
		model.navigateToMe();
	}

	@When("^Потребителят въведе име на лекуващ лекар \"([^\"]*)\"$")
	public void потребителят_въведе_име_на_лекуващ_лекар(String arg1) throws Throwable {
		model.setPhysicianName(arg1);
	}

	@When("^Потребителят въведе име на пациента \"([^\"]*)\"$")
	public void потребителят_въведе_име_на_пациента(String arg1) throws Throwable {
		model.setPatientName(arg1);
	}

	@When("^Потребителят въведе днешна дата \"([^\"]*)\"$")
	public void потребителят_въведе_днешна_дата(String arg1) throws Throwable {
		model.setDate(arg1);
	}

	@When("^Потребителят добавя лекарство \"([^\"]*)\"$")
	public void потребителят_добавя_лекарство(String arg1) throws Throwable {
		model.setMedicines(arg1);
	}

	@When("^Потребителят натиска бутона за създаване на рецепта$")
	public void потребителят_натиска_бутона_за_създаване_на_рецепта() throws Throwable {
		model.clickCreateButton();
	}

	@Then("^Подскача съобщение \"([^\"]*)\"$")
	public void подскача_съобщение(String arg1) throws Throwable {
		final String resultMessage = model.getCreateMessage();
		assertEquals(arg1, resultMessage);
	}



}
