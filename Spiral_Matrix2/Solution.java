package Spiral_Matrix2;
// Given a positive integer n,generate an n x n matrix filled with elements from 1 to n2 in spiral order.

// Example 1:

// Input:n=3 Output:[[1,2,3],[8,9,4],[7,6,5]]Example 2:

// Input:n=1 Output:[[1]]

// Constraints:

// 1<=n<=20

public class Solution {
    public int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int num = 1;
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                matrix[top][i] = num++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num++;
            }
            right--;
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = num++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = num++;
            }
            left++;
        }
    }
}

//Algorithm
// 1. Create a matrix of size n x n.
// 2. Initialize left = 0, right = n - 1, top = 0, bottom = n - 1, num = 1.
// 3. Iterate while left <= right and top <= bottom.
//     a) Iterate from left to right and fill the top row with num.
//     b) Increment top.
//     c) Iterate from top to bottom and fill the right column with num.
//     d) Decrement right.
//     e) Iterate from right to left and fill the bottom row with num.
//     f) Decrement bottom.
//     g) Iterate from bottom to top and fill the left column with num.
//     h) Increment left.
// 4. Return matrix.

//Time Complexity: O(n^2)
//Space Complexity: O(n^2)
