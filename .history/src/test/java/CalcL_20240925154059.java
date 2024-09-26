
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcL {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2, 3));
    }
}
