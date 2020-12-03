package lesson2;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        array(4, 4);
    }

    private static void array(int a, int b) {
        String[][] array1 = new String[a][b];
        int[][] array2 = new int[a][b];
        if (a != 4) {
            throw new MyArraySizeException();

        }
        if (b != 4) {
            throw new MyArraySizeException();
        }
        int summary = 0;
        for (int f = 0; f < array1.length; f++) {
            for (int i = 0; i < array1.length; i++) {
                try {
                    array2[f][i] = Integer.parseInt(array1[f][i]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(a , b);
                }
                summary += array2[f][i];
            }
        }
    }
}
