//import org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFact() {
        assertEquals(1, Factorial.fact(1));
        assertEquals(2, Factorial.fact(2));
        assertEquals(6, Factorial.fact(3));
        assertEquals(3628800, Factorial.fact(10));
        assertEquals(2432902008176640000L, Factorial.fact(20));
    }

    @Test
    public void testadd(){
        assertEquals(5, Factorial.add(1, 4));
        assertEquals(18, Factorial.add(8, 10));
    }
}