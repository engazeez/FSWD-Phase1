package searchProgramms;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args)   
	{  
	
	int n;  
	Scanner scanner=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	n=scanner.nextInt();  
	
	//creates an array in the memory of length 10  
	int array[] = new int[n];  
	System.out.println("Enter the elements of the array: ");  
	
	for(int i=0; i<n; i++)  
	{  
		//reading array elements from the user   
		array[i]=scanner.nextInt();  
	}  
	
	System.out.println("Array elements are: "+ n);  
	// accessing array elements using the for loop  
	
	for (int i=0; i<n; i++)   
	{  
		if (array[i] == 38)
		{System.out.println("Index of "+ array[i] + " = "+ i); }
	} 
	  
	} 
}
