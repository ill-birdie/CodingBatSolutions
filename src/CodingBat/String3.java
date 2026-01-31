package CodingBat;

public final class String3 {
    private String3() { }

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

    public static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
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

    public static String mirrorEnds(String string) {
        if (string.length() < 2) {
            return string;
        }

        int stoppingIndex = string.length() / 2;
        if (string.length() % 2 != 0) {
            stoppingIndex++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= stoppingIndex; i++) {
            char start = string.charAt(i);
            char end = string.charAt(string.length() - (i + 1));
            if (start == end) {
                sb.append(start);
            } else {
                break;
            }
        }
        String result = sb.toString();
        if (result.length() == stoppingIndex + 1) {
            result = string;
        }
        return result;
    }

    public static int maxBlock(String str) {
        int longest = 0;
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < str.length() - (i - 1); j++) {
                String currWindow = str.substring(j, j + i);
                System.out.println(currWindow);
                if (currWindow.matches("^(.)\\1*$")) {
                    longest = currWindow.length();
                    break;
                }
            }
        }
        return longest;
    }

    public static String notReplace(String str) {
        int i = 0;
        while (i < str.length() - 1) {
            String currWindow = str.substring(i, i + 2);

            boolean standalone = true;
            if (i > 0) {
                char prevChar = str.charAt(i - 1);
                if (Character.isLetter(prevChar)) {
                    standalone = false;
                }
            }
            if (i < str.length() - 2) {
                char nextChar = str.charAt(i + 2);
                if (Character.isLetter(nextChar)) {
                    standalone = false;
                }
            }

            if (standalone && currWindow.equals("is")) {
                str = str.substring(0, i + 2) + " not" + str.substring(i + 2);
                i += 5;
            }
            i++;
        }
        return str;
    }
}
