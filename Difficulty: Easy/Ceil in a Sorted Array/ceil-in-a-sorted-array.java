// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        int mid = 0;
        
        while(left <= right){
            mid = left + (right - left)/2;
            if(arr[mid] >= x){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
