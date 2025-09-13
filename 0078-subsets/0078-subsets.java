class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int subsets=1<<n;
        List<List<Integer>> sol=new ArrayList<>();

        for(int j=0;j<(1<<n);j++){
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((n&(1<<i))!=0){
                    li.add(nums[i]);
                }
            }
            sol.add(li);
        }
        return sol;
    }
}