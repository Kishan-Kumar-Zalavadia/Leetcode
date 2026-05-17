class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        int[] v = new int[n];
        return recursion(arr, v, start);
    }
    public boolean recursion(int[] arr, int[] v, int i) {
        if (arr[i] == 0) {
            return true;
        }
        if (v[i] == 1) {
            return false;
        }
        v[i] = 1;
        int front = i + arr[i];
        int back = i - arr[i];
        boolean frontRecurssion = false;
        boolean backRecurssion = false;

        if (front < arr.length) {
            frontRecurssion = recursion(arr, v, front);
        }
        if (back >= 0) {
            backRecurssion = recursion(arr, v, back);
        }
        return frontRecurssion || backRecurssion;
    }
}