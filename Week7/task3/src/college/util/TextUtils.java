package college.util;

public class TextUtils {
    private static int successfulNormalizations;

    private TextUtils() {
    }

    public static String normalizeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }

        String trimmed = name.trim();
        StringBuilder singleSpaced = new StringBuilder();
        boolean previousWasSpace = false;

        for (int index = 0; index < trimmed.length(); index++) {
            char current = trimmed.charAt(index);
            if (Character.isWhitespace(current)) {
                if (!previousWasSpace) {
                    singleSpaced.append(' ');
                    previousWasSpace = true;
                }
            } else {
                singleSpaced.append(current);
                previousWasSpace = false;
            }
        }

        StringBuilder normalized = new StringBuilder();
        boolean capitalizeNext = true;
        for (int index = 0; index < singleSpaced.length(); index++) {
            char current = Character.toLowerCase(singleSpaced.charAt(index));
            if (current == ' ') {
                normalized.append(current);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                normalized.append(Character.toUpperCase(current));
                capitalizeNext = false;
            } else {
                normalized.append(current);
            }
        }

        successfulNormalizations++;
        return normalized.toString();
    }

    public static int getSuccessfulNormalizations() {
        return successfulNormalizations;
    }
}
