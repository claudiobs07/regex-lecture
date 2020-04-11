package br.com.claudiobs07.regexlecture.match;

import junit.framework.TestCase;
import org.junit.Test;

public class MatcherTest extends TestCase {

    IMatcher matcher = new MatcherGroovy();

    @Test
    public void testMatchLiteral() {
        java.util.regex.Matcher matcher = this.matcher.simple("Are you Ready?", "\\QAre you Ready?\\E");
        assertTrue(matcher.find());
        assertEquals("Are you Ready?", matcher.group());
    }


    @Test
    public void testCaseInsensitive() {
        java.util.regex.Matcher matcher = this.matcher.simple("The Force will be with you", "(?i)the force will be with you");
        assertTrue(matcher.find());
        assertEquals("The Force will be with you", matcher.group());
    }

    @Test
    public void testCharacterClassAny() {
        String regex = "a[ei]ro?foil";
        
        java.util.regex.Matcher matcherOne = matcher.simple("airfoil", regex);
        assertTrue(matcherOne.find());
        assertEquals("airfoil", matcherOne.group());
        
        java.util.regex.Matcher matcherTwo = matcher.simple("aerofoil", regex);
        assertTrue(matcherTwo.find());
        assertEquals("aerofoil", matcherTwo.group());
    }

    @Test
    public void testCharacterClassRange() {
        java.util.regex.Matcher matcher = this.matcher.simple("We are in 2020", "20[0-2][0-9]?");
        assertTrue(matcher.find());
        assertEquals("2020", matcher.group());
        assertFalse(matcher.find());
    }

    @Test
    public void testCharacterClassNegate() {
        java.util.regex.Matcher matcherZero = matcher.simple("", "");
        assertTrue(matcherZero.find());
        assertEquals("", matcherZero.group());
        assertFalse(matcherZero.find());
    }


    @Test
    public void testDigitShorthands() {
        String text = "Tokyo 2020";
        java.util.regex.Matcher matcherDigit = matcher.simple(text, "\\d+");
        assertTrue(matcherDigit.find());
        assertEquals("2020", matcherDigit.group());

        java.util.regex.Matcher matcherNonDigit = matcher.simple(text, "\\D+");
        assertTrue(matcherNonDigit.find());
        assertEquals("Tokyo ", matcherNonDigit.group());
    }

    @Test
    public void testWordShorthands() {
        String text = "The Spider-Man_2";
        java.util.regex.Matcher matcherWord = matcher.simple(text, "\\w+");
        assertTrue(matcherWord.find());
        assertEquals("The", matcherWord.group());
        assertTrue(matcherWord.find());
        assertEquals("Spider", matcherWord.group());
        assertTrue(matcherWord.find());
        assertEquals("Man_2", matcherWord.group());

        java.util.regex.Matcher matcherNonWord = matcher.simple(text, "\\W+");
        assertTrue(matcherNonWord.find());
        assertEquals(" ", matcherNonWord.group());
        assertTrue(matcherNonWord.find());
        assertEquals("-", matcherNonWord.group());
    }

    @Test
    public void testWhitespaceShorthands() {
        String text = "   Wolverine ";
        java.util.regex.Matcher matcherWS = matcher.simple(text, "\\s+");
        assertTrue(matcherWS.find());
        assertEquals("   ", matcherWS.group());
        assertTrue(matcherWS.find());
        assertEquals(" ", matcherWS.group());

        java.util.regex.Matcher matcherNonWS = matcher.simple(text, "\\S+");
        assertTrue(matcherNonWS.find());
        assertEquals("Wolverine", matcherNonWS.group());
    }

    //TODO
    @Test
    public void testUnion() {
        java.util.regex.Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testIntersection() {
        java.util.regex.Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testSubstraction() {
        java.util.regex.Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testSingleLineMode() {
        java.util.regex.Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testArchor() {
        java.util.regex.Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testMultilineMode() {
        java.util.regex.Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

}