import java.security.PublicKey;
import java.util.*;

public class PokerCard {

	/* 判斷花色 */
	/* S 代表黑桃、 H 代表紅心、 D 代表方塊、 C 代表梅花 */
	public static void main(String args[]) {
		ArrayList<Integer> spadeNum = new ArrayList<Integer>();
		ArrayList<Integer> heartNum = new ArrayList<Integer>();
		ArrayList<Integer> diamondNum = new ArrayList<Integer>();
		ArrayList<Integer> clubNum = new ArrayList<Integer>();
		ArrayList<String> sortedList = new ArrayList<String>();
		ArrayList<String> inputArrayList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		/* 輸入資料數量 */
		int amount = sc.nextInt();
		if (!(sc.nextLine().equals(" "))) {
			for (int i = 0; i < amount; i++) {
				inputArrayList.add(sc.nextLine());
			}
		}

//		String input = "D8 S3 D10 C12 H7 D5 S10 H8 H9";
//				String input = "D8 S3 D10 C12 H7";
//				String input = "C5 D11 S1";
//				String input = "H6 S3";
//				String input = "H5 D4 S2 C13";
		for (String inputStr : inputArrayList) {
			String[] cards = inputStr.split("\\W+");
			for (String card : cards) {
				String capital = card.substring(0, 1);
				int number = Integer.parseInt(card.substring(1));
				if (capital.equals("S")) {
					spadeNum.add(number);
				}
				if (capital.equals("H")) {
					heartNum.add(number);
				}
				if (capital.equals("D")) {
					diamondNum.add(number);
				}
				if (capital.equals("C")) {
					clubNum.add(number);
				}

				Collections.sort(spadeNum);
				Collections.reverse(spadeNum);
				Collections.sort(heartNum);
				Collections.reverse(heartNum);
				Collections.sort(diamondNum);
				Collections.reverse(diamondNum);
				Collections.sort(clubNum);
				Collections.reverse(clubNum);
			}

			for (int number : spadeNum) {
				String string = String.valueOf(number);
				sortedList.add("S" + string);
			}
			for (int number : heartNum) {
				String string = String.valueOf(number);
				sortedList.add("H" + string);
			}
			for (int number : diamondNum) {
				String string = String.valueOf(number);
				sortedList.add("D" + string);
			}
			for (int number : clubNum) {
				String string = String.valueOf(number);
				sortedList.add("C" + string);
			}
			for (String s : sortedList) {
				System.out.print(s + " ");
			}
			sortedList.clear();
			spadeNum.clear();
			heartNum.clear();
			diamondNum.clear();
			clubNum.clear();
			System.out.println();

		}

	}
}
