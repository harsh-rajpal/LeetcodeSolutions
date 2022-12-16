package Valid_Parenthesis;

import java.util.*;
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    st.push(c);
                    break;
                case '{':
                    st.push(c);
                    break;
                case '[':
                    st.push(c);
                    break;
                case ')':
                    if (st.empty() || st.peek() != '(')
                        return false;
                    else
                        st.pop();
                    break;
                case '}':
                    if (st.empty() || st.peek() != '{')
                        return false;
                    else
                        st.pop();
                    break;
                case ']':
                    if (st.empty() || st.peek() != '[')
                        return false;
                    else
                        st.pop();
                    break;
                default:
                    ;
            }
        }
        return st.isEmpty();

    }

}

