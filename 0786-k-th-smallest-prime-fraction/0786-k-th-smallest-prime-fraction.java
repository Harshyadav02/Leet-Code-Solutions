class Solution {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        int n = A.length;
        double left = 0D, right = 1D;
        while(left < right){
            double mid = left + (right - left) / 2;
            double max_f = 0D;
            int total = 0;
            int p = 0, q = 0;
            for(int i = 0, j = 1; i < n - 1; i++){
                while(j < n && A[i] > mid * A[j]) ++j;
                if(n == j) break;
                total += (n - j);
                double cur = A[i] * 1D / A[j];
                if(cur > max_f){
                    p = i;
                    q = j;
                    max_f = cur;
                }
            }
            if(total == K) return new int[]{A[p], A[q]};
            else if(total > K) right = mid;
            else left = mid;
        }
        return new int[]{};
    }
}