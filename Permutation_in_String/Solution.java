package Permutation_in_String;

public class Solution {
    // public List<String> ls= new ArrayList<>();
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2)
            return false;
        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count))
            return true;
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count))
                return true;
        }
        return false;
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
    // int n=s1.length();
    // List<String> ab= new ArrayList<>();
    // backtrack(s1,0,n-1);
    // ab=ls;
    // for(int i=0;i<ab.size();i++){
    // if(s2.contains(ab.get(i))){
    // return true;
    // }
    // }
    // return false;

    // }
    // public String swap(String a, int i, int j) {
    // char temp;
    // char[] charArray = a.toCharArray();
    // temp = charArray[i];
    // charArray[i] = charArray[j];
    // charArray[j] = temp;
    // return String.valueOf(charArray);
    // }
    // public void backtrack(String s, int idx, int N) {

    // if (idx == N)
    // ls.add(s);
    // else {
    // for (int i = idx; i <= N; i++) {
    // s = swap(s, idx, i);
    // backtrack(s, idx + 1, N);
    // s = swap(s, idx, i);
    // }
    // }

    // }
    // solve() {
    // String s = ”ABC”;
    // int N = s.length;
    // backtrack(s, 0, N - 1);
    // }
}
