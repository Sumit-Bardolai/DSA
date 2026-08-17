class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []brr=new int[2*n];
        for (int i=0;i<n;i++){
            brr[i]=nums[i];
            brr[i+n]=nums[i];
        }
        return brr;
        
    }
}