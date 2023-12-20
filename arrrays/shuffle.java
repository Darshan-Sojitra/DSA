public class shuffle {
    public static int[] shufffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int odd = 0;
        int even = 1;
        for (int i = 0; i < n; i++) {

            result[odd] = nums[i];
            result[even] = nums[n + i];
            odd += 2;
            even += 2;

        }

        return result;

    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 5, 6, 7, 8 };
        int length = numbers.length / 2;
        int[] result = shufffle(numbers, length);
        System.out.println(result);

    }
}