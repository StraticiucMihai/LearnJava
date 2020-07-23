package PreviousImplementation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Car
{
    private boolean engine ;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders,  String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
        this.engine = true;
    }

    public boolean isEngine() {
        return this.engine;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getName() {
        return this.name;
    }
    public void startEngine()
    {
        System.out.println("No car is here to start");
    }
    public void Accelerate ()
    {
        System.out.println("Accelerate a non existing car");
    }
    public void Break()
    {
        System.out.println("Stop non existing car");
    }
}
class Ferarri extends Car
{
    public Ferarri(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari start");
    }

    @Override
    public void Accelerate() {
        System.out.println("Ferrari accelerate");
    }

    @Override
    public void Break() {
        System.out.println("Ferrari stop");
    }
}
class  BMW extends  Car
{
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("PreviousImplementation.BMW start");
    }

    @Override
    public void Accelerate() {
        System.out.println("PreviousImplementation.BMW accelerate");
    }

    @Override
    public void Break() {
        System.out.println("PreviousImplementation.BMW accelerate");
    }
}
class Rolls_Royce extends Car
{
    public Rolls_Royce(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public void startEngine() {
        System.out.println("PreviousImplementation.Rolls_Royce start");;
    }

    @Override
    public void Accelerate() {
        System.out.println("PreviousImplementation.Rolls_Royce accelerate");
    }

    @Override
    public void Break() {
        System.out.println("PreviousImplementation.Rolls_Royce stop");
    }
}

public class Main_class
{
    /*Declare a scanner that read from the console   scanner is one of the methods that allow us to introduce inputs from the console */
    //private static Scanner scanner = new Scanner(System.in);









    public static  int [ ] getInt(int nr)
    {
        System.out.println("Enter "+ nr +"Integers values. \r");

        int [] values = new int[nr];

        for (int i =0 ; i<values.length;i++)
        {
            //  values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void main( String[] args)
    {
        /*arrays */

        //  int [] my_array; /*Unbound array*/
        /*declare all variable of the array */
       /* int [] myint = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lenght = myint.length;
        System.out.println("Length of the array is : " + lenght);
        double[] new_double = new double[10];
        new_double[2] = 2.55;


        int [] MyInt = getInt(5);
        for(int i=0;i<MyInt.length;i++) System.out.println("MyInt["+i+"]"+"="+ MyInt[i]);
        int [] my_array = readIntegers(10);
        int minValue = findMin(my_array);
        System.out.println("Array is :" + Arrays.toString(my_array) );
        System.out.println("Min value is:" +minValue);*/

       /*ArrayList*/
        List new_list = new List();
        new_list.addElements("Mihai");
        new_list.addElements("Andreea");
        new_list.printelements();
        ArrayList<String> my_list = new ArrayList<String>();
        my_list.add("Mihai");
        my_list.add("Andreea");
        my_list.add("Diana");
        boolean retVal= my_list.contains("Mihai");

        int position = my_list.indexOf("Diana");
        System.out.println("Ret val is:"  +retVal+"Position is:"+ position);
        



    }

    private static int [] readIntegers( int count)
    {
        int [] return_array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<count;i++)
        {
            try{
                return_array[i]=scanner.nextInt();
            }
            catch ( InputMismatchException exception )
            {
                System.out.println("you have entered a wrong number format");
            }
        }
        System.out.println("Thank you");
        return return_array;
    }
    private static int findMin(int [] array)
    {
        int min_value=0;

        for(int i=0; i <array.length;i++)
        {
            if(min_value > array[i])
            {
                min_value= array[i];
            }
        }

        return min_value;
    }

}
