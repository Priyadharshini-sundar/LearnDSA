class Solution {
    public int findKRotation(int[] arr) {
        int left = 0, right = arr.length - 1;
        int n = arr.length;

        while (left <= right) {

            if (arr[left] <= arr[right]) {
                return left;
            }

            int mid = left + (right - left) / 2;

            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            if (arr[left] <= arr[mid]) {
                left = mid + 1;
            }
     
            else {
                right = mid - 1;
            }
        }
        return 0;
    }
}