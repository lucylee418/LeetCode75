// Mine
class LC0392 {
    public boolean isSubsequence(String s, String t) {
        // if s is empty, t must be empty
        if(s.length()==0){
            return t.length()>=0;
            }
        // if both are not empty, t should be longer than s
        else if (t.length() < s.length()){
            System.out.println("first if break");
            return false;
        }
        // if none of them applies,
        int last = 0;
        int startIdx = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=startIdx; j<t.length(); j++){
                // if they match,
                if(s.charAt(i) == t.charAt(j)){
                    // we consider letters in t only after this point
                    startIdx = j+1;
                    // if it was last s letter, we just return true
                    if (i==s.length()-1){
                        return true;
                    }
                    break;
                }
                // if it was the last letter in t,
                else if(j == t.length()-1){
                    // we just return false
                    return false;
                }
                // if they don't match we just update last index
                last = i;
            }            
        }
        // check if we looked through all s letters
        return last == s.length()-1;
    }

    
    public static void main (String[] args){
        LC0392 lc0392 = new LC0392();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(lc0392.isSubsequence(s,t));
    }
}
