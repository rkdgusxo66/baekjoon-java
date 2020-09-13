import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2292Test {
    @Test
    void countRooms(){
        assertEquals(3, P2292.countRooms(13));
        assertEquals(1, P2292.countRooms(1));
        assertEquals(2, P2292.countRooms(2));
        assertEquals(2, P2292.countRooms(7));
        assertEquals(3, P2292.countRooms(19));
    }

}