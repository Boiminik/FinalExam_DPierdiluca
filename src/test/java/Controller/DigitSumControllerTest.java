package Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumControllerTest {

    @Test
    void digitSum() {
        DigitSumController dSCont = new DigitSumController();
        int number = 1234;
        assertEquals(10, dSCont.digitSum(number));
    }
}