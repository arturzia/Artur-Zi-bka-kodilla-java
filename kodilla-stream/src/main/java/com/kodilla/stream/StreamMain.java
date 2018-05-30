package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Java is The Best",(a) ->"ABC"+a+"ABC");
        poemBeautifier.beautify("Java is The Best",(a) ->a.toUpperCase());
        poemBeautifier.beautify("Java is The Best",(a) ->a.toLowerCase());
        poemBeautifier.beautify("Java is The Best",(a) ->a.substring(7));

        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);

    }

}
