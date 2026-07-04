class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(String a : sentences){
            int word=1;
            for(char ch : a.toCharArray()){
                if(ch == ' '){
                    word++;
                }
            }
            max = Math.max(max, word);
        }
        return max;
    }
}