class Solution {

    public void mergeSort(int[] arr, int l, int r) {
        int[] temp = new int[arr.length];
        sort(arr, l, r, temp);
    }

    private void sort(int[] arr, int l, int r, int[] temp) {

        if (l < r) {

            int mid = l + (r - l) / 2;

            sort(arr, l, mid, temp);
            sort(arr, mid + 1, r, temp);

            merge(arr, l, mid, r, temp);
        }
    }

    private void merge(int[] arr, int l, int mid, int r, int[] temp) {

        int i = l;
        int j = mid + 1;
        int k = l;

        while (i <= mid && j <= r) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (int p = l; p <= r; p++) {
            arr[p] = temp[p];
        }
    }
}