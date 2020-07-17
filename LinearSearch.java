import java.util.Scanner;

class LinearSearch
{  
	public static int search(int arr[], int x) 
	{ 
		for(int i = 0; i < arr.length; i++) 
		{ 
			if(arr[i] == x) 
				return i; 
		}
		return -1; 
	} 
  
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		
		int n,i,x;
		
		System.out.println("Enter array length");
		
		n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements in array");
		
		for(i=0;i<arr.length;i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to find");
		x = sc.nextInt();
		
		int result = search(arr, x); 
		if(result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element is present at " + result); 
	} 
} 