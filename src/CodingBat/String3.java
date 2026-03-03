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

    public boolean equalIsNot(String str) {
        int numIs = 0;
        int numNot = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("is", i)) {
                numIs++;
            } else if (i < str.length() - 2 && str.startsWith("not", i)) {
                numNot++;
            }
        }
        return numIs == numNot;
    }

    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == 'g') {
                boolean hasG = (i > 0 && str.charAt(i - 1) == 'g') ||
                        (i < str.length() - 1 && str.charAt(i + 1) == 'g');
                if (!hasG) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int countTriple(String str) {
        if (str.length() < 3) {
            return 0;
        }

        int numTriples = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String currWindow = str.substring(i, i + 3);
            if (currWindow.matches("^(.)\\1\\1$")) {
                numTriples++;
            }
        }
        return numTriples;
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
        if (str.isEmpty()) {
            return 0;
        }
        int mBlock = 1;
        int currBlock = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                currBlock++;
            } else {
                mBlock = Math.max(mBlock, currBlock);
                currBlock = 1;
            }
        }
        return Math.max(mBlock, currBlock);
    }

    public static String notReplace(String str) {
        String letters = "[A-Za-z]";
        String noLetterPrecedes = "(?<!" + letters + ")";
        String noLetterFollows = "(?!" + letters + ")";
        String regex = noLetterPrecedes + "is" + noLetterFollows;
        return str.replaceAll(regex, "is not");
    }
}
