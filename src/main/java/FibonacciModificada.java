package main.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModificada {
    // Complete the fibonacciModified function below.
    static String fibonacciModified(int t1, int t2, int n) {
        BigInteger[] arr = new BigInteger[n];

        arr[0] = new BigInteger(Integer.toString(t1));
        arr[1] = new BigInteger(Integer.toString(t2));

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1].pow(2).add(arr[i - 2]);
        }

        return arr[n - 1].toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        String result = fibonacciModified(t1, t2, n);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
