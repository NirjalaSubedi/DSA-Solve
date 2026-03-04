import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int [] arr3 =new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        int n=arr3.length;
        if(n%2!=0){
            return (double) arr3[n/2];
        }else{
            return (double) (arr3[n/2-1]+arr3[n/2])/2.0;
        }
    }
}