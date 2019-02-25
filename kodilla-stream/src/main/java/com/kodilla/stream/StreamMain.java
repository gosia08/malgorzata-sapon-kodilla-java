package com.kodilla.stream;


import com.kodilla.stream.com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ABC",(string -> "ABC" + string + "ABC"));
        poemBeautifier.beautify("",string -> string.toUpperCase());
        poemBeautifier.beautify("",string -> string.toLowerCase());
        poemBeautifier.beautify("ccc",string -> string.toUpperCase());

    }

}
