import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		String s1 = "a1 f2 s3 f4 fs";
		String s2 = "12 548 48 546";
		String s3 = "asdf asdf asdf";
		String input1, input2, input3;
//		ArrayList<String> stringList = new ArrayList<String>();
//		ArrayList<String> elementList = new ArrayList<String>();
		String[] stringArray = new String[amount];
		if (!(sc.nextLine().equals(" "))) {
			for (int i = 0; i < amount; i++) {
				String temStr = sc.nextLine();
				stringArray[i] = temStr;
			}
			for (String string : stringArray) {
				System.out.println(string);
			}
		}
//		int i = 0;
//		while (sc.hasNextLine()) {
//			stringList.add(sc.nextLine());
//			i++;
//			if (i == amount) {
//				break;
//			}
//		}

	}

}
