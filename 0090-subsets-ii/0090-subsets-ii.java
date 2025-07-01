import java.util.*;

class Solution {
    public void Uniqueset(int start, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
           
            if (i > start && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            Uniqueset(i + 1, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  
        Uniqueset(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}
