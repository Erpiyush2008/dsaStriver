import java.util.*;

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        if (n < 4) return ans;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                long newTarget = (long) target - nums[i] - nums[j];

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[left] + nums[right];

                    if (sum == newTarget) {

                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicates
                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                    else if (sum < newTarget) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}


public class leetcode_4sum {

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Example 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;

        List<List<Integer>> result1 = obj.fourSum(nums1, target1);

        System.out.println("Example 1 Output:");
        for (List<Integer> list : result1) {
            System.out.println(list);
        }

        // Example 2
        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;

        List<List<Integer>> result2 = obj.fourSum(nums2, target2);

        System.out.println("\nExample 2 Output:");
        for (List<Integer> list : result2) {
            System.out.println(list);
        }
    }
}