import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void fourPlusSixEqualsTen(){
        //arrange test
        var calculator = new Calculator();
        //asset
        assertEquals(10, calculator.add(4,6));// give a test to your assumption
    }

    @Test
    void tenMinusFiveEqualsFive(){
        //arrange test
        var calculator = new Calculator();
        //asset
        assertEquals(10, calculator.sub(15,5));
    }
    @Test
    void atimesbEqualsc(){
        //arrange test
        var calculator = new Calculator();
        //asset
        assertEquals(40, calculator.mult(8,5));
    }

}