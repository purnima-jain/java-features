package com.java.features.aug_2024.switch_usage;

public class Switch01 {

    public static void main(String[] args) {
        Integer seasonCode = 2;
        String seasonName = getSeasonNameForSeasonCode(seasonCode);
        System.out.println("Season Name for Season Code " + seasonCode + " is " + seasonName + ".");

        // **************************************************

        String inputSeasonName = "Spring";
        Integer seasonNumericalCode = getSeasonCodeForSeasonName(inputSeasonName);
        System.out.println("Season Code for Season Name " + inputSeasonName + " is " + seasonNumericalCode + ".");

        // **************************************************

        Size itemSize = Size.MEDIUM;
        String codeForItemSize = getCodeForItemSize(itemSize);
        System.out.println("Code for Item Size " + itemSize + " is " + codeForItemSize + ".");
    }

    private static String getSeasonNameForSeasonCode(Integer seasonCode) {

        String seasonName = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            case null -> "Null"; // If the selector, seasonCode, is null, a NullPointerException is thrown.
            default -> "???";    // Note that default does not match null!
        };

        return seasonName;
    }

    private static Integer getSeasonCodeForSeasonName(String inputSeasonName) {
        Integer seasonNumericalCode = switch (inputSeasonName) {
            case "Spring", "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> 1;
        };

        return seasonNumericalCode;
    }

    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    ;

    private static String getCodeForItemSize(Size itemSize) {

        String codeForItemSize = switch (itemSize) {
            case SMALL -> "S"; // no need to use Size.SMALL
            case MEDIUM -> "M";
            case LARGE -> "L";
            case EXTRA_LARGE -> "XL"; // no need for default, since there was a case for each possible value
        };

        return codeForItemSize;
    }
}
