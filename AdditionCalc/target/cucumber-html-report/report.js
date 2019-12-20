$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdditionCalculator.feature");
formatter.feature({
  "line": 1,
  "name": "Propine Addition Calculator",
  "description": "",
  "id": "propine-addition-calculator",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11651600200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on Addition Calculator Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdditionCalcStepDefinition.user_is_already_on_Addition_Calculator_Page()"
});
formatter.result({
  "duration": 1873857900,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "Check submit button",
  "description": "",
  "id": "propine-addition-calculator;check-submit-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "title of the addition calculator page is \"Propine Addition Calculator\"",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "submit button should be in disabled state when not entering numbers to add",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Propine Addition Calculator",
      "offset": 42
    }
  ],
  "location": "AdditionCalcStepDefinition.title_of_the_addition_calculator_page_is(String)"
});
formatter.result({
  "duration": 154181400,
  "status": "passed"
});
formatter.match({
  "location": "AdditionCalcStepDefinition.submit_button_should_be_disabled_when_not_entering_numbers_to_add()"
});
formatter.result({
  "duration": 46270200,
  "error_message": "java.lang.AssertionError: Submit button is not in the disabled state, but it should be in the disabled state when not entering numbers to add. did not expect to find [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat PageObjects.AdditionCalcPage.verifySubmitButtonDisabled(AdditionCalcPage.java:117)\r\n\tat StepDefinitions.AdditionCalcStepDefinition.submit_button_should_be_disabled_when_not_entering_numbers_to_add(AdditionCalcStepDefinition.java:73)\r\n\tat ✽.Then submit button should be in disabled state when not entering numbers to add(AdditionCalculator.feature:60)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 183509700,
  "status": "passed"
});
formatter.before({
  "duration": 9669362000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on Addition Calculator Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdditionCalcStepDefinition.user_is_already_on_Addition_Calculator_Page()"
});
formatter.result({
  "duration": 1495893300,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "Check the first number and second number value",
  "description": "",
  "id": "propine-addition-calculator;check-the-first-number-and-second-number-value",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "title of the addition calculator page is \"Propine Addition Calculator\"",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "user enters valid numbers \"12\" and \"45\" and checks the result successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "first number and second number value should be in the text fields",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Propine Addition Calculator",
      "offset": 42
    }
  ],
  "location": "AdditionCalcStepDefinition.title_of_the_addition_calculator_page_is(String)"
});
formatter.result({
  "duration": 113073800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 27
    },
    {
      "val": "45",
      "offset": 36
    }
  ],
  "location": "AdditionCalcStepDefinition.user_enters_valid_First_number_and_Second_number_and_checks_the_results_successfully(String,String)"
});
formatter.result({
  "duration": 1515694700,
  "status": "passed"
});
formatter.match({
  "location": "AdditionCalcStepDefinition.first_number_and_second_number_value_should_be_in_the_text_fields()"
});
formatter.result({
  "duration": 34373700,
  "error_message": "java.lang.AssertionError: First Number text box should have the entered value, but it is empty. did not expect to find [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat PageObjects.AdditionCalcPage.verifyNumbersTextBoxHasValue(AdditionCalcPage.java:122)\r\n\tat StepDefinitions.AdditionCalcStepDefinition.first_number_and_second_number_value_should_be_in_the_text_fields(AdditionCalcStepDefinition.java:78)\r\n\tat ✽.And first number and second number value should be in the text fields(AdditionCalculator.feature:66)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 150544700,
  "status": "passed"
});
});