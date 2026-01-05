class Solution{
    public long maxMatrixSum(int[][] matrix){
        long sum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int val : row) {
                if (val < 0) negCount++;
                int abs = Math.abs(val);
                sum += abs;
                minAbs = Math.min(minAbs, abs);
            }
        }
        if (negCount % 2 == 1) {
            sum -= 2L * minAbs;
        }

        return sum;
    }
}
