import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    
    String str=sc.nextLine();
    int len=str.length();
    char[] array=str.toCharArray();
    int vow=0;
    
    for(int i=0;i<len;i++)
    {
    	if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u'||array[i]=='A'||array[i]=='E'||array[i]=='I'||array[i]=='O'||array[i]=='U')
    		{
    				vow++;
    		}
    }
    
    System.out.println(vow);
	}

}
