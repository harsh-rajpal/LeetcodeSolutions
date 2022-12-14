import java.util.*;
import java.io.*;
class Solution{
    
    int Maximize(int arr[], int n)
    
    {
        if(n<Math.pow(10,7) && n>0){
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
            sum = (sum + (long)arr[i]*i) % 1000000007;
            }
        }
        return (int)sum;
        }
        else{
            return 0;
        }
    }   
}

