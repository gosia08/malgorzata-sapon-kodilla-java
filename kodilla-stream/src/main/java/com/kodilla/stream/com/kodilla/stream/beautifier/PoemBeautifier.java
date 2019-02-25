package com.kodilla.stream.com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String string, PoemDecorator poemDecorator){
        String newString = poemDecorator.decorate(string);
        System.out.println(newString);
        return newString;
    }
}
