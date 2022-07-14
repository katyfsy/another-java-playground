import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzShouldReturnFizzIfDivisibleByThree() {
        //Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Enact
        String expected = "Fizz";
        String actualWithThree = fizzbuzz.foo(3);
        //Assert
        assertEquals(expected, actualWithThree);
        //Teardown
    }
    @Test
    public void fizzBuzzShouldReturnInputAsStringIfNotDivisibleByThreeOrFive() {
        //Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Enact
        String expectedWithSeven = "7";
        String expectedWithEight = "8";
        String actualWithSeven = fizzbuzz.foo(7);
        String actualWithEight = fizzbuzz.foo(8);
        //Assert
        assertEquals(expectedWithSeven, actualWithSeven);
        assertEquals(expectedWithEight, actualWithEight);
        //Teardown
    }
    @Test
    public void fizzBuzzShouldReturnInputAsStringIfDivisibleByFive() {
        //Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Enact
        String expected = "Buzz";
        String actualWithFive = fizzbuzz.foo(5);
        String actualWithTen = fizzbuzz.foo(10);

        //Assert
        assertEquals(expected, actualWithFive);
        assertEquals(expected, actualWithTen);
        //Teardown
    }

    @Test
    public void fizzBuzzShouldReturnInputAsStringIfDivisibleByFiveAndThree() {
        //Setup
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Enact
        String expected = "FizzBuzz";
        String actualWithFifteen = fizzbuzz.foo(15);
        String actualWithThirty = fizzbuzz.foo(30);

        //Assert
        assertEquals(expected, actualWithFifteen);
        assertEquals(expected, actualWithThirty);

        //Teardown
    }

}
