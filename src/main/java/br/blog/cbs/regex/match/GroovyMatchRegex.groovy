package br.blog.cbs.regex.match

import java.util.regex.Matcher

class GroovyMatchRegex implements MatchRegex {

    @Override
    Matcher simple(String text, String regex) {
        text =~ regex
    }

}
