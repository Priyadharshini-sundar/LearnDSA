class Solution {
    public int peakElement(int[] arr) {
        int l = 0, r = arr.length - 1, mid = 0;
        while(l<r){
            mid = l +(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}