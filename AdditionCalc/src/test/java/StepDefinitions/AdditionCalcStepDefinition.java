package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Managers.PageObjectManger;
import PageObjects.AdditionCalcPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdditionCalcStepDefinition {

	WebDriver driver;
	AdditionCalcPage additionCalcPage;
	PageObjectManger pageObjectManger;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageObjectManger = new PageObjectManger(driver);
		additionCalcPage = pageObjectManger.getAdditionCalcPage();
	}

	@Given("^user is on Addition Calculator Page$")
	public void user_is_already_on_Addition_Calculator_Page() throws Throwable {
		driver.get("https://vast-dawn-73245.herokuapp.com/");
	}

	@When("^title of the addition calculator page is \"(.*?)\"$")
	public void title_of_the_addition_calculator_page_is(String title) throws Throwable {
		additionCalcPage.verifyTitle(title);
	}

	@Then("^user enters valid numbers \"(.*?)\" and \"(.*?)\" and checks the result successfully$")
	public void user_enters_valid_First_number_and_Second_number_and_checks_the_results_successfully(String firstNum,
			String secondNum) throws Throwable {
		additionCalcPage.verifyAdditionOfTwoValidNumbers(firstNum, secondNum);
	}

	@Then("^user enters invalid numbers \"(.*?)\" and \"(.*?)\" and checks the result as NaN$")
	public void user_enters_invalid_First_number_and_Second_number_and_checks_the_results_successfully(String firstNum,
			String secondNum) throws Throwable {
		additionCalcPage.verifyAdditionOfTwoInvalidCharacters(firstNum, secondNum);
	}

	@Then("^logo of the application should be displayed$")
	public void logo_of_the_application_should_be_displayed() throws Throwable {
		additionCalcPage.verifyLogoDisplayed();
	}

	@Then("^subtitle should be displayed$")
	public void subtitle_should_be_displayed() throws Throwable {
		additionCalcPage.verifySubtitleDisplayed();
	}

	@Then("^label for First number, Second number, and Results should be displayed$")
	public void labels_for_First_Number_Second_Number_and_Results_should_be_displayed() throws Throwable {
		additionCalcPage.verifyLabelsDisplayed();
	}

	@Given("^placeholder for First number and Second number should be displayed$")
	public void placeholder_for_First_number_and_Second_number_should_be_displayed() throws Throwable {
		additionCalcPage.verifyPlaceholdersDisplayed();
	}

	@Then("^submit button should be in disabled state when not entering numbers to add$")
	public void submit_button_should_be_disabled_when_not_entering_numbers_to_add() throws Throwable {
		additionCalcPage.verifySubmitButtonDisabled();
	}

	@Then("^first number and second number values should be in the text box$")
	public void first_number_and_second_number_value_should_be_in_the_text_fields() throws Throwable {
		additionCalcPage.verifyNumbersTextBoxHasValue();
	}
	
	@After
	public void after() {
		driver.close();
	}
}
