
class Stack
{
	private int[] arr;
	private int capacity;
	private int top1, top2;

	public Stack(int n)
	{
		capacity = n;
		arr = new int[n];
		top1 = -1;
		top2 = n;
	}

	public void push1(int key)
	{
		if (top1 + 1 == top2)
		{
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top1++;
		arr[top1] = key;
	}

	public void push2(int key)
	{
		if (top1 + 1 == top2)
		{
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top2--;
		arr[top2] = key;
	}

	public int pop1()
	{
		if (top1 < 0)
		{
			System.out.println("Stack UnderFlow");
			System.exit(-1);
		}

		int top = arr[top1];
		top1--;
		return top;
	}

	public int pop2()
	{
		if (top2 >= capacity)
		{
			System.out.println("Stack UnderFlow");
			System.exit(-1);
		}

		int top = arr[top2];
		top2++;
		return top;
	}
}

class TwoStacks_Implementation_OneArray
{
	public static void main(String[] args)
	{
		Stack stack = new Stack(5);
		 stack.push1(5); 
		 stack.push2(10); 
		 stack.push2(15); 
		 stack.push1(20); 
		 stack.push2(30); 

		System.out.println("Popping element from the first stack : " + stack.pop1());
		
		stack.push2(50);
		
		System.out.println("Popping element from the second stack : " + stack.pop2());
	}
}