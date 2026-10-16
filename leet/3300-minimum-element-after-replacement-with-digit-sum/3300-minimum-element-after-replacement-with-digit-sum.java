class Solution {
    public int minElement(int[] nums) {
        int a=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int b=0;
            while(nums[i]>0){
                b+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            a=Math.min(a,b);
        }
        return a;
    }
}