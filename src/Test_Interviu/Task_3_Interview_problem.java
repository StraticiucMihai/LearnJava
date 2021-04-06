package Test_Interviu;

import java.util.HashMap;
import java.util.Map;

public class Task_3_Interview_problem {
    public static void main(String[] args) {
        System.out.println("Task 3");
        String retString;
        String str1= "aaaabbcccccfff";
        String str2 = "abcdefddertregvsfbsdfbavbaerwecbiewHBVISDHBVSKjVBSKDJVBISDBVISDBVSDHISVBUSDHVB";
        String str3 ="";
        String str4 = null;
        retString =returnString(str1);
        System.out.println(retString);
        retString =returnString(str2);
        System.out.println(retString);
        retString =returnString(str3);
        System.out.println(retString);
        retString =returnString(str4);
        System.out.println(retString);


    }



    public static String returnString(String str){
        try{
            if (str.isEmpty() || str == null) return "Empty string is passed" + str;
        }catch (Exception e){
            return  e.toString();
        }

        System.out.println("Input string : " + str);
        String retstr = "";
        char tempchar;
        String tempstring;
        Map<String, Integer> mapCharacters = new HashMap<String, Integer>();
        for(int i =0 ; i< str.length(); i++){
            tempchar = str.charAt(i);
//            System.out.println("Char at index ["+i+"] = "+ tempchar);
            tempstring =  Character.toString(tempchar);
            if(mapCharacters.containsKey(tempstring)){
                Integer tempint = mapCharacters.get(tempstring);
                tempint = tempint+1;
                mapCharacters.put(tempstring, tempint);

            }else {
                mapCharacters.put(tempstring, 1);
            }
        }
        System.out.println("Map: " + mapCharacters);

        for (String s : mapCharacters.keySet()){
             retstr = retstr.concat(s);
             retstr = retstr.concat(mapCharacters.get(s).toString());
        }

        return retstr;
    }
}
