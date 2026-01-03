class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int i=0;
        for(int n:nums){
              if(n!= val){
                nums[i]= n;
                k++;
                i++;
                }}
        System.out.print(nums);    
        return k;
        
    }
}