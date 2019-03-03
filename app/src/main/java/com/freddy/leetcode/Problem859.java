package com.freddy.leetcode;

/**
 * 859. Buddy Strings

 Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.



 Example 1:

 Input: A = "ab", B = "ba"
 Output: true
 Example 2:

 Input: A = "ab", B = "ab"
 Output: false
 Example 3:

 Input: A = "aa", B = "aa"
 Output: true
 Example 4:

 Input: A = "aaaaaaabc", B = "aaaaaaacb"
 Output: true
 Example 5:

 Input: A = "", B = "aa"
 Output: false


 Note:

 0 <= A.length <= 20000
 0 <= B.length <= 20000
 A and B consist only of lowercase letters.
 */

public class Problem859 {
    public static void main(String[] args) {
        System.out.println("buddy " + " aa " + " aa " + " : " + buddyStrings("aa", "aa"));
        System.out.println("buddy " + " ab " + " ab " + " : " + buddyStrings("ab", "ab"));
        System.out.println("buddy " + " aa " + "  " + " : " + buddyStrings("aa", ""));
        System.out.println("buddy " + " aaaaaaaaaaaab " + " aaaaaaaaaaaba " + " : " + buddyStrings("aaaaaaaaaaaab", "aaaaaaaaaaaba"));
    }

    public static boolean buddyStrings(String A, String B) {
        if (null == A || null == B || A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) {
            char[] a = new char[256];
            for (int i = 0; i < A.length(); i++) {
                if (a[A.charAt(i)] != 0) {
                    return true;
                } else {
                    a[A.charAt(i)]++;
                }
            }
            return false;
        } else {
            char[] a = new char[2];
            char[] b = new char[2];
            int k = 0;
            for (int i = 0; i < A.length(); i++) {
                char m = A.charAt(i);
                char n = B.charAt(i);

                if (m != n) {
                    if (k < a.length) {
                        a[k] = m;
                        b[k] = n;
                    }
                    k++;
                }
            }

            if (k == 2 && a[0] == b[1] && a[1] == b[0]) {
                return true;
            } else {
                return false;
            }
        }
    }
}
