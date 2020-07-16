import java.util.*;
public class MaxElement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int j,n,i,max=0;
	
		n=sc.nextInt();
		int[] arr=new int[n];
	
		for(j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt(); 
		}
		max = arr[0];
		for(i = 1; i < arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max element in the array is: " + max);
	}
}
