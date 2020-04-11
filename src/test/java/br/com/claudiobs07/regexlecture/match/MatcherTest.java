package br.com.claudiobs07.regexlecture.match;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.regex.Matcher;

public class MatcherTest extends TestCase {

    IMatcher matcher = new MatcherGroovy();

    @Test
    public void testMatchLiteral() {
        Matcher matcher = this.matcher.simple("Are you Ready?", "\\QAre you Ready?\\E");
        assertTrue(matcher.find());
        assertEquals("Are you Ready?", matcher.group());
    }


    @Test
    public void testCaseInsensitive() {
        Matcher matcher = this.matcher.simple("The Force will be with you", "(?i)the force will be with you");
        assertTrue(matcher.find());
        assertEquals("The Force will be with you", matcher.group());
    }

    @Test
    public void testCharacterClassAny() {
        String regex = "a[ei]ro?foil";
        
        Matcher matcherOne = this.matcher.simple("airfoil", regex);
        assertTrue(matcherOne.find());
        assertEquals("airfoil", matcherOne.group());
        
        Matcher matcherTwo = this.matcher.simple("aerofoil", regex);
        assertTrue(matcherTwo.find());
        assertEquals("aerofoil", matcherTwo.group());
    }

    @Test
    public void testCharacterClassRange() {
        Matcher matcher = this.matcher.simple("We are in 2020", "20[0-2][0-9]?");
        assertTrue(matcher.find());
        assertEquals("2020", matcher.group());
    }

    @Test
    public void testCharacterClassNegate() {
        Matcher matcher = this.matcher.simple("saia", "[^a]+");
        assertTrue(matcher.find());
        assertEquals("s", matcher.group());
        assertTrue(matcher.find());
        assertEquals("i", matcher.group());
        assertFalse(matcher.find());
    }


    @Test
    public void testDigitShorthands() {
        String text = "Tokyo 2020";

        Matcher matcherDigit = matcher.simple(text, "\\d+");
        assertTrue(matcherDigit.find());
        assertEquals("2020", matcherDigit.group());

        Matcher matcherNonDigit = matcher.simple(text, "\\D+");
        assertTrue(matcherNonDigit.find());
        assertEquals("Tokyo ", matcherNonDigit.group());
    }

    @Test
    public void testWordShorthands() {
        String text = "The Spider-Man_2";

        Matcher matcherWord = matcher.simple(text, "\\w+");
        assertTrue(matcherWord.find());
        assertEquals("The", matcherWord.group());
        assertTrue(matcherWord.find());
        assertEquals("Spider", matcherWord.group());
        assertTrue(matcherWord.find());
        assertEquals("Man_2", matcherWord.group());

        Matcher matcherNonWord = matcher.simple(text, "\\W+");
        assertTrue(matcherNonWord.find());
        assertEquals(" ", matcherNonWord.group());
        assertTrue(matcherNonWord.find());
        assertEquals("-", matcherNonWord.group());
    }

    @Test
    public void testWhitespaceShorthands() {
        String text = "   Wolverine ";

        Matcher matcherWS = matcher.simple(text, "\\s+");
        assertTrue(matcherWS.find());
        assertEquals("   ", matcherWS.group());
        assertTrue(matcherWS.find());
        assertEquals(" ", matcherWS.group());

        Matcher matcherNonWS = matcher.simple(text, "\\S+");
        assertTrue(matcherNonWS.find());
        assertEquals("Wolverine", matcherNonWS.group());
    }

    //TODO
    @Test
    public void testUnion() {
        Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testIntersection() {
        Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testSubstraction() {
        Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testSingleLineMode() {
        Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testArchor() {
        Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testMultilineMode() {
        Matcher matcher = this.matcher.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

}