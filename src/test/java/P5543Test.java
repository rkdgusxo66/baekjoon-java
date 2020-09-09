import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P5543Test {
    @Test
    public void getMinSetPrice(){
        assertEquals(848, P5543.getMinSetPrice(new int[]{800, 700, 900}, new int[]{198,330}));
        assertEquals(150, P5543.getMinSetPrice(new int[]{1999, 1999, 100}, new int[]{189, 100}));
    }

}