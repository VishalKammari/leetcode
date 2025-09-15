class Solution {
    public static List<List<String>> function(int index,String s,List<String> li,List<List<String>> result){

        if(index>=s.length()){
            result.add(new ArrayList(li));
            return result;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                li.add(s.substring(index,i+1));
                function(i+1,s,li,result);
                li.remove(li.size()-1);
            }
        }
        return result;
    }

    public static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        function(0,s,new ArrayList(),result);
        return result;
    }
}