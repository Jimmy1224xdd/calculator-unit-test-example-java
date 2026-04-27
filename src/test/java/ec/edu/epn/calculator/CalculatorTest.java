package ec.edu.epn.calculator;


import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertAll;
import junit.framework.Assert;

public class CalculatorTest {
// Instancia de calculator
    private Calculator calculator;
// Instancia para evitar invocar calculator en cada test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    @DisplayName("Test de suma exitosa")
    public void testSum(){
        //arrange + act 
        int resultado = calculator.sum(5,10);

        //assert
        Assertions.assertEquals(15, resultado);
    }

     // test de assetAll para sumar varios casos
    @Test
    @DisplayName("Suma valores en varios casos")
    public void testSumAssertAll() {
        assertAll("Suma valores en varios casos",
            () -> Assertions.assertEquals(3,  calculator.sum(1, 2)),
            () -> Assertions.assertEquals(9,  calculator.sum(4, 5)),
            () -> Assertions.assertEquals(30, calculator.sum(10, 20))
        );
    }


    @Test
    public void testSum2(){
        int resultado = calculator.sum(3,7);
        Assertions.assertEquals(10, resultado);
    }

    @ParameterizedTest
        @DisplayName("Test de suma con multiples datos")
        @org.junit.jupiter.params.provider.CsvSource({
            "1, 2, 3",
            "4, 5, 9",
            "10, 20, 30"
        })
         public void testSumMultipleData(int a, int b, int expected){
         //Arrange + Act
         int resultado = calculator.sum(a,b);
         //Assert
         Assertions.assertEquals(expected, resultado);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, -1, 100})
    public void testSumWithFixedValues(int value){
        //Arrange + Act
        int resultado = calculator.sum(value, 0);
        //Assert
        Assertions.assertTrue(resultado == value);
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
    
     @Test
    public void testMinus(){
        Calculator calculator = new Calculator();
        int result = calculator.minus( 2,1);
        if(result!= 1){
            Assert.fail();
        }
    }
//Intento de calculadora con division por cero
    @Test
    public void testDivideByZeroThrowsException() {
        //Arrage + Act + Assert
    assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    

}
    // @Test
    // public void testSum(){
    //     Calculator calculator = new Calculator();
    //     int result = calculator.sum(5,10);
    //     if(result!= 15){
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

