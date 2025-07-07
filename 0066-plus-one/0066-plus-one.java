class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> ans = new Stack<>();
        int c = 1; 

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + c;
            ans.push(sum % 10);
            c = sum / 10;
        }

        if (c != 0) {
            ans.push(c);
        }

        int[] answer = new int[ans.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.pop(); 
        }

        return answer;
    }
}