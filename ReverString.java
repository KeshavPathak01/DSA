package com.dsa;
import java.util.*;

public class ReverString {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("hello");
    for(int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length()-1-i;

    char frontchar=sb.charAt(i);
    char backchar=sb.charAt(back);
    sb.setCharAt(i,backchar);
    sb.setCharAt(back,frontchar);
    }
        System.out.println(sb);
    }
}
