package Intersection_two_arrays;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index] = nums1[i];
                    index++;
                    break;
                }
            }
        }
        int[] result2 = new int[index];
        for (int i = 0; i < index; i++) {
            result2[i] = result[i];
        }
        return result2;
    }
}
