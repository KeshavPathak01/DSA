package com.dsa;

public class BinarySearch {
    public static int binary(int []arr,int f){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
        int sindex=(left+right)/2;
        if(arr[sindex]==f){
           return sindex;
        }
        else if(arr[sindex]>f) {
            right = sindex - 1;
        } else {
            left=sindex+1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int index=binary(arr,13);
        System.out.println(index);
    }
}
