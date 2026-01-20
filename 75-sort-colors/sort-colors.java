class Solution {
    public void sortColors(int[] nums) {
        /*int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int t = nums[low]; nums[low] = nums[mid]; nums[mid] = t;
                low++; mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int t = nums[mid]; nums[mid] = nums[high]; nums[high] = t;
                high--;
            }
        }*/
        int temp ;
        for(int i = 0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
