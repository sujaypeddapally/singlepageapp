class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways =0;
        for(int pens=0; pens*cost1<= total;pens++){
            int r = total-pens*cost1;
            r = total-pens*cost1;
            ways = ways+(r/cost2)+1;
        }
        return ways;
    }
}