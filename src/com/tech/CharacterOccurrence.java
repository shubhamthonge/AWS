package com.tech;

import java.util.HashMap;


public class CharacterOccurrence {
    public static void main(String[] args) {
        String s = "sonam";
        countOccurrences(s);
    }

    public static void countOccurrences(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("Character occurrences:");
        for (char key : map.keySet()) {
            System.out.println("'" + key + "': " + map.get(key));
        }
    }
}
