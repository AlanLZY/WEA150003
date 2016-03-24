package com.alan;

public class Main <T> {
    public static void main(String args[]){
        ArrayBag <String> items = new ArrayBag <> ();
        System.out.println(items.getCurrentSize());
        boolean add = items.add("This is Awkward");
        System.out.println(items.getCurrentSize());
        System.out.println(items.getCurrentSize());
    }
}
