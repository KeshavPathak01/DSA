package com.dsa;

public class QuickS {
    static int []quickSort(int[] arr, int i, int pivot){
        if(i<pivot){
        int l=partision(arr,i,pivot);
        quickSort(arr,i,l-1);
        quickSort(arr,l+1,arr.length-1);}
        return arr;
    }
    static int partision(int[]arr,int l,int pivot){
        for(int k=pivot;k>l;k--){
            if(arr[pivot]<=arr[k-1]){
                int b=arr[k-1];
                for(int j=k-1;j<pivot;j++){
                    arr[j]=arr[j+1];
                }
                arr[pivot]=b;
                pivot=k-1;

            }
        }
        return pivot;
    }
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        int []Sarray=quickSort(myArray,0, myArray.length-1);
        for(int element:Sarray){
            System.out.print(element+"\t");
        }
    }
}
