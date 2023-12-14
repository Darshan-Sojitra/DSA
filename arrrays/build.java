
package arrrays;

import java.util.Arrays;

public class build {

    public static int[] buildArray(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 6, 7 };
        int[] result = buildArray(nums);

        // Use Arrays.toString to print the elements of the array
        System.out.println(Arrays.toString(result));
    }
}
