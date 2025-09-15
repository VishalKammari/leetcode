class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        HashSet<Character> hm=new HashSet<>();
        for(char x:brokenLetters.toCharArray()){
            hm.add(x);
        }
        int k=0;
        for(String s:arr){
            if(!correct(s,hm)){
                k++;
            }
        }

        return k;

    }
    public static boolean correct(String s,HashSet<Character> hs){
        for(char x:hs){
            if(s.indexOf(x)!=-1){
                return true;
            }
        }
        return false;
    }  
}