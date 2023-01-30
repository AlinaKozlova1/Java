package java_seminars.Seminar2;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//  которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class Ex1 {
    
    public static StringBuilder printSymbols() {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter an even number: ");
        int number = s.nextInt();
        while (number % 2 != 0) {
            System.out.println("Your number is not even. Try again: ");
            number = s.nextInt();
        }
        for (int i = 0; i < number; i += 2) {
            sb.append("c1c2");
        }
        System.out.println(sb);
        s.close();
        return sb;

    }

    public static void main(String[] arg) {
        printSymbols();
    }
}
