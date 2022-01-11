package ru.vsu.cs.zhikhorev_a_a;

public class RearrangingRowsAndColumns {
    public static int[][] rearrangeRowsAndColumns(int[][] sourceArray) {
        int[][] modifiedArray = new int[sourceArray[0].length][sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < sourceArray[0].length; j++) {
                modifiedArray[j][i] = sourceArray[i][j];
            }
        }

        return modifiedArray;
    }
}

