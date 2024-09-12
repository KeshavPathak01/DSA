package com.dsa;

public class impselection {
    public static void main(String[] args) {
        int []my_array={64,34,25,5,22,11,90,12};
        for(int l=0;l<my_array.length-1;l++){
            int index=l;
            for(int i=l+1;i< my_array.length;i++){
                if(my_array[index]>my_array[i]){
                    index=i;
                }
                int small=my_array[index];
                my_array[index]=my_array[l];
                my_array[l]=small;
            }
        }
        for(int element:my_array){
            System.out.println(element);
        }
    }
}
