class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long box=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                box++;
                count += box;
            }
            else{
                box=0;
            }

        }
        return (long)count;
    }
}