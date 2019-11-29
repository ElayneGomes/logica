package main.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int[][] arr) {
        // Write your code here

        // return arr.toString();

        int primeiraDiagonal = 0, segundaDiagonal = 0;

        for (int i = 0, j = arr[0].length - 1; i < arr[0].length; i++, j--) {
            primeiraDiagonal += arr[i][i];
            segundaDiagonal += arr[i][j];
        }

        return Math.abs(primeiraDiagonal - segundaDiagonal);
    }

}

public class DiagonalDiference {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            System.out.println();

            for (int j = 0; j < n; j++) {

                int arrItem = Integer.parseInt(arrRowTempItems[j]);

                arr[i][j] = arrItem;

                System.out.print(arr[i][j] + "\t");
            }
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}