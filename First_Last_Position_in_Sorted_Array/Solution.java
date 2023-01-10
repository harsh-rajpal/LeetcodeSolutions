package First_Last_Position_in_Sorted_Array;
// Given an array of integers nums sorted in non-decreasing order,find the starting and ending position of a given target value.

// If target is not found in the array,return[-1,-1].

// You must write an algorithm with O(log n)runtime complexity.

// Example 1:

// Input:nums=[5,7,7,8,8,10],target=8 Output:[3,4]Example 2:

// Input:nums=[5,7,7,8,8,10],target=6 Output:[-1,-1]Example 3:

// Input:nums=[],target=0 Output:[-1,-1]

// Constraints:

// 0<=nums.length<=105-109<=nums[i]<=109 nums is a non-decreasing array.-109<=target<=109

public class Solution {
    public ArrayList<Long> searchRange(long arr[],int n, int X){
        // code here
        ArrayList<Long> result = new ArrayList<>();
        int first = findFirst(arr,0,n-1,X);
        int last = findLast(arr,0,n-1,X);
        result.add((long)first);
        result.add((long)last);
        return result;

       
    }
    public int findFirst(long arr[],int low,int high,int X){
        if(high>=low){
            int mid = low + (high-low)/2;
            if((mid==0 || X>arr[mid-1]) && arr[mid]==X){
                return mid;
            }
            else if(X>arr[mid]){
                return findFirst(arr,mid+1,high,X);
            }
            else{
                return findFirst(arr,low,mid-1,X);
            }
        }
        return -1;
    }
    public int findLast(long arr[],int low,int high,int X){
        if(high>=low){
            int mid = low + (high-low)/2;
            if((mid==arr.length-1 || X<arr[mid+1]) && arr[mid]==X){
                return mid;
            }
            else if(X<arr[mid]){
                return findLast(arr,low,mid-1,X);
            }
            else{
                return findLast(arr,mid+1,high,X);
            }
        }
        return -1;
    }
    
}

//Algorithm
// 1. Find the target value in the array.
// 2. If the target value is found,then find the first and last position of the target value.
// 3. If the target value is not found,return [-1,-1].
// 4. Return the result.

//Time Complexity: O(log n)
//Space Complexity: O(1)
