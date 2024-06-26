package ru.se.calculator.test;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.se.calculator.pages.CalculatorPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorPageTest extends BaseTest {

    private static CalculatorPage calculatorPage;

    @BeforeEach
    void setup() {
        calculatorPage = new CalculatorPage(driver);
    }

    @Test
    @DisplayName("Вычитание")
    @Description("Проверка операции на вычитание")
    void testSubtraction() {
        calculatorPage.openCalculatorPage();
        calculatorPage.scrollToBottom();
        calculatorPage.selectBuild("Prototype");
        calculatorPage.enterFirstNumber();
        calculatorPage.enterSecondNumber();
        calculatorPage.selectOperation("Subtract");
        calculatorPage.clickCalculate();
        String answer = calculatorPage.getAnswer();
        assertEquals("-1", answer);
    }
}