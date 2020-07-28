package JavaCollections.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
//        java.util.Map<String,String> languages = new HashMap<>();
        languages.put("Java", "Main language that I learn ");
        languages.put("Python","Interpretive language, object-oriented ");
        languages.put("C++","Low level language good for interaction with hardware part");
        languages.put("C","Legend never die ");

        System.out.println(languages.get("Java"));
        System.out.println(languages.size());
        System.out.println("========================================");
        // Extract all elements from the MAP
        for (String key : languages.keySet()){
            System.out.println(key + " : "+ languages.get(key));
        }
        languages.remove("C");
        String ret = languages.replace("C++", "Good language but i love JAVA more");
        System.out.println("Ret = " + ret);

        System.out.println("========================================");
        for (String key : languages.keySet()){
            System.out.println(key + " : "+ languages.get(key));
        }

    }
}
