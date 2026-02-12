package CodingBat;

public final class Array2 {
    private Array2() { }

    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            String currResult = "";
            if (i % 3 == 0) {
                currResult += "Fizz";
            }
            if (i % 5 == 0) {
                currResult += "Buzz";
            }
            if (currResult.isEmpty()) {
                currResult = String.valueOf(i);
            }
            result[i - start] = currResult;
        }
        return result;
    }
}
