/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testIsTriangle() {
        assertTrue(Demo.isTriangle(3, 4, 5));
        assertFalse(Demo.isTriangle(3, 4, 8));
        assertTrue(Demo.isTriangle(5, 12, 13));
        assertFalse(Demo.isTriangle(5, 12, 30));
    }

}