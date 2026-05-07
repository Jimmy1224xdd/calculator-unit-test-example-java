import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.juinit.jupiter.api.DynamicTest;
    
public class CalculatorDynamicTest {

    private Calulator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @TesttFactory
    Stream<DynamicTest> dynamicTestsForSum() {
        int[][] data = new int[][] {
            {1, 2, 3},
            {4, 5, 9},
            {10, 20, 30},
            {0, 0, 0},
            {-1, -2, -3}
        };
        /*//parámetrps → {cuerpo}
        BinaryOperator<Integer> suma = (a, b) -> {
            return a+b;
        };*/
        //Arreglo →Stream Stream de DynamicTest
        return Arrays.stream(data).map((item) -> {
            int a = item[0];
            int b = item[1];
            int expected = item[2];

            return DynamicTest.dynamicTest("Suma de " + a + " y " + b,
            () -> {
                assertEquals(expected, calculator.sum(a, b));
            });
        });
            
    
    }
}