package com.bbs;

public class Solution {

    public static boolean validParentheses(String parens) {

        int v = 0;
        int r = 0;

        char[] k = parens.toCharArray();

        for (char c : k) {

            if (c == ('(')) {
                r++;
            } else if (c == (')')) {
                v++;
            }

            if (v > r) {
                break;
            }
        }

        return v == r;
    }
}