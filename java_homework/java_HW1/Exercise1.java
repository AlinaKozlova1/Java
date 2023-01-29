// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
package java_homework.java_HW1;

import java.util.Scanner;

public class Exercise1 {
    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getTringleNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }

    public static void main(String [] arg){
        
        Scanner s = new Scanner(System.in); 
        // входной поток; system.in - стандартный поток входных данных
        System.out.println("Введите число: ");
        int num = s.nextInt();
        System.out.println("Введите 1 для вычисления треугольного числа,\n" +
        "введите 2 для вычисления факториала: ");
        int i = s.nextInt();

        if (i == 1) {
            System.out.println("Ответ: " + getTringleNumber(num));

        } else if (i == 2){
            System.out.println("Ответ: " + getFactorial(num));

        }else{
            System.out.println("Такого варианта нет.");

        }
        s.close();

    }

}
