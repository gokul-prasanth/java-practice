import java.util.*;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);

String str=sc.nextLine();
int length=str.length();
char[] array=str.toCharArray();

int upcount=0;
int lowcount=0;

for(int i=0;i<length;i++)
{
	if(Character.isUpperCase(array[i]))
	{
		upcount++;
	}
	else if(Character.isLowerCase(array[i]))
	{
		lowcount++;
	}
}

System.out.println(upcount);
System.out.println(lowcount);
}

}
