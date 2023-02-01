package java_seminars.Seminar2;
//  Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

import java.util.Scanner;

public class Ex2 {
    public static StringBuilder compresseString(String symbols) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < symbols.length(); i++) {
            if (symbols.charAt(i) == symbols.charAt(i - 1)) {
                count++;

            } else {
                ;
                sb.append(Integer.toString(count) + (symbols.charAt(i - 1)));
                count = 1;

            }
            if (i == symbols.length() - 1) {
                sb.append(Integer.toString(count) + (symbols.charAt(i)));
            }
        }
        System.out.println(sb);
        return sb;
    }

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        compresseString(data);
        s.close();
    }
}
