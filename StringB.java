package com.dsa;
import java.util.*;
public class StringB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");

        //To get char from any index
        System.out.println(sb.charAt(0));

        //To set char at and index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert function is use to insert char at any index previous char from that index there index increases by 1
        sb.insert(0,'T');
        System.out.println(sb);

        //To delete char or substring from string
        sb.delete(1,2);
        System.out.println(sb);

        //To add char at the end of string
        sb.append("aa");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}