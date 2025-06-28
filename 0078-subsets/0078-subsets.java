class Solution {
    void powerset(int index,int[] nums, List<Integer> current, List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(current));
             return;
        }
        powerset(index+1, nums, current, ans);

        current.add(nums[index]);

        powerset(index+1, nums, current, ans);

        current.remove(current.size()-1);
       
    }


     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        powerset(0, nums, current, result);
        return result;
    }
}