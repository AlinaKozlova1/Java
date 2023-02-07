package java_seminars.Seminar3;

import java.util.ArrayList;
import java.util.Random;

// 1 Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

public class Exercise1 {
    public static void main(String[] arg) {
        
    
        ArrayList<Integer> array = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            array.add(i, r.nextInt(10 + 1) - 5);
        }
        System.out.println("Before ---> " + array);

        array.sort(null);
        System.out.println("After ---> " + array);
    }
}

// https://mkyong.com/java/java-generate-random-integers-in-a-range/
// random bounds