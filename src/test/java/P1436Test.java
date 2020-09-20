import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1436Test {
    @Test
    void getNthDoomsdayNumber() {
        assertEquals(666, P1436.getNthDoomsdayNumber(1));
        assertEquals(1666, P1436.getNthDoomsdayNumber(2));
        assertEquals(2666, P1436.getNthDoomsdayNumber(3));
        assertEquals(3666, P1436.getNthDoomsdayNumber(4));
        assertEquals(4666, P1436.getNthDoomsdayNumber(5));
        assertEquals(5666, P1436.getNthDoomsdayNumber(6));
        assertEquals(6660, P1436.getNthDoomsdayNumber(7));
        assertEquals(6661, P1436.getNthDoomsdayNumber(8));
        assertEquals(6662, P1436.getNthDoomsdayNumber(9));
        assertEquals(6663, P1436.getNthDoomsdayNumber(10));
        assertEquals(6664, P1436.getNthDoomsdayNumber(11));
        assertEquals(6665, P1436.getNthDoomsdayNumber(12));
        assertEquals(6666, P1436.getNthDoomsdayNumber(13));
        assertEquals(6667, P1436.getNthDoomsdayNumber(14));
        assertEquals(6668, P1436.getNthDoomsdayNumber(15));
        assertEquals(6669, P1436.getNthDoomsdayNumber(16));
        assertEquals(7666, P1436.getNthDoomsdayNumber(17));
        assertEquals(2666799, P1436.getNthDoomsdayNumber(10000));
    }
}