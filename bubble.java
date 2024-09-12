package com.dsa;

public class bubble {
    public static void main(String[] args) {
        int []arr={11,10,9,8,7,6};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        for(int item:arr){
            System.out.println(item);
        }
    }
}
