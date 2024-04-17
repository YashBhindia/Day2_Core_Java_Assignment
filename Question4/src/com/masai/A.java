package com.masai;

public class A {

	public static String reverseString(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(reverseString(str));
    }
}
