package br.com.claudiobs07.regexlecture.replace

import java.util.regex.Matcher
import java.util.regex.Pattern

class ReplacerGroovy implements IReplacer {

    @Override
    String replace(String text, String replacement, String pattern) {
        Pattern p = Pattern.compile(pattern)
        Matcher m = p.matcher(text)
        if (m.find()) {
            return m.replaceFirst(replacement)
        }
        return text
    }

}
