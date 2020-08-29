import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10718Test {
    @Test
    public void getAnswerString(){
        String answerString = P10718.getAnswerString();
        assertEquals("강한친구 대한육군", answerString);
    }
}