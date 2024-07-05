import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 9, 10, 7, 11, 15};
        int target = 10;
        Arrays.sort(nums);
        int index = binarySearch(nums, target);
        if (index != -1) {
            System.out.println("目标值的索引为：" + index);
        }else {
            System.out.println("数组中没有目标值");
        }
    }

    public static int binarySearch(int[] nums, int targer) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        //
        while (left <= right) {
            mid = left + (right - left) / 2;
        }
        if (nums[mid] == targer) {
            return mid;
        } else if (nums[mid] < targer) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return -1;
    }

}
