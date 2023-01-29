// Реализовать простой калькулятор
package java_homework.java_HW1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] arg)  {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter a sign(+, -, *, /): ");
        String sign = s.next();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        if (sign.equals("+")) {
            int answer = num1 + num2;
            System.out.printf("%d + %d = %d", num1, num2, answer);
        }else if (sign.equals("-")) {
            int answer = num1 - num2;
            System.out.printf("%d - %d = %d", num1, num2, answer);
        }else if (sign.equals("/")) {
            int answer = num1 / num2;
            System.out.printf("%d / %d = %d", num1, num2, answer);
        }else if (sign.equals("*")){
            int answer = num1 * num2;
            System.out.printf("%d * %d = %d", num1, num2, answer);
        }else{
            System.out.println("There is no such sign.");
        }
        s.close();
    }
}
