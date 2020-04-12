package br.com.claudiobs07.regexlecture.split

class SplitterGroovy implements ISplitter {

    @Override
    String[] split(String text, String regex) {
        text.split(regex)
    }

}
