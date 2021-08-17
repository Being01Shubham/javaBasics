package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        float f=10L;
        int[] arr = {1,23,45,67,89,567,34,234,123,};
        Arrays.sort(arr);
//        Arrays.binarySearch(arr, 89);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }

    }
}
