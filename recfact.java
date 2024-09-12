package com.dsa;

public class recfact {
    public static int fact(int n){
        if(n==0||n==1){
            return n;
        }
        else  return n*fact(n-1);
    }

    public static void main(String[] args) {
          int fac=fact(7);
        System.out.println(fac);
    }
}
