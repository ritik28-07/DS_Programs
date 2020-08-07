
public class Stack_Implementation {
	
	int stack[] = new int[100];
	int top = -1;
	
	public void push(int data)
	{
		if(top == 99)
		{
			System.out.println("Stack OVERFLOW");
		}
		else
		{
			top++;
			stack[top] = data;
			//System.out.println(data + " has peen pushed into stack");
		}
	}
	
	public void pop()
	{
		int item = 0;
		if(top == -1)
		{
			System.out.println("Stack UNDERFLOW");
		}
		else
		{
			item = stack[top];
			top--;
			System.out.println(item + " has been poped");
		}
	}
	
	public void peek()
	{
		if(top == -1)
		{
			System.out.println("Stack UNDERFLOW");
		}
		else
		{
			System.out.println(stack[top] + " is the top element of stack");
		}
	}
	
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i] + " has peen pushed into stack");
		}
	}
	
	public static void main(String[] args)
	{
		Stack_Implementation sI = new Stack_Implementation();
		sI.push(10);
		sI.push(20);
		sI.push(30);
		sI.push(40);
		sI.push(50);
		sI.display();
		sI.pop();
		sI.peek();
	}
}
