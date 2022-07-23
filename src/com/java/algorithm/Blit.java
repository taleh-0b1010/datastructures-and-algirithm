package com.java.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Blit {

    public static void main(String[] args) {
        String binary = args[0];

        int pyramidHeight = findPyramidHeight(args[0]);
        List<String> list = decomposeBinary(binary);

        System.out.println(list);
        int[][] pyramid = buildFirstPyramid(list, pyramidHeight);
    }

    private static int[][] buildFirstPyramid(List<String> list, int pyramidHeight) {
        int pyramidLength = list.get(list.size() - 1).length();
        int[][] pyramid = new int[pyramidHeight][pyramidLength];
        for (int i = pyramidHeight - 1; i >= 0; i--) {
            String s = list.get(i);
            System.out.println(s);
            int x = (pyramidLength - s.length()) / 2;
            for (int j = s.length() - 1; j >= 0; j--) {
                pyramid[i][x] = Integer.parseInt(String.valueOf(s.charAt(j)));
                x++;
            }
            printPyramid(pyramid);
            System.out.println();
        }
        return pyramid;
    }

    private static List<String> decomposeBinary(String binary) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= binary.length(); i = i + 2) {
            String s = binary.substring(binary.length() - i);
            list.add(s);
            binary = binary.substring(0, binary.length() - i);
        }
        return list;
    }

    private static int findPyramidHeight(String binary) {
        int log4 = (int) (Math.log(binary.length()) / Math.log(4));
        int rowCount = 1;
        for (int i = 1; i <= log4; i++) {
            rowCount = rowCount * 2;
        }
        return rowCount;
    }

    private static void printPyramid(int[][] pyramid) {
        for (int[] ints : pyramid) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
    }
}
