class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i : nums)
    {
        pq.add(i);
    
    }
    int ans[] =new int[nums.length];
    for(int i=0;i<ans.length; i++){
        ans[i]= pq.peek();
        pq.poll();
    }
    return ans;
    }
}