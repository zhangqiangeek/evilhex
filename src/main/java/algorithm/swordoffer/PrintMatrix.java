package algorithm.swordoffer;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 *
 * @Author: evilhex
 * @Date: 2018-12-11 11:02
 */
public class PrintMatrix {

    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix != null) {
            // 行
            int rows = matrix.length;
            // 列
            int columns = matrix[0].length;
            int start = 0;
            while (columns > start * 2 && rows > start * 2) {
                PrintMatrixInCircle(matrix, columns, rows, start);
                ++start;
            }
        }
        return result;
    }

    public void PrintMatrixInCircle(int[][] arr, int columns, int rows, int start) {

        int endX = columns - 1 - start;
        int endY = rows - 1 - start;

        // 从左向右
        for (int i = start; i <= endX; i++) {
            int number = arr[start][i];
            result.add(number);
        }
        // 从上到下:最后退化成一列
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                int number = arr[i][endX];
                result.add(number);
            }
        }
        // 从右向左：最后退化成两行两列
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                int number = arr[endY][i];
                result.add(number);
            }
        }
        // 从下向上：最后退化成三行两列
        if (start < endX && (start < endY - 1)) {
            for (int i = endY - 1; i >= start + 1; --i) {
                int number = arr[i][start];
                result.add(number);
            }
        }
    }

    public static void main(String[] args) {
    }
}
