import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P10814Test {
    Member member1 = Member.of("Junkyu", 21, 1);
    Member member2 = Member.of("Dohyun", 21, 2);
    Member member3 = Member.of("Sunyoung",20, 3);
    @Test
    void sortMemeber(){
        Member input[] = new Member[]{member1, member2, member3};
        Member output[] = new Member[]{member3, member1, member2};
        assertArrayEquals(output, P10814.sortMemeber(input));
    }

    @Test
    void memberCompareToTest(){
        assertTrue(member1.compareTo(member2) < 0);
        assertTrue(member2.compareTo(member3) > 0);
        assertTrue(member1.compareTo(member3) > 0);
    }
}