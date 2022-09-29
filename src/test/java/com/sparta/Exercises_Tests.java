package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {

    @Test
    @DisplayName(("Given two equal integers returns false, otherwise checks if division remainder is 0 and returns true if yes"))
    public void checkIfIntegersAreEqual_ifYes_ReturnFalse_IfNo_checkIfIntegersDivisionIsZero_ifYes_then_True(){
        Assertions.assertFalse(Exercises.myMethod(4,4));
    }

    @Test
    @DisplayName(("Given two equal integers returns false, otherwise checks if division remainder is 0 and returns true if yes"))
    public void checkIfIntegersAreEqual_ifNo_ReturnTrue_checkIfIntegersDivisionIsZero_ifYes_then_True() {
        Assertions.assertTrue(Exercises.myMethod(8, 4));
    }

    @ParameterizedTest
    @DisplayName(("Given two equal integers returns false, otherwise checks if division rekmainder is 0 and returns true if yes"))
    @CsvSource({"20,10", "40,4"})
    public void checkIf(int num1, int num2) {
        boolean expectedBoolean = true;
        var expectedMessage = Exercises.myMethod(num1, num2);
        Assertions.assertTrue(expectedBoolean, String.valueOf(expectedMessage));
    }

    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125) );
    }
    // write unit test(s) for myMethod here
   @ParameterizedTest
    @ValueSource(ints = {-2, 0, 2, 348})
    @DisplayName("Given an even number, evenOdd returns true")
    public void givenAnEvenNumber_EvenOdd_ReturnsTrue(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(ints = {-3, -1, 1, 347})
    @DisplayName("Given an odd number, evenOdd returns false")
    public void givenAnOddNumber_EvenOdd_ReturnsFalse(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertFalse(result);
    }


}
