import java.util.Scanner;

public class LargestAndSmallestAscii {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String str=sc.nextLine();
int length=str.length();
char[] array=str.toCharArray();

char largest=array[0];
char smallest=array[0];

for(int i=0;i<length;i++)
{
	if(array[i]>largest)
	{
		largest=array[i];
	}
}

for(int i=0;i<length;i++)
{
	if(array[i]<smallest)
	{
		smallest=array[i];
	}
}

System.out.println(largest+""+smallest);
	}

}
