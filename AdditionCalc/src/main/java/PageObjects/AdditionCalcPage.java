package PageObjects;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Managers.PageObjectManger;
import Utilities.ElementFactory;

public class AdditionCalcPage {

	@FindBy(how = How.XPATH, using = "//div[@class='container']//h1")
	private WebElement title;

	@FindBy(how = How.XPATH, using = "//div[@class='container']//p")
	private WebElement subtitle;

	@FindBy(how = How.XPATH, using = "//img[@src='/img/logo.png']")
	private WebElement logo;

	@FindBy(how = How.XPATH, using = "//label[text()='First Number']")
	private WebElement firstNumberLabel;

	@FindBy(how = How.XPATH, using = "//label[text()='Second Number']")
	private WebElement secondNumberLabel;

	@FindBy(how = How.XPATH, using = "//input[@name='firstNumber']")
	private WebElement firstNumberTextBox;

	@FindBy(how = How.XPATH, using = "//input[@name='secondNumber']")
	private WebElement secondNumberTextBox;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='number' and @name='firstNumber']")
	private WebElement firstNumberPlaceholder;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='number' and @name='secondNumber']")
	private WebElement secondNumberPlaceholder;

	@FindBy(how = How.XPATH, using = "//h3[text()='Results']")
	private WebElement resultsLabel;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//h3[text()='Results']//following::div")
	private WebElement resultsValue;

	WebDriver driver;
	ElementFactory elementFactory;
	PageObjectManger pageObjectManger;

	public AdditionCalcPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageObjectManger = new PageObjectManger(driver);
		elementFactory = pageObjectManger.getElementFactory();
	}

	public void verifyTitle(String expectedTitle) {
		elementFactory.waitUntilVisible(title);
		String actualResult = driver.getTitle();
		assertEquals(actualResult, expectedTitle, "Actual title of the page is not equal to Expected title.");
	}

	public String getAdditionResult(String firstNum, String secondNum) {
		elementFactory.enterTextBox(firstNumberTextBox, firstNum);
		elementFactory.enterTextBox(secondNumberTextBox, secondNum);
		elementFactory.elementClick(submitButton);
		return elementFactory.elementGetText(resultsValue);
	}

	public void verifyAdditionOfTwoValidNumbers(String firstNum, String secondNum) throws InterruptedException {
		double actualResult = Double.parseDouble(getAdditionResult(firstNum, secondNum));
		double expectedResult = addTwoNumbers(firstNum, secondNum);
		System.out.println("actual result::::::::: " + actualResult);
		System.out.println("expected result::::::: " + expectedResult);
		assertEquals(actualResult, expectedResult, "Actual addition value is not equal to Expected value.");
	}

	public void verifyAdditionOfTwoInvalidCharacters(String firstValue, String secondValue)
			throws InterruptedException {
		String actualResult = getAdditionResult(firstValue, secondValue);
		System.out.println("actual result::::::::: " + actualResult);
		assertEquals(actualResult, "NaN", "Actual addition value is not equal to Expected value.");
	}

	public double addTwoNumbers(String firstNum, String secondNum) {
		return Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
	}

	public void verifyLogoDisplayed() {
		assertTrue(logo.isDisplayed(), "Logo is not displayed.");
	}

	public void verifySubtitleDisplayed() {
		assertTrue(subtitle.isDisplayed(), "Subtitle is not displayed.");
	}

	public void verifyLabelsDisplayed() {
		assertTrue(firstNumberLabel.isDisplayed(), "Label for First Number is not displayed.");
		assertTrue(secondNumberLabel.isDisplayed(), "Label for Second Number is not displayed.");
		assertTrue(resultsLabel.isDisplayed(), "Label for Results is not displayed.");
	}

	public void verifyPlaceholdersDisplayed() {
		assertTrue(firstNumberPlaceholder.isDisplayed(), "Placeholder for First Number is not displayed.");
		assertTrue(secondNumberPlaceholder.isDisplayed(), "Placeholder for Second Number is not displayed.");
	}

	public void verifySubmitButtonDisabled() {
		assertTrue(!submitButton.isEnabled(),
				"Submit button is not in the disabled state, but it should be in the disabled state when not entering numbers to add.");
	}

	public void verifyNumbersTextBoxHasValue() {
		assertTrue(!firstNumberTextBox.getText().equals(""),
				"First Number text box should have the entered value, but it is empty.");
		assertTrue(!secondNumberTextBox.getText().equals(""),
				"Second Number text box should have the entered value, but it is empty.");
	}

}
