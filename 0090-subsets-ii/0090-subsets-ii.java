class Solution {

    public static List<List<Integer>> subsets(int n,int[] nums,List<Integer> li,List<List<Integer>> result,int i){

        if(i>=n){
            result.add(new ArrayList(li));
            return result;
        }

        li.add(nums[i]);

        subsets(n,nums,li,result,i+1);
        li.remove(li.size()-1);

        while(i+1<n && nums[i]==nums[i+1]){
            i++;
        }

        subsets(n,nums,li,result,i+1);

        return result;
    } 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        subsets(n,nums,new ArrayList<>(),result,0);
        return result;
    }
}