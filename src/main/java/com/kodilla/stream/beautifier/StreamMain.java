package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("qwewfmwefwefqekfqoekfq", (text)-> text );
        poemBeautifier.beautifySecond("trehrthrthythrth", (text)-> text );
        poemBeautifier.beautifyThird("xmsjcnwj", (text)-> text );
    }
}
