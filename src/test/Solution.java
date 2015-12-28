package test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        System.out.println("helloworld");
        Scanner sc = new Scanner(System.in);
        System.out.println("inout the number");
        String num_string = sc.next();
        int length = num_string.length();
        int num = Integer.parseInt(num_string);
        while (length>1){
        	num = 0;
        	for(int i=0;i<length;i++){
        		char c_num = num_string.charAt(i);
        		String s_num = String.valueOf(c_num); 
        		num = num + Integer.parseInt(s_num);
        	}
        	num_string = String.valueOf(num);
        	length = num_string.length();
        }
        System.out.println(num);
    }
}
