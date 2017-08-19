package br.blog.cbs.regex.match;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.regex.Matcher;

public class MatchRegexTest extends TestCase {

    MatchRegex matchRegex = new JavaMatchRegex();

    @Test
    public void testMatchLiteral() {
        Matcher matcher = matchRegex.simple("Are you Ready?", "\\QAre you Ready?\\E");
        assertTrue(matcher.find());
        assertEquals("Are you Ready?", matcher.group());
        assertFalse(matcher.find());
    }


    @Test
    public void testCaseInsensitive() {
        Matcher matcher = matchRegex.simple("The Force will be with you", "(?i)the force will be with you");
        assertTrue(matcher.find());
        assertEquals("The Force will be with you", matcher.group());
        assertFalse(matcher.find());
    }

    @Test
    public void testCharacterClassAny() {
        String regex = "a[ei]ro?foil";
        
        Matcher matcherOne = matchRegex.simple("airfoil", regex);
        assertTrue(matcherOne.find());
        assertEquals("airfoil", matcherOne.group());
        assertFalse(matcherOne.find());
        
        Matcher matcherTwo = matchRegex.simple("aerofoil", regex);
        assertTrue(matcherTwo.find());
        assertEquals("aerofoil", matcherTwo.group());
        assertFalse(matcherTwo.find());
    }

    @Test
    public void testCharacterClassRange() {
        Matcher matcher = matchRegex.simple("We are in 2017","20[0-1][0-8]?");
        assertTrue(matcher.find());
        assertEquals("2017", matcher.group());
        assertFalse(matcher.find());
    }


    //TODO
    @Test
    public void testCharacterClassNegate() {
        Matcher matcherZero = matchRegex.simple("", "");
        assertTrue(matcherZero.find());
        assertEquals("", matcherZero.group());
        assertFalse(matcherZero.find());
    }


    @Test
    public void testDigitShorthands() {
        String text = "java8";
        Matcher matcherDigit = matchRegex.simple(text, "\\d+");
        assertTrue(matcherDigit.find());
        assertEquals("8", matcherDigit.group());
        assertFalse(matcherDigit.find());

        Matcher matcherNonDigit = matchRegex.simple(text, "\\D+");
        assertTrue(matcherNonDigit.find());
        assertEquals("java", matcherNonDigit.group());
        assertFalse(matcherNonDigit.find());
    }

    //TODO
    @Test
    public void testWordShorthands() {
        String text = "";
        Matcher matcherWord = matchRegex.simple(text, "\\w+");
        assertTrue(matcherWord.find());
        assertEquals("", matcherWord.group());
        assertFalse(matcherWord.find());

        Matcher matcherNonWord = matchRegex.simple(text, "\\W+");
        assertTrue(matcherNonWord.find());
        assertEquals("", matcherNonWord.group());
        assertFalse(matcherNonWord.find());
    }

    //TODO
    @Test
    public void testWhitespaceShorthands() {
        String text = "";
        Matcher matcherWS = matchRegex.simple(text, "\\s+");
        assertTrue(matcherWS.find());
        assertEquals("", matcherWS.group());
        assertFalse(matcherWS.find());

        Matcher matcherNonWS = matchRegex.simple(text, "\\S+");
        assertTrue(matcherNonWS.find());
        assertEquals("", matcherNonWS.group());
        assertFalse(matcherNonWS.find());
    }

    //TODO
    @Test
    public void testUnion() {
        Matcher matcher = matchRegex.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testIntersection() {
        Matcher matcher = matchRegex.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testSubstraction() {
        Matcher matcher = matchRegex.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testSingleLineMode() {
        Matcher matcher = matchRegex.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testArchor() {
        Matcher matcher = matchRegex.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

    //TODO
    @Test
    public void testMultilineMode() {
        Matcher matcher = matchRegex.simple("", "");
        assertTrue(matcher.find());
        assertEquals("", matcher.group());
        assertFalse(matcher.find());
    }

}