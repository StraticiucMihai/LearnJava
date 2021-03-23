package Exercitii;

//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {13, 7, 6, 45, 21, 9, 101, 102};
        int[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};
        int[] arr3 = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        int[] arr4 = {-13, -7, -6, -45, -21, -9, -2, -100};
        int[] arr5 = {1,3,6,4,1,2};
        int[] arr6 = {1,2,3,};
        int retVal = 0;
//        Exercitiu1.sort(arr1);
//        Exercitiu1.sort(arr3);
//        Exercitiu1.sort2(arr2);
//        Exercitiu1.sort3(arr3);
        retVal = Exercitiu1.solution(arr1);
        System.out.println("RetVal = " +retVal);
        retVal = Exercitiu1.solution(arr2);
        System.out.println("RetVal = " +retVal);
        retVal = Exercitiu1.solution(arr3);
        System.out.println("RetVal = " +retVal);
        retVal = Exercitiu1.solution(arr4);
        System.out.println("RetVal = " +retVal);
        retVal = Exercitiu1.solution(arr5);
        System.out.println("RetVal = " +retVal);
        retVal = Exercitiu1.solution(arr6);
        System.out.println("RetVal = " +retVal);


    }
}

class Exercitiu1 {

    public static int solution(int [] A){
        int min_value = 1;
        int [] ascended_sorted = sort(A);
        boolean value_find = false;
        boolean is_present = false;

        if(ascended_sorted[ascended_sorted.length -1] < 0){ return min_value;}

        do {
            for (int i =0 ; i<  ascended_sorted.length ; i++){
                if (min_value == ascended_sorted[i]){
                    is_present = true;
                    break;
                }
            }

            if (is_present == true){
                min_value++;
               is_present = false;
            }
            else value_find = true;

        }while(value_find == false);

        return min_value;
    }

    public static int[] sort(int [] array){
        printarr(array);
        for (int i = 0 ; i < array.length; i++){
            for (int j = 0; j< array.length; j++){
                int temp = 0;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printarr(array);
        return array;
    }
    /*By default is sorting in ascending order using Arrays class*/
    public static int [] sort2(int [] array){
        printarr(array);
        Arrays.sort(array);
        printarr(array);
        return array;
    }
    /*Sort an array in descending order using Arrays class*/
    public static void sort3(int [] array){
        Integer[] newArray = new Integer[array.length];
        int inr =0;
        for (int i =0 ; i < array.length ; i++){
            newArray[inr++] = Integer.valueOf(array[i] + " ");
        }
        for (Integer i:newArray) System.out.print(i);
        Arrays.sort(newArray, Collections.reverseOrder());
        for (Integer i:newArray) System.out.print("\n"+i + " ");
    }
    private static void printarr(int [] arr){
        for (int i =0 ; i< arr.length;i++) System.out.print(arr[i]+ " ");
        System.out.println("\n");
    }

}
