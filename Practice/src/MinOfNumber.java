import java.util.Scanner;

public class MinOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int min=10;
		
		int temp=num;
		
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem<min)
			{
				min=rem;
			}
			temp=temp/10;
		}
		
		System.out.println(min);
		}

}
