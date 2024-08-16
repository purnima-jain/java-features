package com.java.features.aug_2024.mathclamp;

public class MatchClamp {

    public static void main(String[] args) {

        // A clamp function restricts a value to within a range.
        // Values below the minimum are set to the minimum.
        // Values above the maximum are set to the maximum.
        // Also, values within the range return themselves.
        // Does not work with object data-types; only works with primitives.
        double input = 20.5;

        double inBetween = Math.clamp(input, 19.5, 21.5);
        System.out.println(inBetween + " is between 19.5 and 21.5");

        double clampedToMinimum = Math.clamp(input, 25.5, 30.5);
        System.out.println(input + " is clamped to the minimum " + clampedToMinimum);

        double clampedToMaximum = Math.clamp(input, 10.5, 15.5);
        System.out.println(input + " is clamped to the maximum " + clampedToMaximum);
    }
}
