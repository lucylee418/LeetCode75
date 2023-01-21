import java.util.*;

public class LC0205 {
    // Mine
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


    // // Official Solution
    // public boolean isIsomorphic(String s, String t) {
        
    //             int[] mappingDictStoT = new int[256];
    //             Arrays.fill(mappingDictStoT, -1);
                
    //             int[] mappingDictTtoS = new int[256];
    //             Arrays.fill(mappingDictTtoS, -1);
                
    //             for (int i = 0; i < s.length(); ++i) {
    //                 char c1 = s.charAt(i);
    //                 char c2 = t.charAt(i);
    //                 // System.out.println("c1: "+c1+", c2: "+c2);
                    
    //                 // Case 1: No mapping exists in either of the dictionaries
    //                 if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
    //                     mappingDictStoT[c1] = c2;
    //                     mappingDictTtoS[c2] = c1;
    //                 }
                    
    //                 // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
    //                 // it doesn't match in either of the dictionaries or both 
    //                 else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
    //                     // System.out.println("c1 el: "+ mappingDictStoT[c1]+ ", c2 el: "+mappingDictStoT[c2]);
    //                     return false;
    //                 }
    //             }
    //             return true;
    //         }



    public static void main (String[] args){
        LC0205 lc0205 = new LC0205();
        String s = "paper";
        String t = "title";
        System.out.println(lc0205.isIsomorphic(s,t));
    }

}