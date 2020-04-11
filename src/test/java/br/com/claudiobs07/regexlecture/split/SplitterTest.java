package br.com.claudiobs07.regexlecture.split;

import org.junit.Test;

import static org.junit.Assert.*;

public class SplitterTest {

    ISplitter splitter = new SplitterGroovy();

    @Test
    public void testSplit() {
        String[] result = splitter.split("", "");
        assertEquals(0, result.length);
    }

}