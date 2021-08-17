package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        float f=10L;
        int[] arr = {1,23,45,67,89,567,34,234,123};
        Arrays.sort(arr);
//        Arrays.binarySearch(arr, 89);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        MinMAx(arr);

    }

    public static int MinMAx (int[] arr){
        int n = arr.length -1;
        System.out.println("Minimum Element of an Array : "+arr[0]);
        System.out.println("Maximum Element of an Array : "+arr[n]);
        return 0;
    }

}
