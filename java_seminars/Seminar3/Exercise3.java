package java_seminars.Seminar3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


// 3. Создать список типа ArrayList<String>. 
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
public class Exercise3 {
    public static void findNumbers(ArrayList list1) {
        List <Integer> listOfNumbers = list1
        .stream().
        filter(e -> e instanceof Number)
        .collect(Collectors.toList());
        // for (int i = 0; i<list1.size(); i++){
            // if (list1.get(i) instanceof Integer){
            // if (list1.get(i))
            //     list1.remove(i);
            // }
        System.out.println(listOfNumbers);
        // }        
    }
    public static void main(String [] arg) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("a", "6", "b", "1"));
        // list.add("a");
        // list.add("6");
        // list.add("l");
        System.out.println(list);
        findNumbers(list);
        System.out.println(list);

        
    }
    

}
