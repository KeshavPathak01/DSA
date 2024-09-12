package com.dsa;

public class countingS {
    static int []countSort(int[]arr){
        int maxi=arr[0];
        for(int i=1;i< arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
        }
        int []conutArray=new int[maxi+1];
        for(int m=0;m< arr.length;m++){
            conutArray[arr[m]]++;
        }
        int index=0;
        for(int k=0;k<conutArray.length;k++){
            while(conutArray[k]>0){
                arr[index++]=k;
                conutArray[k]--;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int []unsortedarray={4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        int []sorted=countSort(unsortedarray);
        for(int element:sorted){
            System.out.print(element+"\t");
        }
    }
}
