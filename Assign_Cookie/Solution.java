package Assign_Cookie;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numberOfChildren = g.length;
        int numberOfCookies = s.length;
        int cookie = 0, answer = 0;
        for (int i = 0; i < numberOfChildren && cookie < numberOfCookies;) {
            if (s[cookie] >= g[i]) {
                i++;
                answer++;
            }
            cookie++;
        }
        return answer;

    }
}
