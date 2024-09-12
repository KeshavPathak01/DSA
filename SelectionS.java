package com.dsa;

public class SelectionS {
    public static void main(String[] args) {
        int []my_array={64,34,25,5,22,11,90,12};
        for(int l=0;l< my_array.length-1;l++){
            int index=l;
            for(int i=l+1;i<my_array.length;i++){
            if(my_array[index]>my_array[i]){
                index=i;
            }
        }
        int small=my_array[index];
        for(int k=index;k>l;k--){
            my_array[k]=my_array[k-1];
        }
        my_array[l]=small;

    }
    for(int item:my_array){
        System.out.println(item);
    }
    }
}
