package br.com.claudiobs07.regexlecture.replace;

public class ReplacerJava implements IReplacer {

    @Override
    public String replace(String text, String replacement, String pattern) {
	return text.replaceAll(pattern, replacement);
    }
}
