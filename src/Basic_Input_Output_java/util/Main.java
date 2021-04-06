package Basic_Input_Output_java.util;
import javafx.scene.Parent;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("JavaCourse Udemy Section 14  ");
        MyThread t = new MyThread();
        t.start();

        for (int i=0; i<5; i++)
        {

            System.out.println(Thread.currentThread().getName()
                    + " in control");
            // Control passes to child thread
            Thread.yield();

            // After execution of child Thread
            // main thread takes over

        }


    }
}


class MyThread extends Thread
{
    public void run()
    {
        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()
                    + " in control");
    }
}

