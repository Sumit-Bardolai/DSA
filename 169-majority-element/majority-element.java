// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         int k=n/2;
        
//         int count =1;
//         Arrays.sort(nums);
//        for(int i=1;i<n;i++){
//         if(nums[i]==nums[i-1]){
//             count++;
//         }
//         else{
//             count=1;
//         }
//         if(count>k){
//             return nums[i];
//         }
        
//        }
       
//             return nums[k];
        
//     }
// }
class Solution {
   public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2];
   }
}