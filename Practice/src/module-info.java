package Practice;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class module-info {
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
		for (int i = 0; i < amount; i++) {
			inputArrayList.add(sc.next());
		}	
		for (String string : inputArrayList) {
			System.out.println(string);
		}
//		}
//		String input = "D8 S3 D10 C12 H7";
//		String input = "C5 D11 S1";
//		String input = "H6 S3";
//		String input = "H5 D4 S2 C13";
		for (String x : inputArrayList) {
			String[] cards = x.split("\\W+");
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
				Collections.sort(heartNum);
				Collections.sort(diamondNum);
				Collections.sort(clubNum);
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

		}
	}
}