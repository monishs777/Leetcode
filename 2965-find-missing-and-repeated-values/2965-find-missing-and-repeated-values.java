class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[] =new int[2];
        int arr1[]= new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr1[grid[i][j]]++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>1){
                arr[0]=i;
            }
            if(arr1[i]==0){
                arr[1]=i;
            }
        }
        return arr;
    }
}