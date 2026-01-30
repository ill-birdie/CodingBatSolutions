package CodingBat;

public final class String3 {
    private String3() {
    }

    public static int countYZ(String str) {
        int count = 0;
        int startIdx = 0;
        while (!str.substring(startIdx, startIdx + 1).matches("[A-Za-z]")) {
            startIdx++;
        }
        str = str.substring(startIdx);
        String[] words = str.split("[^A-Za-z]+");
        for (String w : words) {
            String lastLetter = w.substring(w.length() - 1);
            if ("YyZz".contains(lastLetter)) {
                count++;
            }
        }
        return count;
    }

    public static String withoutString(String base, String remove) {
        int idx = 0;
        while (idx <= base.length() - remove.length()) {
            String currWindow = base.substring(idx, idx + remove.length());
            if (currWindow.equalsIgnoreCase(remove)) {
                base = base.substring(0, idx) + base.substring(idx + remove.length());
            } else {
                idx++;
            }
        }
        return base;
    }

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar != 'g') {
                continue;
            }

            boolean hasG = i > 0 && str.charAt(i - 1) == 'g';
            if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
                hasG = true;
            }
            if (!hasG) {
                return false;
            }

        }
        return true;
    }

    public static String sameEnds(String string) {
        String longest = "";
        for (int i = 1; i <= string.length() / 2; i++) {
            String prefix = string.substring(0, i);
            String suffix = string.substring(string.length() - i);
            if (prefix.equals(suffix)) {
                longest = prefix;
            }
        }
        return longest;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }

    public static String notReplace(String str) {

    }
}
