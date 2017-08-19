package br.blog.cbs.regex.match;

import java.util.regex.Matcher;

public interface MatchRegex {

    Matcher simple(String text, String regex);
}
