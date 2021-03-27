package Test_Interviu;

import java.util.ArrayList;

public class Task_2_Interview_problem {
    public static void main(String[] args) {
        System.out.println("Test Interview " + 18/2);
        System.out.println(solution(8,0));


//        ArrayList<Integer> numbers = new ArrayList<Integer>();
       // System.out.println(solution(18,2));
    }

    public static int solution(int N, int K) {
        // write your code in Java SE 8
        int current_amount = 1;
        int rounds_played = 0;
        ArrayList<Integer> jumps_numbers = new ArrayList<>();
        jumps_numbers=all_in_jumps(N, K);
        System.out.println("Target amount " + N + " All in " + K + " jump array " + jumps_numbers);

        if(N < 0 || K <0){
            System.out.println("Wrong input data " + K + N);
            return 0;
        }

        if(K == 0 ){ /*return N -1 ;*/
            for (int i = 1;i<=N-1;i++){
                rounds_played++;
                current_amount++;
                System.out.println("After round " + rounds_played + " : " + current_amount);
            }

        }
        else{
            while(current_amount != N){
                if(jumps_numbers.contains(new Integer(current_amount))){
                    current_amount = current_amount*2;
                }
                else{
                    current_amount++;
                }
                rounds_played++;
                System.out.println("Current amount "  + current_amount + " Round " + rounds_played + " All In Remained " + K);
            }
        }
        System.out.println("He played " + rounds_played + "\tRounds" +  " Current Amount " + current_amount);
        return rounds_played;
    }
    public static ArrayList<Integer> all_in_jumps(int nr , int nr_jumps){
        ArrayList<Integer> final_array = new ArrayList<Integer>();
        while(nr != 0){
            final_array.add(nr/2);
            nr= nr/2;
        }
        System.out.println("Temp final array\t" + final_array);
        if (final_array.contains(new Integer(1)))  final_array.remove(new Integer(1));
        if (final_array.contains(new Integer(0)))  final_array.remove(new Integer(0));
        System.out.println("Final final array " + final_array + " \tSize " + final_array.size());
        if (nr_jumps < final_array.size() && nr_jumps != 0){
            for(int i =0 ; i <final_array.size();i++){
                if(i >= nr_jumps) final_array.remove(i);
            }
        }
        System.out.println("After removing" + final_array);
        return final_array;
    }
}
