// package pw java;
import java.util.*;
public class Uniquecharacter {

     public static  int firstUniqChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Build the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // No non-repeating character found
        return -1;
    }
    public static void main(String[] args) {
        String str="aabb";
        int num=firstUniqChar(str);
        System.out.println(num);
        

    }
    
}
