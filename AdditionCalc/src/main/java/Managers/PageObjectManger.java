package Managers;

import org.openqa.selenium.WebDriver;

import PageObjects.AdditionCalcPage;
import Utilities.ElementFactory;

public class PageObjectManger {

	WebDriver driver;
	AdditionCalcPage additionCalcPage;
	ElementFactory elementFactory;

	public PageObjectManger(WebDriver driver) {
		this.driver = driver;
	}

	public AdditionCalcPage getAdditionCalcPage() {
		return (additionCalcPage == null) ? additionCalcPage = new AdditionCalcPage(driver) : additionCalcPage;
	}

	public ElementFactory getElementFactory() {
		return (elementFactory == null) ? elementFactory = new ElementFactory(driver) : elementFactory;
	}

}
