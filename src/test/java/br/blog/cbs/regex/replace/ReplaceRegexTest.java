package br.blog.cbs.regex.replace;

import junit.framework.TestCase;
import org.junit.Test;

public class ReplaceRegexTest extends TestCase {

    ReplaceRegex replaceRegex = new ReplaceRegex();

    //TODO
    @Test
    public void testReplace() {
        String result = replaceRegex.replace("","", "");
        assertEquals("", result);
    }

}