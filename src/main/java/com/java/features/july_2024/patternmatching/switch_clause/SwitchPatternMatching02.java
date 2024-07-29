package com.java.features.july_2024.patternmatching.switch_clause;

public class SwitchPatternMatching02 {

    public static void main(String[] args) {
        String input = "Yes";
        System.out.println("Old :: " + processInputOld(input));
        System.out.println("New :: " + processInputNew(input));
    }

    static String processInputOld(String input) {
        String output = null;

        switch (input) {
            case null -> output = "Oops!!! null";
            case String s -> {
                if ("Yes".equalsIgnoreCase(s)) {
                    output = "It's Yes";
                } else if ("No".equalsIgnoreCase((s))) {
                    output = "It's No";
                } else {
                    output = "Try Again!!";
                }
            }
        }
        return output;
    }

    static String processInputNew(String input) {
        String output = null;

        switch (input) { // Java 21 Feature
            case null -> output = "Oops!!! null";
            case String s when "Yes".equalsIgnoreCase(s) -> output = "It's Yes";
            case String s when "No".equalsIgnoreCase(s) -> output = "It's No";
            case String s -> output = "Try Again!!";
        }
        return output;
    }

}
