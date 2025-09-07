class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=0;
        int rmax=0;
        int total=0;
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]>lmax){
                    lmax=height[i];
                }
                else if(lmax>height[i]){
                    total+=lmax-height[i];
                }
                i++;
            }
            else{
                if(height[j]>rmax){
                    rmax=height[j];
                }
                else if(rmax>height[j]){
                    total+=rmax-height[j];
                }
                j--;
            } 
        }
        return total;
    }
}