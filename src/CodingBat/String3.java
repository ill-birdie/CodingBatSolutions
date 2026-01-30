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
}
