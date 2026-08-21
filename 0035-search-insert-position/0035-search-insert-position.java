class Solution {
    public int searchInsert(int[] a, int t) {
        int b= 0;
        int c= a.length - 1;
        while (b <= c) {
            int mid = (b + c) / 2;

            if (a[mid] == t) {
                return mid;
            }
            else if (a[mid] < t) {
                b = mid + 1;
            }
            else {
                c = mid - 1;
            }
        }

        return b;
    }
}