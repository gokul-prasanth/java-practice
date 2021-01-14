import java.util.Scanner;

public class AddOfDigits {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String num=sc.nextLine();
		int length=num.length();
		int number=Integer.parseInt(num);
		
		
		int sum=0;
		int temp=0;
		
		while(number!=0)
		{
			temp=number%10;
			sum=sum+temp;
			number=number/10;
		}
		
		System.out.println(sum);
	}
}
