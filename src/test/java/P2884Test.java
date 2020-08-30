import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2884Test {
    @Test
    public void fixAlarm(){
        Alarm fixed = P2884.fixAlarm(new Alarm(10, 10));
        assertEquals(9, fixed.getHour());
        assertEquals(25, fixed.getMinute());

        fixed = P2884.fixAlarm(new Alarm(0, 30));
        assertEquals(23, fixed.getHour());
        assertEquals(45, fixed.getMinute());

        fixed = P2884.fixAlarm(new Alarm(23, 40));
        assertEquals(22, fixed.getHour());
        assertEquals(55, fixed.getMinute());
    }

}