package java_homework.java_HW2;

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class Exercise4 {
    public static void addData(String data) {
        String fileName = "bubbleSortResults.txt";
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] arg) {
        int[] arr = new int[] { 10, 5, 4, 7, 9, 2, 1 };
        int n = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - n; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                addData(i + " loop --> " + Arrays.toString(arr) + "\n");

            }
            n++;
        }
    }

}
