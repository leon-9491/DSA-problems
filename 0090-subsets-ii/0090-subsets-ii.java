class Solution {
    void powerset(int index,int[] nums, List<Integer> current, List<List<Integer>> ans)
    {
         ans.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++)
        {
        if(i>index && nums[i]==nums[i-1])
         {
            continue;
        }
        current.add(nums[i]);

        powerset(i+1, nums, current, ans);

        current.remove(current.size()-1);
       
    }

    }
     public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
            Arrays.sort(nums);
        powerset(0, nums, current, result);
        return result;
    }
}