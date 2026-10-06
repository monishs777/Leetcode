class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr=new int[2];
        int b=0;
        for(int i=0;i<nums.length;i++){
            int a=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a++;
                }
            }
            if(a>1){
                arr[b]=nums[i];
                b++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}