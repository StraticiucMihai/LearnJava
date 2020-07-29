package JavaCollections.SetsHashSet;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes   = new HashSet<>();

        for (int i =1 ; i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are squares.size = " +squares.size()+" cuber.size =  "+cubes.size());
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union contains "+ union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contain: " + intersection.size());
        for(int i : intersection){
            System.out.println(i +" is the square of " + Math.sqrt(i)+ " and the cube of " + Math.cbrt(i));
        }

    }
}
