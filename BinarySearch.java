import java.util.*;

public class BinarySearch {
	public void search(int a[], int x) 
	{ 
		int f=0;
		int l=a.length-1;
		int m=(f+l)/2;
		
		while(f<=l)
		{
			if(a[m]<x)
			{
				f=m+1;
			}
			
			else if(a[m]==x)
			{
				if(f>l)
					System.out.println("Element is present at " + (m+1));
				else
					System.out.println("Element not present");
			}
			else
			{
				l=m-1;
			}
		
			m=(f+l)/2;
		
		}
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
		
		BinarySearch s = new BinarySearch();
		
		s.search(arr, x); 
	} 
}
