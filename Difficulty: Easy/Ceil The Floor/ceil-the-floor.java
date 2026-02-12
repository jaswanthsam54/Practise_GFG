class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {

        int floor = -1;
        int ceil = -1;
        boolean floorFound = false;
        boolean ceilFound = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= x) {
                if (!floorFound || arr[i] > floor) {
                    floor = arr[i];
                    floorFound = true;
                }
            }

            if (arr[i] >= x) {
                if (!ceilFound || arr[i] < ceil) {
                    ceil = arr[i];
                    ceilFound = true;
                }
            }
        }

        return new int[]{floor, ceil};
    }
}
