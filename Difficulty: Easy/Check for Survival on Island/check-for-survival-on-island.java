class Solution {
    public int minimumDays(int S, int N, int M) {
        if (M > N) {
            return -1;
        }
        if (S >= 7 && (6 * N < 7 * M)) {
            return -1;
        }
        int totalFoodRequired = S * M;
        int daysToBuy = (totalFoodRequired + N - 1) / N;
        return daysToBuy;
    }
}