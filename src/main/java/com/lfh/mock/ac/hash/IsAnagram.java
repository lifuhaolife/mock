package com.lfh.mock.ac.hash;

public class IsAnagram {


    public boolean isAnagram(String s, String t) {

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i) - 'a']--;
        }

        for (int aChar : chars) {
            if (aChar != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println('A' + 1);
    }
}
