package br.blog.cbs.regex.replace

import java.util.regex.Matcher
import java.util.regex.Pattern

class ReplaceRegex {

    String replace(String text, String replacement, String pattern) {
        Pattern p = Pattern.compile(pattern)
        Matcher m = p.matcher(text)
        if (m.find()) {
            return m.replaceFirst(replacement)
        }
        return text
    }

}
