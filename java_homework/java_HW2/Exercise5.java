package java_homework.java_HW2;

import java.io.FileWriter;
import java.io.IOException;

import java_homework.java_HW1.Exercise3;

// К калькулятору из предыдущего дз добавить логирование.
public class Exercise5 {
    
    public static void addData(String data) {
        String fileName = "calcResults.txt";
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] arg) {
        String example = Exercise3.calculator();
        addData(example);
    }
    
}
