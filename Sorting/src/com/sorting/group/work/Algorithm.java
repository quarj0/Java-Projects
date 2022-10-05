package com.sorting.group.work;

import java.util.Scanner;

public class Algorithm {
	
	// creating an sortArray method that sort the given array using counting sort
	public static void sortArray(int inputArray[]){

		
// calculating size of the array  
        int size = inputArray.length;
        
// creating another array having same length of inputArray that will store elements in a sorted way  
        int sortedArray[] = new int[size];
        
        
// Creating countArray that will store count of occurrence of each number and initialize it with 0  
        int countArray[] = new int[256];  
        for (int i = 0; i < 256; ++i) {  
            countArray[i] = 0; 
	}
        
// using for loop to store the count of each number in the countArray 
        for (int i = 0; i < size; ++i)  
            ++countArray[inputArray[i]]; 
        
        
// modifying the value of countArray[i] so that countArray[i] now contains actual position of the current number in the sortedArray  
        for (int i = 1; i <= 255; ++i)  
            countArray[i] += countArray[i - 1]; 
               
        
// iterating over the inputArray in reverse order to perform counting sort.  
        for (int i = size - 1; i >= 0; i--) {  
            sortedArray[countArray[inputArray[i]] - 1] = inputArray[i];  
            --countArray[inputArray[i]]; 
        }
        
// putting the sortedArray to inputArray, so that inputArray now contains sorted elements  
        for (int i = 0; i < size; ++i)  
            inputArray[i] = sortedArray[i]; 
        
        
// printing the output sorted array elements  
        System.out.print("Sorted numbers in the array is: ");  
        for (int i = 0; i < inputArray.length; ++i)  
            System.out.print(" "+inputArray[i]);
	}
		public static void main (String[] args) {
			int size;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of element you wan to store in the array: ");
			
//			read the number user stores
			
			size = sc.nextInt();
			
			int[] inputArray = new int[size];
			System.out.println("Enter the elements in the array: ");
			
			for(int i=0; i<size; i++) {
				inputArray[i]=sc.nextInt();
			}
			sc.close();
			
			sortArray(inputArray);
		}
}