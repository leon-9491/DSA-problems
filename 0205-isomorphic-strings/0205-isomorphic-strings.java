class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] m = new int[256];
        int[] m1 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int cs = s.charAt(i);
            int ct = t.charAt(i);

            if (m[cs] != m1[ct]) {
                return false;
            }

            
            m[cs] = i + 1;
            m1[ct] = i + 1;
        }

        return true;
    }
}