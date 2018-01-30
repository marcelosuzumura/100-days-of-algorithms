import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1D1_CodeFights_firstNotRepeatingCharacterTest {

    private R1D1_CodeFights_firstNotRepeatingCharacter solution = new R1D1_CodeFights_firstNotRepeatingCharacter();

    @Test
    public void test1() {
        assertEquals('c', solution.firstNotRepeatingCharacter("abacabad"));
    }

    @Test
    public void test2() {
        assertEquals('_', solution.firstNotRepeatingCharacter("abacabaabacaba"));
    }

    @Test
    public void test3() {
        assertEquals('z', solution.firstNotRepeatingCharacter("z"));
    }

    @Test
    public void test4() {
        assertEquals('c', solution.firstNotRepeatingCharacter("bcb"));
    }

    @Test
    public void test5() {
        assertEquals('_', solution.firstNotRepeatingCharacter("bcccccccb"));
    }

}
