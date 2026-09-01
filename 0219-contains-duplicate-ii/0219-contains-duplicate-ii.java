class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> a= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                a.remove(nums[i-k-1]);
            }
            if(a.contains(nums[i])){
                return true;
            }
            a.add(nums[i]);
        }
        return false;
    }
}