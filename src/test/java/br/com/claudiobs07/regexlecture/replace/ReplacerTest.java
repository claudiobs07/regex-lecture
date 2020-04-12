package br.com.claudiobs07.regexlecture.replace;

import junit.framework.TestCase;
import org.junit.Test;

public class ReplacerTest extends TestCase {

    IReplacer replacer = new ReplacerJava();

    @Test
    public void testReplace() {
        String result = replacer.replace("I like apple", "pineapple", "ap{2}le");
        assertEquals("I like pineapple", result);
    }

}