package com.dsa;

public class Insertion {
    public static void main(String[] args) {
        int []my_array={64,34,25,5,22,11,90,12};
        int index=0;
            for(int k=index;k< my_array.length-1;k++){
                if(my_array[k]>my_array[k+1]){
                    index=k+1;
                    for(int i=index;i>0;i--){
                        if(my_array[i]<my_array[i-1]){
                            int s=my_array[i];
                            my_array[i]=my_array[i-1];
                            my_array[i-1]=s;
                        }
                        else break;
                    }
                }
            }
            for(int element:my_array){
                System.out.println(element);
            }
    }
}

