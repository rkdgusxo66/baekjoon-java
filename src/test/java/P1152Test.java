import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1152Test {
    @Test
    void getWordCount(){
        assertEquals(6, P1152.getWordCount("The Curious Case of Benjamin Button"));
        assertEquals(3, P1152.getWordCount("Mazatneunde Wae Teullyeoyo"));
        assertEquals(2, P1152.getWordCount("Teullinika Teullyeotzi "));
        assertEquals(2, P1152.getWordCount("The The"));
        assertEquals(0, P1152.getWordCount(" "));
        assertEquals(1, P1152.getWordCount(" aa"));
        assertEquals(2, P1152.getWordCount(" aa aa"));
        assertEquals(2, P1152.getWordCount(" aa aa "));
    }

}