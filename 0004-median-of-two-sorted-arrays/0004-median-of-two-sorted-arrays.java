class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;
        int leftEle = (m + n + 1) / 2;  // Total elements in the left part

        int low = 0, high = m;
        while (low <= high) {
            int n1P = low + (high - low) / 2;  // Partition in nums1
            int n2P = leftEle - n1P;           // Corresponding partition in nums2

            // Edge cases to handle when partitions go out of bounds
            int l1 = n1P == 0 ? Integer.MIN_VALUE : nums1[n1P - 1];
            int r1 = (n1P == m ? Integer.MAX_VALUE : nums1[n1P]);
            int l2 = (n2P == 0 ? Integer.MIN_VALUE : nums2[n2P - 1]);
            int r2 = (n2P == n ? Integer.MAX_VALUE : nums2[n2P]);

            // Check if we have found the correct partition
            if (l1 <= r2 && l2 <= r1) {
                // Odd number of elements
                if (((m + n) & 1) != 0)
                    return Math.max(l1, l2);
                // Even number of elements
                else
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }

            // Adjust search range based on comparisons
            if (l1 > r2)
                high = n1P - 1;
            else
                low = n1P + 1;
        }

        throw new IllegalArgumentException("Input arrays are not sorted or invalid.");
    }
}