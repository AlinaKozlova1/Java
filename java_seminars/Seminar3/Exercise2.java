package java_seminars.Seminar3;

import java.util.ArrayList;
import java.util.Random;

// 2.1 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//  Вывести название каждой планеты и количество его повторений в списке.
// 2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
public class Exercise2 {
    public static ArrayList fillArray() {
        int arrLength = 14;
        ArrayList<String> list = new ArrayList<>(arrLength);
        String[] planets = new String[] {
                "Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn",
                "Uranus", "Neptune" };

        Random r = new Random();

        for (int i = 0; i < arrLength; i++) {
            list.add(i, planets[r.nextInt(planets.length)]);
        }

        System.out.println(list);
        return list;
    }

    public static void countItem(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            Object tempPlanet = list.get(i);
            for (int j = i; j < list.size() - 1; j++) {
                if (tempPlanet.equals(list.get(j + 1))) {
                    count++;
                    list.remove(j + 1);
                    j--;
                }
            }
            System.out.println(tempPlanet + " ---> " + count);
        }

    }

    public static void main(String[] arg) {
        ArrayList planetsList = fillArray();
        countItem(planetsList);

    }

}
