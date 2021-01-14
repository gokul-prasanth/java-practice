import java.util.Scanner;

public class MaxOfNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int max=0;
		
		int temp=num;
		
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem>max)
			{
				max=rem;
			}
			temp=temp/10;
		}
		
		System.out.println(max);
		}

}
