class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int j=nums.length-1;
        int k=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res[k]=nums[i];
                k++;
            }
            else{
                res[j]=nums[i];
                j--;
            }
        }
        return res;
    }
}