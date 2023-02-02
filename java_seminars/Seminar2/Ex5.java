package java_seminars.Seminar2;

import java.io.IOException;
import java.util.logging.Logger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. 
// В случае возникновения исключения, оно должно записаться в лог-файл.
public class Ex5 {

    public static String readFile(String path, Charset encoding) throws IOException {
        return Files.readString(Paths.get(path), encoding);
    }
 
    public static void main(String[] args)
    {
        String filePath = "PrintTest.txt";
 
        String content = null;
        try {
            content = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            Logger logger = Logger.getAnonymousLogger();
            logger.warning("There was a problem with reading the file.");
        }
 
        System.out.println(content);
    }
}


        
    
    

