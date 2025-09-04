class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> li=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[i]+nums[right];
                if(sum==0){
                    li.add(Arrays.asList(nums[left],nums[i],nums[right]));
                    left++;
                    right--;
                }
                else if (sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        List<List<Integer>> result=new ArrayList(li);
        return result; 
    }
}