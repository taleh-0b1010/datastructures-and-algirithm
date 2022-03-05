package com.java.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SequenceOfCells {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String matrixChars = scanner.next();
        String word = scanner.next();
        if (!isCorrectSizeOfString(matrixChars, word)) {
            System.out.println("1st or 2nd string is not correct!");
            return;
        }

        System.out.println(Arrays.deepToString(get2DMatrixOfString(matrixChars, word.length())));
        char[][] matrixOfString = get2DMatrixOfString(matrixChars, word.length());
        findCells(matrixOfString, word);
    }

    private static boolean isCorrectSizeOfString(String matrixChars, String word) {
        int lengthOfMatrixChars = matrixChars.length();
        int lengthOfWord = word.length();
        return Math.sqrt(lengthOfMatrixChars) == lengthOfWord;
    }

    private static char[][] get2DMatrixOfString(String string, int length) {
        char[][] matrixOfString = new char[length][length];
        for (int i = 0; i < length; i++) {
            String subString = string.substring(0, length);
            string = string.substring(length);
            for (int j = 0; j < length; j++) {
                matrixOfString[i][j] = subString.charAt(j);
            }
        }
        return matrixOfString;
    }

    private static void findCells(char[][] matrixOfString, String word) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (matrixOfString[i][j] == word.charAt(0)) {
                    list.add("[" + i + "," + j + "]");
                    recursiveFind(list, matrixOfString, word, 1, i, j);
                }
                if (list.size() == word.length()) {
                    break;
                }
            }
        }
        System.out.println(list);
    }

    private static void recursiveFind(List<String> list, char[][] matrixOfString, String word, int c, int i, int j) {
        if (c == word.length()) {
            return;
        }
        int a = i;
        int b = j;
        if (j + 1 < word.length() && matrixOfString[i][j + 1] == word.charAt(c)) {
            b = j + 1;
            list.add("[" + i + "," + b + "]");
        } else if (j - 1 >= 0 && matrixOfString[i][j - 1] == word.charAt(c)) {
            b = j - 1;
            list.add("[" + i + "," + b + "]");
        } else if (i - 1 >= 0 && matrixOfString[i - 1][j] == word.charAt(c)) {
            a = i - 1;
            list.add("[" + a + "," + j + "]");
        } else if (i + 1 < word.length() && matrixOfString[i + 1][j] == word.charAt(c)) {
            a = i + 1;
            list.add("[" + a + "," + j + "]");
        } else {
            if (c == 1) {
                list.remove(list.size() - 1);
                return;
            }
            list.remove(list.size() - 1);
            matrixOfString[a][b] = '0';
            recursiveFind(list, matrixOfString, word, c - 1, i, j);
            return;
        }
        recursiveFind(list, matrixOfString, word, c + 1, a, b);
    }
}
