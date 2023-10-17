import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddtionTest {
    Addtion a = new Addtion();

    @Test
    public void testintadd(){
        assertEquals(8, a.intadd(1, 7));
        assertEquals(10, a.intadd(5, 5));
    }

    @Test
    public void testfloatadd(){
        assertEquals(1.1, a.doubleadd(1, 0.1));
        assertEquals(1.5, a.doubleadd(0.2, 1.3));

    }
}
