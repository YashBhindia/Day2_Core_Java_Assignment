package com.masai;

public class C {

	 public static String reverseString(String str) {
	        StringBuffer sb = new StringBuffer(str);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        System.out.println(reverseString(str));
	    }
}
