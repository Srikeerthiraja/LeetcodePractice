class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=leftside(nums,target);
        int right=rightside(nums,target);
        int[] arr=new int[2];
        arr[0]=left;
        arr[1]=right;
        return arr;
    }

        public int leftside(int[] nums, int target){
            int start=0, end=nums.length-1;
            int ans=-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]>target){
                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;

                }
                else{
                    ans=mid;
                    end=mid-1;
                }
                


            }
            return ans;
            
        }
        public int rightside(int[] nums, int target){
            int start=0, end=nums.length-1;
            int ans=-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]>target){
                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;

                }
                else{
                    ans=mid;
                    start=mid+1;
                }
             }
        return ans;

        
    }
}