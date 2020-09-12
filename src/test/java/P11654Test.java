import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P11654Test {
    @Test
    void getAsciiCode() {
        assertEquals(65, P11654.getAsciiCode('A'));
        assertEquals(67, P11654.getAsciiCode('C'));
        assertEquals(48, P11654.getAsciiCode('0'));
        assertEquals(57, P11654.getAsciiCode('9'));
        assertEquals(97, P11654.getAsciiCode('a'));
        assertEquals(122, P11654.getAsciiCode('z'));
    }
}