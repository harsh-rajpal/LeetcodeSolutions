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
//Algorithm
// 1. Sort the array of children's greed factor and cookies' size.
// 2. Assign the cookie to the child with the least greed factor.
// 3. If the cookie's size is less than the child's greed factor, then move to the next child.
// 4. If the cookie's size is greater than or equal to the child's greed factor, then move to the next child and increment the number of satisfied children.
// 5. If the cookie's size is less than the child's greed factor, then move to the next cookie.
// 6. If the cookie's size is greater than or equal to the child's greed factor, then move to the next child and increment the number of satisfied children.
// 7. Repeat steps 4-6 until all the children are satisfied or all the cookies are used.
// 8. Return the number of satisfied children.

// Time Complexity: O(nlogn) where n is the number of children or the number of cookies.
// Space Complexity: O(1)
