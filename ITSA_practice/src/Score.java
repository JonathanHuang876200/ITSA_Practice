import java.text.*;
import java.util.*;

public class Score {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.####");
		double d = Math.pow(125, 1.0 / 3);
		double n = Math.sqrt(100.0);
		double x = 1.0 / 2;

//		System.out.println(d);
		System.out.println(df.format(n));

	}

}
