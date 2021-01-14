import java.util.Scanner;

public class MaxAscii {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int length=str.length();
		
		char[] array=str.toCharArray();
		char max=array[0];
		
		for(int i=0;i<length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.println(max);
	}

}
