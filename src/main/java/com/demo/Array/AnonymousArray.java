package com.demo.Array;

public class AnonymousArray {
	public static void  printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}
	
public static void  printStringArray(String arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}
	public static void main(String[] args) {
		printArray(new int[]{1,2,5,4,55,44,88,99});
		printStringArray(new String[]{"hii","hello","world","welcome to","testing"});
	}

}
