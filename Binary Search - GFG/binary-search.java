//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    int binarysearch(int nums[], int n, int target) {
        int low = 0;
		int high = n - 1;

		while (low <= high) {
			// Finding the mid using floor division
			int mid = low + ((high - low) / 2);

			// Target value is present at the middle of the array
			if (nums[mid] == target) {
				return mid;
			}

			// Target value is present in the low subarray
			else if (target < nums[mid]) {
				high = mid - 1;
			}

			
			else if (target > nums[mid]) {
				low = mid + 1;
			}
		}

		
		return -1;
    }
}