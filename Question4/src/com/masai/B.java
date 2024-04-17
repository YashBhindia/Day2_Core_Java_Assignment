package com.masai;

public class B {

	public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(reverseString(str));
    }
}
