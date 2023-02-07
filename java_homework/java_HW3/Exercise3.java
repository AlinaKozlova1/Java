package java_homework.java_HW3;

import java.util.ArrayList;
import java.util.Arrays;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.
public class Exercise3 {
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 27, 3, 24, 45, 16));
        int maxNumber = list.get(0);
        int minNumber = list.get(0);
        int avarageNumber = 0;
        for (int i = 1; i < list.size(); i++) {
            if (maxNumber < list.get(i)) {
                maxNumber = list.get(i);
            }
            if (minNumber > list.get(i)){
                minNumber = list.get(i);
            }
            avarageNumber += list.get(i);
        }
        avarageNumber /= list.size();
        System.out.println(list);
        System.out.printf("max = %d, min = %d, avarage = %d", maxNumber, minNumber, avarageNumber);

        
    }
}
