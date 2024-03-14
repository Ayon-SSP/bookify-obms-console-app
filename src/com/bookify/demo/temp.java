package com.bookify.demo;

public class temp {
    public static void main(String[] args) {
        // String categoryId = "ca00001";
        // String categoryId = "ca00011";
        // int lastCharAsInt = Character.getNumericValue(categoryId.charAt(categoryId.length() - 1));
        // System.out.println(lastCharAsInt);

        String categoryId = "ca99011";
        int number = Integer.parseInt(categoryId.substring(2));
        System.out.println(number);
    }
    
}
