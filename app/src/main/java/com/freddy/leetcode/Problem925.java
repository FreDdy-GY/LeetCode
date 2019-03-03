package com.freddy.leetcode;

/**
 *925. Long Pressed Name
 *
 * Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

 You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.



 Example 1:

 Input: name = "alex", typed = "aaleex"
 Output: true
 Explanation: 'a' and 'e' in 'alex' were long pressed.
 Example 2:

 Input: name = "saeed", typed = "ssaaedd"
 Output: false
 Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 Example 3:

 Input: name = "leelee", typed = "lleeelee"
 Output: true
 Example 4:

 Input: name = "laiden", typed = "laiden"
 Output: true
 Explanation: It's not necessary to long press any character.


 Note:

 name.length <= 1000
 typed.length <= 1000
 The characters of name and typed are lowercase letters.
 */

public class Problem925 {
    public static void main(String[] args) {
        System.out.println("check " + "alex" + " and " + "aaleex" + " : " + isLongPressedName("alex", "aaleex"));
        System.out.println("check " + "saeed" + " and " + "ssaaedd" + " : " + isLongPressedName("saeed", "ssaaedd"));
        System.out.println("check " + "leelee" + " and " + "lleeelee" + " : " + isLongPressedName("leelee", "lleeelee"));
        System.out.println("check " + "laiden" + " and " + "laiden" + " : " + isLongPressedName("laiden", "laiden"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (null == name || null == typed) {
            return false;
        }

        if (name.equals(typed)) {
            return true;
        }

        char last = (char) -1;
        int n = 0;
        for (int i = 0; i < typed.length(); i++) {
            char c = typed.charAt(i);
            if (n < name.length() && c == name.charAt(n)) {
                last = name.charAt(n++);
                continue;
            }
            if (c == last) {
                continue;
            }
            return false;
        }
        return n == name.length();
    }
}
