class Solution2 {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] soln = new int[l];
        for (int i = 0; i < nums.length; i++) {
            soln[i] = nums[i] * nums[i];
        }
        Arrays.sort(soln);
        return soln;
    }
}