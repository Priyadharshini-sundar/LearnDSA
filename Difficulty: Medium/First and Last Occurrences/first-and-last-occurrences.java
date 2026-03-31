import java.util.*;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        
        return result;
    }

    private int firstOccurrence(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                ans = mid;
                right = mid - 1; 
            } 
            else if (arr[mid] < x) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private int lastOccurrence(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                ans = mid;
                left = mid + 1; 
            } 
            else if (arr[mid] < x) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}