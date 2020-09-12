import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2941Test {
    @Test
    void getCroaticWordCount(){
        assertEquals(6, P2941.getCroaticWordCount("ljes=njak"));
        assertEquals(3, P2941.getCroaticWordCount("ddz=z="));
        assertEquals(2, P2941.getCroaticWordCount("c=c="));
    }
}