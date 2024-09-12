package com.dsa;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
        int []arr={9,8,6,3,11,12};
        for(int i=1;i< arr.length;i++){
            int index=i;
            int k=i;
                while(arr[k]<arr[k-1] && k>0){
                    index=k;
                    k--;
                }
                for(int l=k-1;k>)


        }
        for(int item:arr){
            System.out.println(item);
        }

    }



}
