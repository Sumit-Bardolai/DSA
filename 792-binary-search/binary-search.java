// class Solution {
//     public int search(int[] nums, int target) {
//         int n= nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]==target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int j = n - 1;
        int i = 0;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}