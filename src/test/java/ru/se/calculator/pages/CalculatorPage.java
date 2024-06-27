package ru.se.calculator.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import static ru.se.calculator.helper.TestValues.*;

public class CalculatorPage extends BasePage {

    @FindBy(xpath = "//select[@id='selectBuild']")
    private WebElement selectBuild;

    @FindBy(xpath = "//input[@id='number1Field']")
    private WebElement firstNumber;

    @FindBy(xpath = "//input[@id='number2Field']")
    private WebElement secondNumber;

    @FindBy(xpath = "//select[@id='selectOperationDropdown']")
    private WebElement selectOperation;

    @FindBy(xpath = "//input[@id='calculateButton']")
    private WebElement calculateButton;

    @FindBy(xpath = "//input[@id='numberAnswerField']")
    private WebElement answerField;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть страницу калькулятора")
    public void openCalculatorPage() {
        driver.get(BASE_URL);
    }

    @Step("Проскроллить страницу вниз")
    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Step("Выбрать сборку")
    public void selectBuild(String build) {
        Select select = new Select(selectBuild);
        select.selectByVisibleText(build);
    }

    @Step("Ввести первое число")
    public void enterFirstNumber() {
        firstNumber.sendKeys(FIRST_NUMBER);
    }

    @Step("Ввести второе число")
    public void enterSecondNumber() {
        secondNumber.sendKeys(SECOND_NUMBER);
    }

    @Step("Выбрать операцию:")
    public void selectOperation(String operation) {
        Select select = new Select(selectOperation);
        select.selectByVisibleText(operation);
    }

    @Step("Нажать кнопку")
    public void clickCalculate() {
        calculateButton.click();
    }

    @Step("Получить результат")
    public String getAnswer() {
        return answerField.getAttribute("value");
    }
}