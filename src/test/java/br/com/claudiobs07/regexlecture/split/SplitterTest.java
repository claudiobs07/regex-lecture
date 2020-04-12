package br.com.claudiobs07.regexlecture.split;

import org.junit.Test;

import static org.junit.Assert.*;

public class SplitterTest {

    ISplitter splitter = new SplitterJava();

    @Test
    public void testSplit() {
        String[] result = splitter.split("Java and Groovy and Kotlin", "\\s+and\\s+");
        assertEquals(3, result.length);
        assertEquals("Java", result[0]);
        assertEquals("Groovy", result[1]);
        assertEquals("Kotlin", result[2]);
    }

}