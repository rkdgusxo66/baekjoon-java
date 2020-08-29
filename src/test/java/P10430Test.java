import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10430Test {
    @Test
    public void func1(){
        assertEquals(1, P10430.func1(5, 8, 4));
    }
    @Test
    public void func2(){
        assertEquals(1, P10430.func2(5, 8, 4));
    }
    @Test
    public void func3(){
        assertEquals(0, P10430.func3(5, 8, 4));
    }
    @Test
    public void func4(){
        assertEquals(0, P10430.func4(5, 8, 4));
    }
}