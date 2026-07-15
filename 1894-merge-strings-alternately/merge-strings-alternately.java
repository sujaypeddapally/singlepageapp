class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String a = "";
        while(n>0 && m>0){
            a = a + word1.charAt(word1.length()-n);
            a = a + word2.charAt(word2.length()-m);
            n--;
            m--;
        }
        while(n>0){
            a = a+ word1.charAt(word1.length()-n);
            n--;
        }
        while(m>0){
            a = a+ word2.charAt(word2.length()-m);
            m--;
        }
        return a;
    }
}