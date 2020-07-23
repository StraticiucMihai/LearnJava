package PreviousImplementation;

import java.util.ArrayList;

public class List {

    private ArrayList<String> My_arraylist = new ArrayList<String>();

   public void addElements(String element)
   {
    My_arraylist.add(element);
   }
   public void printelements()
   {
       System.out.println("You have added:" + My_arraylist.size()+"elements in Array list ");
       for (int i =0 ;i<My_arraylist.size();i++)
       {
           System.out.println("Element:"+i+" is "+ My_arraylist.get(i));
       }
   }
}
