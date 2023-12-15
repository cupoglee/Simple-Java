class Solution2 {
    public int findNumbers(int[] nums) {
        int l = nums.length;
        String k = "";
        int m = 0;
        int count = 0;
        for (int i = 0; i < l; i++) {
            Integer r = new Integer(nums[i]);
            k = r.toString();
            m = k.length();

            if (m % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}