package Longest_Common_Subsequence;

public class Solution {
    
        public int longestCommonSubsequence(String text1, String text2) {
            // int sum=0;
            // char a[]=new char[text1.length()];
            // char b[]=new char[text2.length()];
            // a=text1.toCharArray();
            // b=text2.toCharArray();
            // int al=a.length;
            // int bl=b.length;
            // Arrays.sort(a);
            // Arrays.sort(b);
            // if(al==0 || bl==0){
            // return 0;
            // }
            // else if(a.length>b.length){
            // for(int i=0;i<b.length;i++){
            // if(a[i]==b[i]){
            // sum++;
            // }
            // }
            // return sum;
            // }
            // else{
            // for(int i=0;i<b.length;i++){
            // if(a[i]==b[i]){
            // sum++;
            // }
            // }
            // return sum;

            // }

            int m = text1.length();
            int n = text2.length();
            int lcs[][] = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; ++j) {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1))
                        lcs[i][j] = 1 + lcs[i - 1][j - 1];
                    else
                        lcs[i][j] = Math.max(
                                lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
            return lcs[m][n];
        }
 }

