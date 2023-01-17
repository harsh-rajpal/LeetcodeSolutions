package Min_Flips;

class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int flipCount = 0;
        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (oneCount == 0)
                    continue;
                flipCount++;
            } else
                oneCount++;
            if (oneCount < flipCount)
                flipCount = oneCount;
        }
        return flipCount;

    }
}

// int a=0,count1=0,b=0,count0=0;
// for(int i=0;i<s.length();i++){
// if(s.charAt(i)=='1'){
// a=i;
// break;
// }
// }
// for(int i=a;i<s.length();i++){
// if(s.charAt(i)=='0'){
// count1++;
// }
// }
// for(int i=0;i<s.length();i++){
// if(s.charAt(i)=='0'){
// b=i;
// break;
// }
// }
// for(int i=b;i<s.length();i++){
// if(s.charAt(i)=='1'){
// count0++;
// }
// }
// return Math.min(count1,count0);