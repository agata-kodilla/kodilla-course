package com.kodilla.stream.beautifier;


import org.jetbrains.annotations.NotNull;

public class PoemBeautifier{

    public void beautify(@NotNull String text, PoemDecorator poemDecorator){
        String s = poemDecorator.decorate(text.toUpperCase());
        System.out.println(s);
    }

    public void beautifySecond(@NotNull String text, PoemDecorator poemDecorator){
        String s = poemDecorator.decorate(text.replaceFirst(text.substring(0, 1),"!!!"));
        System.out.println(s);
    }

    public void beautifyThird(@NotNull String text, PoemDecorator poemDecorator){
        String s = poemDecorator.decorate(String.valueOf(text.hashCode()));
        System.out.println(s);
    }
}
