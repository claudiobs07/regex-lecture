package br.blog.cbs.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaMatchRegex implements MatchRegex {

    @Override
    public Matcher simple(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(text);
    }
}
