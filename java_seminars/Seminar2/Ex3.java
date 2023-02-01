package java_seminars.Seminar2;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение). abcd
public class Ex3 {
    public static boolean isPalindrome(String data) {
        for (int i = 1; i <= data.length() / 2; i++) {
            if (data.charAt(i - 1) != data.charAt(data.length() - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.print("Palindrome: ");
        String p = s.nextLine();
        boolean answer = isPalindrome(p);
        System.out.println(answer);
        s.close();
    }

}
