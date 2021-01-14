import java.util.*;

public class AddIgnoringNonDigits {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
 
String str=sc.nextLine();
int length=str.length();
char[] array=str.toCharArray();

int sum=0;
for(int i=0;i<length;i++)
{
	if(Character.isDigit(array[i]))
	{   
		
		sum=sum+Character.getNumericValue(array[i]);
	}
}

System.out.println(sum);
	}

}
