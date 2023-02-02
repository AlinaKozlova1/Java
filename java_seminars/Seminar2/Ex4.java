package java_seminars.Seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Ex4 {
    public static void main(String[] arg) {
        String fileName = "PrintTest.txt";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<101; i++){
            sb.append("TEST ");
            if (i%10 == 0){
                sb.append("\n");
            }
        }
        try (FileWriter fw = new FileWriter(fileName, true)){
            String text = sb.toString();
            fw.write(text);
        }catch(IOException e){
            e.printStackTrace();
            Logger logger = Logger.getAnonymousLogger();
            logger.warning("We wrote a file");
        }

    }
}
