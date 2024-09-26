
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest {

    private Calculator calculator;

    @Test
    public void testAdd() {
        // Calc calc = new Calc();
        assertEquals(5, calculator.add(2, 3));

    }
}
