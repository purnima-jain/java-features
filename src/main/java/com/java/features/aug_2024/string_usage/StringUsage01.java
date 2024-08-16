package com.java.features.aug_2024.string_usage;

public class StringUsage01 {

    public static void main(String[] args) {

        // If you need to put multiple strings together, separated by a delimiter, use the static join method
        String allJoined = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(allJoined); // allJoined is the string "S / M / L / XL"

        // **************************************************

        // The repeat method produces a string that repeats a given string a number of times:
        String javaRepeatedThrice = "Java".repeat(3); // javaRepeatedThrice is "JavaJavaJava"
        System.out.println(javaRepeatedThrice);

    }
}
