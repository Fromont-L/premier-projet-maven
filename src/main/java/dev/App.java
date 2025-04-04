package dev;

import com.github.lalyos.jfiglet.FigletFont;

public class App {
    public static void main(String[] args) {
        String asciiArt = FigletFont.convertOneLine("D1D13R \nC'est le GOAT");
        System.out.println(asciiArt);
    }
}
