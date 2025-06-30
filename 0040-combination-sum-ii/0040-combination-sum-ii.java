class Solution {
    void csum(int index, int[] nums, int target, List<Integer> curr, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0 || index == nums.length) return;

        for (int i = index; i < nums.length; i++) {
            
            if (i > index && nums[i] == nums[i - 1]) continue;

            curr.add(nums[i]);
            csum(i + 1, nums, target - nums[i], curr, ans);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        csum(0, candidates, target, curr, ans);
        return ans;
    }
}