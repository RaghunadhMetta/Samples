package com.company.ReverseString;

public class ReverseString {

    public static void main(String[] args) {
        // write your code here

        String name = "abcde";
        char[] chars = name.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;

        }

        System.out.println(chars);
    }
}
