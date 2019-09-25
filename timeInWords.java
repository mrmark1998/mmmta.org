import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String numWord(int x) {

        if (x == 0) return "twelve";
        if (x == 1) return "one";
        if (x == 2) return "two";
        if (x == 3) return "three";
        if (x == 4) return "four";
        if (x == 5) return "five";
        if (x == 6) return "six";
        if (x == 7) return "seven";
        if (x == 8) return "eight";
        if (x == 9) return "nine";
        if (x == 10) return "ten";
        if (x == 11) return "eleven";
        if (x == 12) return "twelve";
        if (x == 13) return "thirteen";
        if (x == 14) return "fourteen";
        if (x == 15) return "fifteen";
        if (x == 16) return "sixteen";
        if (x == 17) return "seventeen";
        if (x == 18) return "eighteen";
        if (x == 19) return "nineteen";
        if (x == 20) return "twenty";
        if (x == 21) return "twenty one";
        if (x == 22) return "twenty two";
        if (x == 23) return "twenty three";
        if (x == 24) return "twenty four";
        if (x == 25) return "twenty five";
        if (x == 26) return "twenty six";
        if (x == 27) return "twenty seven";
        if (x == 28) return "twenty eight";
        if (x == 29) return "twenty nine";
        if (x == 30) return "thirty";
        return "";
    }
    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {

        String s = "";

        if (m == 0) s = numWord(h) + " o' clock";

        if (m == 1) s = "one minute past " + numWord(h);

        if (m > 1 && m < 30 && m != 15) s = numWord(m) + " minutes past " + numWord(h);

        if (m == 15) s = "quarter past " + numWord(h);

        if (m == 30) s = "half past " + numWord(h);

        if (m > 30 && m < 59 && m != 45) s = numWord(60-m) + " minutes to " + numWord((h+1)%12);

        if (m == 45) s = "quarter to " + numWord((h+1)%12);

        if (m == 59) s = "one minute to " + numWord((h+1)%12);

        return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
