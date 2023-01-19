public class LC0724 {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        // Get totalSum
        for (int n: nums) totalSum += n;
        for (int i=0; i<nums.length; i++){
            // Get rightSum
            rightSum = totalSum - nums[i] - leftSum;
            // Compare
            if (leftSum == rightSum){
                pivot = i;
                break;
            }
            // Update leftsum
            leftSum = leftSum + nums[i];
        }
        return pivot;
    }

    public static void main (String[] args){
        LC0724 lc0724 = new LC0724();
        int[] myArray = {1,7,3,6,5,6};
        int myPivot = lc0724.pivotIndex(myArray);
        System.out.println(myPivot);
    }
}

