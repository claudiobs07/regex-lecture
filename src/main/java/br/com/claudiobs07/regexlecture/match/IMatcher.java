package br.com.claudiobs07.regexlecture.match;

import java.util.regex.Matcher;

public interface IMatcher {

    Matcher simple(String text, String regex);
}
