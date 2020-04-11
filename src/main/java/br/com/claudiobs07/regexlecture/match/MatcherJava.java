package br.com.claudiobs07.regexlecture.match;

import java.util.regex.Pattern;

public class MatcherJava implements IMatcher {

    @Override
    public java.util.regex.Matcher simple(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(text);
    }
}
