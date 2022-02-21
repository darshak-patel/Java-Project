package MT01;

public class MTTest {

	private static String numberToString(int number) {
		String numberString = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (number == 0) {
			return "zero";
		}

		if (number < 0) {
			String numberStr = "" + number;
			numberStr = numberStr.substring(1);
			return "minus " + numberToString(Integer.parseInt(numberStr));
		}

		if ((number / 1000000) > 0) {
			numberString = numberString + numberToString(number / 1000000) + " million ";
			number = number % 1000000;
		}

		if ((number / 1000) > 0) {
			numberString = numberString + numberToString(number / 1000) + " thousand ";
			number = number % 1000;
		}

		if ((number / 100) > 0) {
			numberString = numberString + numberToString(number / 100) + " hundred ";
			number = number % 100;
		}

		if (number > 0) {

			if (number < 20) {

				numberString = numberString + unitsArray[number];
			} else {

				numberString = numberString + tensArray[number / 10];
				if ((number % 10) > 0) {
					numberString = numberString + " " + unitsArray[number % 10];
				}
			}
		}
		return numberString;
	}

	public static void main(String[] args) {
		String testNumber = numberToString(878444);
		System.out.println(testNumber);
	}
}
