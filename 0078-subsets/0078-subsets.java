class Solution {

    public static  List<List<Integer>> function(int[] arr,int n,List<List<Integer>> sol,List<Integer> li,int i){

        if(i>=n){
            sol.add(new ArrayList(li));
            return sol;
        }
        li.add(arr[i]);
        function(arr,n,sol,li,i+1);
        li.remove(li.size()-1);
        function(arr,n,sol,li,i+1);

        return sol;
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;

        List<List<Integer>> res=new ArrayList<>();
        function(nums,n,res,new ArrayList<>(),0);
        
        return res;
    }
}