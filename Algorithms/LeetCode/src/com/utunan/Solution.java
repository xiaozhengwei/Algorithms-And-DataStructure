package com.utunan;

public class Solution {




    /**
     * 反转字符串
     * 使用双指针
     * @param s :待反转字符串
     */
    public void reverseString(char[] s) {

        int length = s.length;

        if (length <= 1) {
            return;
        }

        for (int start = 0,end = s.length - 1; start < end; start++, end--) {
            char c = s[end];
            s[end] = s[start];
            s[start] = c;
        }

    }

}
