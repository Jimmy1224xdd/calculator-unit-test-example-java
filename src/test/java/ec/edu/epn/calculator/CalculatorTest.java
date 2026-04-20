package ec.edu.epn.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
// Instancia de calculator
    private Calculator calculator;
// Instancia para evitar invocar calculator en cada test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // CASO DE DIVISION EXITOSO, TOMANDO EN CUENTA QUE EL DIVISOR ES DISTINTO DE 0
    @Test
    public void testDivide(){
        int resultado = calculator.divide(10,2);
        Assertions.assertEquals(5, resultado);
    }
    // CASO DE TEST CON MULTIPLICACIÓN EXITOSO
    @Test
    public void testMultiply(){
        int resultado = calculator.multiply(4,3);
        Assertions.assertEquals(12,resultado);
    }
//Intento de calculadora con division por cero
    @Test
    public void testDivideByZeroThrowsException() {
    assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    // TEST CON SOLUCUION DEL INGENIERO EN DIVISION
    

}
    // @Test
    // public void testSum(){
    //     Calculator calculator = new Calculator();
    //     int result = calculator.sum(5,10);
    //     if(result!= 15){
    //         Assert.fail();
    //     }
    // }
    // @Test
    // public void testMinus(){
    //     Calculator calculator = new Calculator();
    //     int result = calculator.minus( 2,1);
    //     if(result!= 1){
    //         Assert.fail();
    //     }
    // }
    // // test para fallido
    // @Test
    // public void testDivide(){
    //     Calculator calculator = new Calculator();
    //     int result = calculator.divide( 10,2);
    //     if(result!= 5){
    //         Assert.fail();
    //     }
    // }

