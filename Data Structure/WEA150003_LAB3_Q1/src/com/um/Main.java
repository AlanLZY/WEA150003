package com.um;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(a,11));
    }

    public static boolean binarySearch(int [] array, int number){
        int low = 0, high = array.length - 1, mid = high + low / 2;
        if (number == array[mid])
            return true;
        else if (number > array[mid])
            return binarySearch(Arrays.copyOfRange(array, mid + 1, array.length), number);
        else
            return binarySearch(Arrays.copyOfRange(array, 0, mid - 1), number);
    }
}
