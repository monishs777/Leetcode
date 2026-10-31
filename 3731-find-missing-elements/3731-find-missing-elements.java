class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr= new ArrayList<>();
        int n=nums.length;
        int j=nums[0];
        for(int i=0;i<nums.length;i++){
            while(j<nums[i]){
                arr.add(j);
                j++;
            }
            j++;
        }
        return arr;
    }
}