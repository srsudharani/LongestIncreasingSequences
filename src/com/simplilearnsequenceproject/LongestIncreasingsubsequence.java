package com.simplilearnsequenceproject;
import java.util.Scanner;
public class  LongestIncreasingsubsequence {
    static int arraysize ;  // static variable
	static int array[];     //static variable
	 int i, j, max = 0;    // instance variable
	 int lis[] ;     // instance variable
	
	 public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter array length ");
		 arraysize = sc.nextInt();
		 array = new int[arraysize]; 

		 LongestIncreasingsubsequence obj = new LongestIncreasingsubsequence();  // creating object ref 

		 System.out.println("Enter add element in array");
		 for(int i=0; i<array.length; i++)
		 {
			 System.out.print("array ["+i+"] = ");
			 array[i] = sc.nextInt(); 
		 }
		 System.out.println();
		 long l = array.length;
		 int n= (int)l;    // use here explicit type casting
		 System.out.println("Length of Longest Increasing Subsequence is " + obj.lis(array, n) + "\n");
	 }
	
	private final int lis(int arr[], int n)    // this is private with final method we can access within a class
	 {
		 lis = new int[n];   // this is implicitly present but i write explicitly 

		 /// Initialize LIS values for all indexes 
		 for (i = 0; i < n; i++)
			 lis[i] = 1;

		 // Compute optimized LIS values in bottom up manner 
		 for (i = 1; i < n; i++)
			 for (j = 0; j < i; j++)
				 if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					 lis[i] = lis[j] + 1;

		 // find maximum of all LIS values 
		 for (i = 0; i < n; i++)
			 if (max < lis[i])  
				 max = lis[i];  

		 return this.max;   // i used this here explicitly 
	 
		 
		 }
}

