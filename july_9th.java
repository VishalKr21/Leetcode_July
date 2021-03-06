class Solution {
    public int maxResult(int[] nums, int k) {
     
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        int max = nums[0];
        pq.add(new int[]{0,nums[0]});
        
        for(int i=1;i<nums.length;i++)
        {
            while(i-pq.peek()[0]>k)
                 pq.poll();
            int a[] = pq.peek();
            max = nums[i]+a[1];
            pq.offer(new int[]{i,max});
        }
        return max;
    }
} 