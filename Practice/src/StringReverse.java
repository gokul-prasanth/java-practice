import java.io.IOException;
import java.util.Scanner;

/**
 * @author Gokul
 */
public class StringReverse {

	public static void main(String[] args) {

		System.out.println("Enter a string to be reversed: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] strArray = str.toCharArray();
		StringBuilder result= new StringBuilder();
		
		for(int i = strArray.length-1; i >=0 ; i--) {
			result.append(strArray[i]);
		}
		
		System.out.println("Reversed String: " + result.toString());
		
	}

}
