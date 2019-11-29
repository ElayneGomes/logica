package main.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String novaString = "";
        int carr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
                carr[i] = ((int) s.charAt(i));
                if ((carr[i] + (k % 26)) > 90) {
                    novaString += (char) (carr[i] - 90 + 64 + (k % 26));
                } else if ((carr[i] + (k % 26)) <= 90) {
                    novaString += (char) (carr[i] + (k % 26));
                }
            }
            if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) {
                carr[i] = ((int) s.charAt(i));
                if ((carr[i] + (k % 26)) > 122) {
                    novaString += (char) (carr[i] - 122 + 96 + (k % 26));
                } else if ((carr[i] + (k % 26)) <= 122) {
                    novaString += (char) (carr[i] + (k % 26));
                }
            }
            if ((int) s.charAt(i) >= 91 && (int) s.charAt(i) <= 96) {
                carr[i] = (int) s.charAt(i);
                novaString += (char) (carr[i]);
            }
            if ((int) s.charAt(i) < 65 || (int) s.charAt(i) > 122) {
                carr[i] = (int) s.charAt(i);
                novaString += (char) (carr[i]);
            }

        }
        return novaString;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}