import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10869Test {
    @Test
    public void add(){
        assertEquals(10, P10869.add(7, 3));
    }

    @Test
    public void sub(){
        assertEquals(4, P10869.sub(7, 3));
    }

    @Test
    public void mult(){
        assertEquals(21, P10869.mult(7, 3));
    }

    @Test
    public void div(){
        assertEquals(2, P10869.div(7, 3));
    }

    @Test
    public void mod(){
        assertEquals(1, P10869.mod(7, 3));
    }
}