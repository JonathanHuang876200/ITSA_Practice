
import java.util.*;

public class TruckMinCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		ArrayList<Integer> dayArray = new ArrayList<Integer>();
		for (int i = 0; i <= 23; i++) {
			dayArray.add(0);
		}
		int startTime, endTime;
		for (int j = 0; j < amount; j++) {
			startTime = sc.nextInt();
			endTime = sc.nextInt();
//			System.out.println(startTime);
//			System.out.println(endTime);
			for (int k = (startTime - 1); k < (endTime - 1); k++) {
				int temNum = dayArray.get(k);
				temNum++;
				dayArray.set(k, temNum);
			}

		}
		System.out.println(dayArray);
		Collections.sort(dayArray);
		System.out.println(dayArray);
		System.out.println(dayArray.get(dayArray.size() - 1));
		sc.close();
	}

}
