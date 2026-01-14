class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int result=0;
        int i=0;
        while(i<=n){
            result=result^i;
            if(i<n){
                result=result^nums[i];
            }
            i++;
        }
        return result;
    }
}