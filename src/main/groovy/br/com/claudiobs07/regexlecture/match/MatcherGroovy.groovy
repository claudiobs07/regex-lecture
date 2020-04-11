package br.com.claudiobs07.regexlecture.match

import java.util.regex.Matcher

class MatcherGroovy implements IMatcher {

    @Override
    Matcher simple(String text, String regex) {
        text =~ regex
    }

}
