class Solution {
    public int numIdenticalPairs(int[] nums) {
        int val=0;
        int [] count=new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]=count[nums[i]]+1;
        }
        for(int i=0;i<count.length;i++){
            int n=count[i];
            val=val+(n*(n-1)/2);
        }
        return val;
    }
}