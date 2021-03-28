package Test_Interviu;

import java.util.HashMap;

public class Task_1_Interview_problem {
    public static void main(String[] args) {
        System.out.println("Task 2 problem");
        try{
            System.out.println("Test 1\n" + solution("cdeo", new int[]{3, 2, 0, 1}));
            System.out.println("Test 2\n" + solution("cdeenetpi", new int[]{5,2,0,1,6,4,8,3,7}));
            System.out.println("Test 3\n" + solution("bytdag", new int[]{4,3,0,1,2,5}));
            System.out.println("Test 4\n" + solution("cdeo",null));
            System.out.println("Test 5\n" + solution(null, new int[]{3, 2, 0, 1}));
        }catch (Exception e){
            System.out.println("Exception" + e);
        }


    }

    public static String solution (String string, int[] A) throws  Exception {
        String final_message = "";
        int current_player =0;
        int next_player ;
        int max_length_message = A.length;
        if (max_length_message <= 0 || string == null || A == null ){
            final_message = null;
            System.out.println("Wrong input parameters " + " string: " + string + "A: " + A );
        }
        else{
            for (int i = 0 ; i< A.length ; i++){
                char temp_char;
                next_player = A[current_player];
                temp_char =string.charAt(current_player);
                final_message = final_message.concat(String.valueOf(temp_char));
//                System.out.println(temp_char);
                System.out.println("Final message : " + final_message + " at step " + i);
                if (next_player != 0){
                    current_player = next_player;
                }
                else{
                    break;
                }
            }
        }

        return final_message;
    }
}
