import java.util.ArrayList;
import java.util.Arrays;

public class SumOfTwoNum {
    public static void main(String[] args) {
        int[] arr = {3,2, 3};
        System.out.println(Arrays.toString(twoSum(new int[]{1, 6, 3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum_2(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int num_1 = 0;
        int num_2 = 0;
        ArrayList list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == temp) {
                    if (i == j) {
                        continue;
                    }
                    num_1 = j;
                    num_2 = i;
                    break;
                }
            }
        }
        return new int[]{num_1, num_2};
    }

    public static int[] twoSum_2(int[] nums, int target) {
        int[] cp_nums = new int[nums.length];
        System.arraycopy(nums, 0, cp_nums, 0, nums.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0, j = nums.length - 1; i < nums.length; ) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i += 1;
            } else if (sum > target) {
                j -= 1;
            } else {
                int[] arr = {-1, -1};
                for (int k = 0; k < cp_nums.length; k++) {
                   if (cp_nums[k] == nums[i]) {
                       if (arr[0] != -1) {
                           arr[1] = k;
                           return arr;
                       } else {
                           arr[0] = k;
                       }
                   }
                }
            }
        }
        return null;
    }
}
