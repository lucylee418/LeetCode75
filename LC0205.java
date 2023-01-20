import java.util.*;

public class LC0205 {
    public boolean isIsomorphic(String s, String t) {
        // Compare the length
        if (s.length() != t.length()){
            return false;
        }
        // Initialize
        HashMap<Character, Character> myMap = new HashMap<Character, Character>();
        // Go through each letter
        for (int i=0; i<s.length(); i++){
            char sLet = s.charAt(i);
            char tLet = t.charAt(i);
            // If sLet already exists in the key,
            if (myMap.keySet().contains(sLet)){
                // compare with the corresponding letter
                if (tLet != myMap.get(sLet)){
                    return false;
                }
            }
            // If it's not in the map.
            else {
                // and if tLet hasn't been added,
                if (! myMap.values().contains(tLet)){
                    myMap.put(sLet, tLet);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }


    public static void main (String[] args){
        LC0205 lc0205 = new LC0205();
        String s = "paper";
        String t = "title";
        System.out.println(lc0205.isIsomorphic(s,t));
    }

}