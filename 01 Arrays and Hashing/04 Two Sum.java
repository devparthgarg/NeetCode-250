// https://leetcode.com/problems/two-sum/description/

// time: O(n*n)
// space: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}

// time: O(n)
// space: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}