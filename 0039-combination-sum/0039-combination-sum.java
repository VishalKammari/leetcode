class Solution {


    public static List<List<Integer>> function(int [] arr,int target,int n, int i,List<Integer> li,List<List<Integer>> result){
       
            if(target==0){
            
            result.add(new ArrayList(li));
            return result;
            }
        


        if(target<0 || i>=n){
            return result;
        }

        li.add(arr[i]);
        function(arr,target-arr[i],n,i,li,result);
        li.remove(li.size()-1);
        // while(i+1<n && arr[i]==arr[i+1]){
        //     i++;
        // }

        

        function(arr,target,n,i+1,li,result);

        return result;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        Arrays.sort(candidates);

        List<List<Integer>> result=new ArrayList<>();
        function(candidates,target,n,0,new ArrayList<>(),result);
        return result;
    }
}