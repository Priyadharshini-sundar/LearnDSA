class Solution {
    public int findFloor(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int ans = -1;
        
        while (left <= right){
            mid = left + (right - left)/2;
            
            if(arr[mid] <= x){
                left = mid + 1;
                ans = mid;
            }
            
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
