package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomIntegerList(10, 100);
        showArray(randomArray);
        selectionSort(randomArray, false);
        showArray(randomArray);
    }

    public static int[] generateRandomIntegerList(int length, int bound) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 == i) {
                System.out.printf("%d%n", arr[i]);
            } else {
                System.out.printf("%d - ", arr[i]);
            }
        }
    }

    public static void selectionSort(int[] arr, boolean desc) {
        for (int i = 0; i < arr.length - 1; i++) {
            int elementIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (Boolean.TRUE.equals(desc)) {
                    if (arr[j] > arr[elementIndex]) {
                        elementIndex = j;
                    }
                } else {
                    if (arr[j] < arr[elementIndex]) {
                        elementIndex = j;
                    }
                }
            }

            if (elementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[elementIndex];
                arr[elementIndex] = temp;
            }
        }
    }
}
