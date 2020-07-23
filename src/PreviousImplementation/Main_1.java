package PreviousImplementation;

import java.util.Iterator;
import java.util.LinkedList;

public class Main_1 {


    public static void main(String[] args) {


        LinkedList<String> my_list = new LinkedList<String>();
        my_list.add("PreviousImplementation.BMW");
        my_list.add("Audi");
        my_list.add("Woltsfagen");
        my_list.add("RollsRoils");
        my_list.add("Skoda");
        my_list.add("Mihai");
        my_list.add("Andreea");
        my_list.add("Diana");
        my_list.add("Gabriela");

         Print(my_list);

    }

    private static void Print(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Masina este: "+i.next());
        }
    }
}
