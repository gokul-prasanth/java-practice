import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int length=str.length();
		
		char[] array=str.toCharArray();
		char min=array[0];
		
		for(int i=0;i<length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		System.out.println(min);
	}

}
