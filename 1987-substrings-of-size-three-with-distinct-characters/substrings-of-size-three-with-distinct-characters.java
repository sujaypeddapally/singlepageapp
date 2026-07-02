class Solution {
    public int countGoodSubstrings(String s) {
        String s1 = new String();
        int a =3;
        int count=0;
        for(int i=0;i<=s.length()-a;i++){
             if (s.charAt(i) != s.charAt(i + 1) &&
                s.charAt(i + 1) != s.charAt(i + 2) &&
                s.charAt(i) != s.charAt(i + 2)) {
                count ++;
            }
        }
        return count;
        
    }
}