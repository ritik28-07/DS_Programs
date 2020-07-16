import java.util.*;
public class WithBubbleSort {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int j,n,i,temp=0;
		
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		   
		}
		for(i=1;i<=n-1;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
