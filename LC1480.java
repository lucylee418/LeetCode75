import java.util.Arrays;

public class LC1480 {

    public int[] runningSum(int[] nums) {
        int[] mySum = new int[nums.length];
        int currSum = 0;
        for (int i=0; i<nums.length; i++){
            currSum += nums[i];
            mySum[i] = currSum;
        }
        return mySum;
    }


    public static void main (String[] args){
        LC1480 lc1480 = new LC1480();
        int[] myArray = {1,2,3,4};
        int[] mySum = lc1480.runningSum(myArray);
        String myStringSum = Arrays.toString(mySum);
        System.out.println(mySum);
        System.out.println(myStringSum);
    }

}