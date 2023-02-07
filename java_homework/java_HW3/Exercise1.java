package java_homework.java_HW3;

import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием
public class Exercise1 {
    public static void main(String [] arg) {
        int[] arr1 = new int[] { 1, 5, 7, 9, 11, 13};
        int[] arr2 = new int[] { 2, 3, 6, 10 };
        int[] arr3 = new int[arr1.length + arr2.length];

        int count1 = 0, count2 = 0;
        for (int i = 0; i< arr3.length; i++){
            if (count1 > arr1.length-1){
                arr3[i] = arr2[count2];
                count2++;
                System.out.println("count1 --> " + count1);
                System.out.println("count1 --> " + count2);
                System.out.println(Arrays.toString(arr3) + " 1 ");



            }else if(count2>arr2.length-1){
                arr3[i] = arr1[count1];
                count1++;
                System.out.println("count1 --> " + count1);
                System.out.println("count2 --> " + count2);
                System.out.println(Arrays.toString(arr3) + " 2 ");
            }else if(arr1[count1]<arr2[count2]){
                arr3[i] = arr1[count1];
                count1++;
                System.out.println(arr1[count1] + " " + arr2[count2]);
                System.out.println("count1 --> " + count1);
                System.out.println("count2 --> " + count2);
                System.out.println(Arrays.toString(arr3) + " 3 ");
            }else{
                arr3[i] = arr2[count2];
                count2++;
                System.out.println(arr1[count1] + " " + arr2[count2]);
                System.out.println("count1 --> " + count1);
                System.out.println("count2 --> " + count2);
                System.out.println(Arrays.toString(arr3) + " 4 ");
            }
        }
        // System.out.println(Arrays.toString(arr3));


    }
}
