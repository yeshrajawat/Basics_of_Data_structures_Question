package questions;
import java.util.*;


public class Question_9 {
	 public int removeDuplicates(int[] arr) {
	        int i=0;
	        int j = 1;
	        int count =0;
	        
	        if(arr.length==0) return 0;
	        
	        while(j<=arr.length-1-count)
	        {
	            if(arr[i]==arr[j])
	            {
	                for(int k=j;k<arr.length-1-count;k++)
	                {
	                    arr[k] = arr[k+1];
	                }
	                count++;
	            }
	            else
	            {
	                i++;
	                j++;
	            }
	            
	        }
	        return arr.length-count;
	        }
	
	
	
	
	
	public static void main(String ... args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array!!");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		Question_9 a = new Question_9();
		System.out.print(a.removeDuplicates(arr));
	scan.close();}
}
