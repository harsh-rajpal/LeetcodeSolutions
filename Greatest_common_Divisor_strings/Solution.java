package Greatest_common_Divisor_strings;
public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}


//Algorithm
// 1. If str1+str2 is not equal to str2+str1, then return "".
// 2. Else, return str1.substring(0, gcd(str1.length(), str2.length())).
// 3. gcd(a, b) is the greatest common divisor of a and b.
// 4. gcd(a, b) = gcd(b, a % b) if b is not 0.
// 5. gcd(a, 0) = a.
