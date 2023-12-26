class goodpairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) { // Fix: use < instead of <=
            for (int j = i + 1; j < nums.length; j++) { // Fix: start from i + 1 instead of 0
                if (nums[i] == nums[j] & i < j) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }
}
