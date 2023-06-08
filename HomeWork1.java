package homeWork1;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        // System.out.println(getDivision(4, 0));
        // System.out.println(arrIndex(10));
        //int[]array = new int[]{1, 2, 3, 4, 5};
        //System.out.println(getIndex(array, 0));
        int[]arrayA = new int[]{5, 4, 3, 2, 1};
        int[] arrayB =  new int[]{1, 2, 3, 2, 1, 5};
        System.out.println(Arrays.toString(getDifference(arrayA, arrayB)));
    }
    // 1 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;
    private static int getDivision(int a, int b){ // ArithmeticException
        return a/b;
    }
    private static int arrIndex(int index){  // Index out of bounds
        int[] arr = new int[]{1, 2, 3, 4, 5};
        return arr[index];
    }
    private static int getIndex(int[] arr, int num){ //RuntimeException
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) return i;
        }
        throw new RuntimeException("Такого элемента в массиве нет");
    }

    // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    // ArrayIndexOutOfBoundsException при количестве элементов в массиве > 6
    // NumberFormatException при типе данных не integer
    // NullPointerException при значениях массива null


    //3 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив,
    // каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    private static int[] getDifference (int[] arrA, int[] arrB){
        int[] resultArr = new int[arrA.length];
        if (arrA.length != arrB.length) throw new RuntimeException("Массивы разной длины!");
        else {
            for (int i = 0; i < arrA.length; i++) {
                resultArr[i] = arrA[i]- arrB[i];
            }
        }
        return resultArr;
    }
}
