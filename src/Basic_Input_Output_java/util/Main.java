package Basic_Input_Output_java.util;
import javafx.scene.Parent;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("New chapter ");

        Parinte p1 = new Parinte("Nume 1 ");
        p1.printCommon();
        p1.printString();
        Parinte p2 = new copil("copil 1");
        p2.printCommon();
        p2.printString();
        copil p3 = new copil("copil 2");
        p3.printCommon();
        p3.printString();

    }


    public static class Parinte {
        public String commonString = "String Comun";
        private String privateString = " String Privat";

        public Parinte(String privateString) {
            this.privateString = privateString;
        }

        public void printString(){
            System.out.println(this.privateString);
        }
        public void printCommon(){
            System.out.println(this.commonString);
        }
    }
    public static class copil extends Parinte {

        public copil(String privateString) {
            super(privateString);
        }
    }

}

