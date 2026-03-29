class Solution {
    public int searchInsertK(int[] arr, int k) {
        
        int l = 0, h = arr.length - 1;
        
        while(l <= h){
            
            int mid = l + (h - l) / 2;
            
            if(arr[mid] == k){
                return mid; // found
            }
            else if(k < arr[mid]){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        
        return l; // insert position
    }
}