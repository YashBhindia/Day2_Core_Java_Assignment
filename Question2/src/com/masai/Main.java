package com.masai;

public class Main {

    public static String forString() {
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "a";
        }
        return result;
    }

    public static StringBuilder forStringBuilder() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            result.append("a");
        }
        return result;
    }

    public static StringBuffer forStringBuffer() {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            result.append("a");
        }
        return result;
    }
    
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        String ans = forString();
        long endTime = System.nanoTime();
        long ans1 = endTime - startTime;
        System.out.println("String concatenation time is: "+ ans1 +" nanoseconds");

        startTime = System.nanoTime();
        StringBuilder stringBuilder =forStringBuilder();
        endTime = System.nanoTime();
        long ans2 = endTime - startTime;
        System.out.println("StringBuilder concatenation time is: "+ ans2 +" nanoseconds");

        startTime = System.nanoTime();
        StringBuffer stringBuffer = forStringBuffer();
        endTime = System.nanoTime();
        long ans3 = endTime - startTime;
        System.out.println("StringBuffer concatenation time is: "+ ans3 +" nanoseconds");
    }

}
