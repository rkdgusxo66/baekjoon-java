import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P9498Test {
    @Test
    public void calulateGrade(){
        assertEquals("A", P9498.calculateGrade(100));
        assertEquals("A", P9498.calculateGrade(90));

        assertEquals("B", P9498.calculateGrade(89));
        assertEquals("B", P9498.calculateGrade(80));

        assertEquals("C", P9498.calculateGrade(79));
        assertEquals("C", P9498.calculateGrade(70));

        assertEquals("D", P9498.calculateGrade(69));
        assertEquals("D", P9498.calculateGrade(60));

        assertEquals("F", P9498.calculateGrade(0));
        assertEquals("F", P9498.calculateGrade(59));
    }

}