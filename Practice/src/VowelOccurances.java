import java.util.Scanner;

public class VowelOccurances {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");

		String str = sc.next();

		char[] strArray = str.toCharArray();
		int[] resArray = {0,0,0,0,0};

		for(int i = 0; i<strArray.length; i++) {
			if(strArray[i] == 'a' || strArray[i] == 'A' ) {
				resArray[0]++;
			} else if(strArray[i] == 'e' || strArray[i] == 'E' ) {
				resArray[1]++;
			} else if(strArray[i] == 'i' || strArray[i] == 'I' ) {
				resArray[2]++;
			} else if(strArray[i] == 'o' || strArray[i] == 'O' ) {
				resArray[3]++;
			} else if(strArray[i] == 'u' || strArray[i] == 'U' ) {
				resArray[4]++;
			}
		}

	   System.out.println("Occurance of Vowel 'A' :" + resArray[0]);
	   System.out.println("Occurance of Vowel 'E' :" + resArray[1]);
	   System.out.println("Occurance of Vowel 'I' :" + resArray[2]);
	   System.out.println("Occurance of Vowel 'O' :" + resArray[3]);
	   System.out.println("Occurance of Vowel 'U' :" + resArray[4]);

	}

}
