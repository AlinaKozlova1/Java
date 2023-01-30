// Реализовать простой калькулятор
package java_homework.java_HW1;

import java.util.Scanner;

public class Exercise3 {
    public static String calculator() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter a sign(+, -, *, /): ");
        String sign = s.next();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        int answer = 0;
        if (sign.equals("+")) {
            answer = num1 + num2;
        } else if (sign.equals("-")) {
            answer = num1 - num2;
        } else if (sign.equals("/")) {
            answer = num1 / num2;
        } else if (sign.equals("*")) {
            answer = num1 * num2;
        } else {
            System.out.println("There is no such sign.");
            s.close();
            return "There is no such sign.";
        }

        System.out.printf("%d %s %d = %d", num1, sign, num2, answer);
        s.close();
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        String strAnswer = Integer.toString(answer);

        return strNum1 + sign + strNum2 + " = " + strAnswer + "\n";
    }

    public static void main(String[] arg) {
        calculator();
    }
}
