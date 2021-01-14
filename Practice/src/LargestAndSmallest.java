import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class LargestAndSmallest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
	   
	   int largest=0;
	   int smallest=10;
	     
	   while(temp!=0)
	   {
		int rem=temp%10;
		if(rem>largest)
		{
			largest=rem;
		}
		temp=temp/10;
	   }
	   
	   temp=num;
	   while(temp!=0)
	   {
		int rem=temp%10;
		if(rem<smallest)
		{
			smallest=rem;
		}
		temp=temp/10;
	   }
	   
	   System.out.println(largest);
	   System.out.println(smallest);
	}
}
