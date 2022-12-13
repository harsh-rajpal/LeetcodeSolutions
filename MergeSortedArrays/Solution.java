package MergeSortedArrays;
import java.util.*;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
       
            for(int i=0;i<m;i++){
                arr[i]=nums1[i];
            }
            int k=m;
            for(int i=0;i<n;i++){
                arr[k]=nums2[i];
                k++;
            }
            Arrays.sort(arr);
            
    }
}
