class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0; 
        int j=0;
        int k=0;
        int[] arr3 = new int[n1+n2];
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i<n1){
            arr3[k++] = arr1[i++];
        }
         while(j<n2){
            arr3[k++] = arr2[j++];
        }
        int arrlen = arr3.length;
        int mid = arrlen/2;
        double median = -1;
        if(arrlen % 2 != 0){
            median = arr3[mid];
        }else{
            median = (arr3[mid-1] + arr3[mid])/2.0;
        }
        return median;
    }
}
