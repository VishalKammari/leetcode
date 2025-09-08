class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftproduct=1;
        int rightproduct=1;
        int ans=nums[0];
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){  
              leftproduct=1;
              ans=Math.max(ans,0);
              continue;
            } 

            leftproduct*=nums[i];
            ans=Math.max(ans,leftproduct);
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i]==0){
                ans=Math.max(ans,0);
                rightproduct=1;
                continue;
            }

            rightproduct*=nums[i];
            ans=Math.max(ans,rightproduct);
        }
        return ans;
    }
}