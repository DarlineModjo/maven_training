package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {
    @Test
    public void ANegativeNumberWhenFactThenShouldThrowAnIllegalArgumentException(){
        int aNegativeNumber = -2;
        Sample sample = new Sample();

        Assertions.assertThrows(
            IllegalArgumentException.class,
            () -> sample.fact(aNegativeNumber)
        );
    }

    @Test
    public void APositiveNumberWhenFactThenShouldReturnANumber(){
        int aPositiveNumber = 2;
        Sample sample = new Sample();

        int result = sample.fact(aPositiveNumber);

        int expectedValue = 2;
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void TwoNumbersWhenAddOperationThenShouldReturnTheSumOfTheTwo() {
        int aNumber1 = 4;
        int aNumber2 = 5;
        Sample sample = new Sample();

        int result = sample.op(Sample.Operation.ADD, aNumber1, aNumber2);

        int expectedValue = 9;
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void TwoNumbersWhenMultOperationThenShouldReturnTheProductOfTheTwo() {
        int aNumber1 = 4;
        int aNumber2 = 5;
        Sample sample = new Sample();

        int result = sample.op(Sample.Operation.MULT, aNumber1, aNumber2);

        int expectedValue = 20;
        Assertions.assertEquals(expectedValue, result);
    }
}
