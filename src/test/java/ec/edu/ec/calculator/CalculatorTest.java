package ec.edu.ec.calculator;

import org.junit.Test;

import ec.edu.epn.calculator.Calculator;
import junit.framework.Assert;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int result = calculator.sum(4,10);
        if(result!= 15){
            Assert.fail();
        }
    }
}
