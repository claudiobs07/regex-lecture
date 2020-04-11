package br.com.claudiobs07.regexlecture.replace;

import junit.framework.TestCase;
import org.junit.Test;

public class ReplacerTest extends TestCase {

    IReplacer replacer = new ReplacerGroovy();

    @Test
    public void testReplace() {
        String result = replacer.replace("", "", "");
        assertEquals("", result);
    }

}