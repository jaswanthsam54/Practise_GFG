class Solution {
	public int findFloor(int[] arr, int x) {
		// code here
		int lo = 0;
		int hi = arr.length;
		while (lo < hi) {
			int mid = lo + (hi - lo)/2;
			if (arr[mid] > x) {
				hi = mid;
			}
			else {
				lo = mid + 1 ;
			}
		}
		int result = lo - 1;
		return result;
	}
}
