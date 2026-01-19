class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0){
            return result;
        }
        List<Integer> firstrow= new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(numRows==1){
            return result;
        }

        for(int i=1;i<numRows;i++){
            List<Integer> li=new ArrayList<>();
            List<Integer> a=result.get(i-1);
            for(int j=0;j<i;j++){
                int k=a.get(j);
                if(j-1>-1){
                    k+=a.get(j-1);
                }
                li.add(k);
            }
            li.add(1);
            result.add(li);
        }
        return result;
    }
}