package br.com.claudiobs07.regexlecture.split;

public class SplitterJava implements ISplitter {

    @Override
    public String[] split(String text, String regex) {
	return text.split(regex);
    }
}
