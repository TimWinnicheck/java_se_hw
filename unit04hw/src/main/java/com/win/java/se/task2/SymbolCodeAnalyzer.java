package com.win.java.se.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SymbolCodeAnalyzer {

    private static String[] keywords = {"abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this",
            "break", "double", "implements", "protected", "throw",
            "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient",
            "catch", "extends", "int", "short", "try",
            "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile",
            "const", "float", "native", "super", "while"};
    String path;
    private int[] tally = new int[keywords.length];

    SymbolCodeAnalyzer(String path) {
        this.path = path;
        int i = 0;
        while (i < tally.length) {
            this.tally[i] = 0;
            i++;
        }
    }


    public void scan() throws FileNotFoundException {
        FileReader FileIN = null;
        FileIN = new FileReader(this.path);
        Scanner scanner = new Scanner(FileIN);
        while (scanner.hasNext()) {
            checkForKeyword(scanner.next());
        }
    }

    private void checkForKeyword(String stringToCheck) {
        int i = 0;
        while (i < keywords.length) {
            if (stringToCheck.compareTo(keywords[i]) == 0) {
                this.tally[i] = this.tally[i] + 1;
                return;
            } else i++;
        }
        return;
    }

    public void endTally() {
        int total = 0;
        int i = 0;
        System.out.println("Keywords:");
        while (i < this.tally.length) {
            if (this.tally[i] != 0) {
                System.out.println(keywords[i] + " " + this.tally[i]);
            }
            total = total + this.tally[i];
            i++;
        }
        System.out.println("Total: " + total);
    }
}
