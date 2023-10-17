import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    Division a = new Division();

    @Test
    public void testintdiv(){
        assertEquals(1.0, a.intdiv(5, 5), 0.01);
    }

    @Test
    public void testdoublediv(){
        assertEquals(5.0, a.doublediv(110, 22), 0.0001);
    }
}
