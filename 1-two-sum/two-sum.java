class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
      
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   ans[0]=i;
                   ans[1]=j;
                }
            }
        }
       return ans;
    }
}
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] ans=new int[2];
        
        int left=0;
        int right=n-1;
     
        while(left<right){
               int sum=nums[left]+nums[right];
            if(sum==target){
                ans[0]=left;
                ans[1]=right;
            }
            else if(sum<target){
                left++;

            }
            else{
                right--;
            }
        }
        return ans;
    }
}*/