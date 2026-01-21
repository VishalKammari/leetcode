class Solution {
    public static void reverse(int[]nums,int p1,int p2){
        while(p1<=p2){
            int t=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=t;
            p1++;
            p2--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i<=-1){
            reverse(nums,0,n-1);
            return;
        }
        int j=n-1;
        while(j>=0 && nums[j]<=nums[i] ){
            j--;
        }

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
        //reverse
        
        reverse(nums,i+1,n-1);
    }
}