import java.io.IOException;

public class UnlockGiftBox {
	
	public static void main(String[] args) throws IOException {

		String input_information = "Emma man#Frankenstein enter#Clarissa iron#Sybil ant";

		String result = Result.unlockGiftBox(input_information);

		System.out.println(result);
	}
}

class Result {

	/*
	 * Complete the 'unlockGiftBox' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts STRING input_information as parameter.
	 */

	public static String unlockGiftBox(String input_information) {
		// Write your code here

		String[] inputArray = input_information.split("#");
		StringBuilder result = new StringBuilder();

		for(int i = 0; i < inputArray.length; i++) {

			System.out.println("iteration : " + i);

			String[] NovelArray = inputArray[i].split(" ");
			int length = NovelArray[0].length();

			if(length %2 == 0) {
				int pos1 = (length / 2)-1;
				int pos2 = length / 2;

				char middleLetter1 = inputArray[i].charAt(pos1);
				char middleLetter2 = inputArray[i].charAt(pos2);

				int count = getCount(middleLetter1, NovelArray[1]);
				if(middleLetter1 != middleLetter2) {
					count += getCount(middleLetter2, NovelArray[1]);
				} 
				result.append(count+"#");

			}
			else {

				int pos1 = length / 2;
				char middleLetter1 = inputArray[i].charAt(pos1);
				int count = getCount(middleLetter1, NovelArray[1]);
				result.append(count+"#");
			}

		}

		return result.toString().substring(0, result.toString().length()-1);

	}

	public static int getCount(char letter, String word) {
		int result = 0;

		char[] charArray = word.toCharArray();

		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == letter) {
				result++;
			}
		}

		return result;
	}

}
