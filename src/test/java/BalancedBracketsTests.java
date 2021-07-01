import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTests {

    @Test
    public void starterTest() {
        assertEquals(10, 10, .001);
    }
// test []
    @Test
    public void testBasicBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
// test  ][
    @Test
    public void testBackwardsBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void testBracketWithString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void testBrokenStringWithBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void testBracketsBeforeString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void testNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testOneBracketBeginning(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void testOneBracketEnd(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void testOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testTwoBracketsClosedWrongWithString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void testOneBracketsClosedWrong(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
// test [[]]
// test [[].
// test []]
// * These strings have balanced brackets:
//     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//     *
//     * While these do not:
//     *   "[LaunchCode", "Launch]Code[", "[", "]["
}
