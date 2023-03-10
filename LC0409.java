/*Intuition
A palindrome consists of letters with equal partners, 
plus possibly a unique center (without a partner). 
The letter i from the left has its partner i from the right. 
For example in 'abcba', 'aa' and 'bb' are partners, and 'c' is a unique center.

Imagine we built our palindrome. 
It consists of as many partnered letters as possible, plus a unique center if possible. 
This motivates a greedy approach.

Algorithm
For each letter, say it occurs v times. 
We know we have v // 2 * 2 letters that can be partnered for sure. 
For example, if we have 'aaaaa', then we could have 'aaaa' partnered, 
which is 5 // 2 * 2 = 4 letters partnered.

At the end, if there was any v % 2 == 1, then that letter could have been a unique center. 
Otherwise, every letter was partnered. 
To perform this check, we will check for v % 2 == 1 and ans % 2 == 0, 
the latter meaning we haven't yet added a unique center to the answer.
 */

public class LC0409 {
    public int longestPalindrome(String s) {
        // Initialize
        int[] count = new int[128];
        // Store counts
        for (char c: s.toCharArray())
            count[c]++;

        // current possible longest
        int ans = 0;
        // count of current letter
        for (int v: count) {
            // If v is odd, then v-1 of them can be partnered for sure
            // If v is even, then v of them can be partnered for sure
            ans += v / 2 * 2;
            // if currutn length is even (no unique center added), and v is odd,
            if (ans % 2 == 0 && v % 2 == 1)
                // we can add one unique center
                ans++;
        }
        return ans;
    }


    public static void main (String[] args){
        LC0409 lc0409 = new LC0409();
        String l1 = "abccccdd";
        int maxLength = lc0409.longestPalindrome(l1);

        // print values
        System.out.println(maxLength);
    }
}
