package com.dsa;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
        int []arr={9,8,6,3,11,12};
        for(int i=1;i< arr.length-1;i++){
            int k=i;
                while(k>0 && arr[k]<arr[-1]){               int temp=arr[k];
                arr[k]=arr[k-1];
                arr[k-1]=temp;
                k--;
                }

        }
        for(int item:arr){
            System.out.println(item);
        }

    }



}
