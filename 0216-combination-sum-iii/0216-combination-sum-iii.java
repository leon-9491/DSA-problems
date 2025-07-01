class Solution {
    public void called(int index, int k, int n, List<Integer> current, List<List<Integer>> result) {
        
        if (k == 0 && n == 0)
        {
            result.add(new ArrayList<>(current));
            return;
        }

  
        if (k == 0 || n < 0) 
        {
            return;
        }
        
        for (int i = index; i <= 9; i++) {
            current.add(i);  
            called(i + 1, k - 1, n - i, current, result); 
            current.remove(current.size() - 1);  
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        called(1, k, n, new ArrayList<>(), result);
        return result;
    }
}