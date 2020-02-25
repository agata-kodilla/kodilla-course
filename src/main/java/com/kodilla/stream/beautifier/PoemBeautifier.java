package com.kodilla.stream.beautifier;



public class PoemBeautifier{

    public void beautify( String text, PoemDecorator poemDecorator){
        String s = poemDecorator.decorate(text.toUpperCase());
        System.out.println(s);
    }

    public void beautifySecond( String text, PoemDecorator poemDecorator){
        String s = poemDecorator.decorate(text.replaceFirst(text.substring(0, 1),"!!!"));
        System.out.println(s);
    }

    public void beautifyThird( String text, PoemDecorator poemDecorator){
        String s = poemDecorator.decorate(String.valueOf(text.hashCode()));
        System.out.println(s);
    }
}
