class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}