class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        double powerCall = myPow(x, n / 2);
        double halfPower = powerCall * powerCall;

        if (n % 2 != 0) {
            if (n > 0) {
                halfPower *= x;
            } else {
                halfPower /= x;
            }
        }

        return halfPower;
    }
}

