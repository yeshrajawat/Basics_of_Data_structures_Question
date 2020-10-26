/*. Write the function that removes all even numbers from the given stack. The mutual
order of odd numbers must stay unchanged. The function returns the number of
removed numbers.
*/
package questions;
import java.util.*;

public class Question_5 {
	
		private int stack[] ;
		private int size ;
		private int top =-1;
		
		void set_size(int size)
		{
			this.size = size;
			stack = new int[size];
		}
		
		void push(int data)
		
		{
			if(top==-1)
			{
				top =0;
				stack [top] = data;
			}
			else if(top==size-1)
			{
				System.out.println("Overflow");
			}
			else
			{
				top++;
				stack[top] = data;
			}
		}
		
		int pop()
		{
			int element=0;
			if(top==-1)
			{
				System.out.println("Underflow");
				
			}
			else
			{
				 element = stack[top];
				top--;
			}
			return element;
		}
		
		
		
		
	void remove_even()
		{
		int i=0;
		int count = stack.length-1;
		int remove_count=0;
		int [] temp = new int[stack.length];
		int [] remove = new int [stack.length];
		while(count!=-1)
		{
		if(Math.abs(stack[count])%2==0)
			{
				remove[remove_count] =  pop();
				remove_count++;
				count--;
			}
			else
			{
				temp[i] = pop();
				i++;
				count--;
			}
		}
			
			for(int j=i-1;j>-1;j--)
			{
				push(temp[j]);
			
			}
			for(int j=0;j<remove_count;j++)
			{
				System.out.print(remove[j]+" ");
			}
			System.out.println();
			
		
			
		}
	void traversal ()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.print(stack[i]+ " ");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of stack:");
		Question_5 a = new Question_5();
		int size = scan.nextInt();
		a.set_size(size);
		System.out.println("Enter the elements in stack:");
		for(int i=1;i<size+1;i++)
		{
			a.push(scan.nextInt());
		}
		
		a.remove_even();
		a.traversal();
		
		
	scan.close();}
}
