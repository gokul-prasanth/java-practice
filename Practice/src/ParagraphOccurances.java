import java.util.Scanner;

/**
 * @author Gokul
 *
 * Find the occurrences of alphabets, digits, spaces and punctuation marks in a paragraph.
 *
 */
public class ParagraphOccurances {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");

		String str = sc.nextLine();

		System.out.println("String : "+str);

		char[] strArray = str.toCharArray();

		int alphabetCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int punctuationCount = 0;

		for(int i = 0; i<strArray.length; i++) {

			if(strArray[i] >= 'a' && strArray[i] <= 'z') {
				alphabetCount++;
			} if( strArray[i] >= 'A'  && strArray[i] <= 'Z' ) {
				alphabetCount++;
			} else if(strArray[i] >= '0' && strArray[i] <= '9' ) {
				digitCount++;
			} else if(strArray[i] == ' ') {
				spaceCount++;
			} else if(strArray[i] == '.' || strArray[i] == '"' || strArray[i] == '?' || strArray[i] == '!' 
					|| strArray[i] == ',' || strArray[i] == ':'|| strArray[i] == ';') {
				punctuationCount++;
			}
		}

		System.out.println("Occurance of Alphabets :" + alphabetCount);
		System.out.println("Occurance of Digits :" + digitCount);
		System.out.println("Occurance of Spaces :" + spaceCount);
		System.out.println("Occurance of Punctuations :" + punctuationCount);

	}
}
