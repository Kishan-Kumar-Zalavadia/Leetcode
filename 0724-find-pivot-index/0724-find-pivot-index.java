class Solution {
    public int pivotIndex(int[] arr) {
        int totalSum = 0;
		for(int i=0;i<arr.length;i++){
			totalSum += arr[i];
		}
		int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];  // Deduct the current element from total sum
            if (leftSum == totalSum) {
                return i; // Found the pivot element
            }
            leftSum += arr[i];
        }
		return -1;
    }
}