class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int mind=0;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            int j=0;
            if(prev!=nums[i]){
                for(j=0;j<numsDivide.length;j++){
                    if(numsDivide[j]%nums[i]!=0){
                        break;
                    }
                }
            }
            if(j!=numsDivide.length){
                prev=nums[i];
                mind++;
            }
            if(j==numsDivide.length){
                return mind;
            }
        }
        return -1;
    }
}