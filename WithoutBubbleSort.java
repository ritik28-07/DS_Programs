import java.util.*;
public class WithoutBubbleSort {
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
		for(i=0;i<n;i++)
		{
			for(j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	
	}
}
