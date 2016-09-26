package T2;

public class Calculation {

	public static boolean calculatePresence(double x, double y) {

		if (y >= 0 && y <= 5 && x <= 4 && x >= -4 && x!=Double.MIN_VALUE) {
			return true;
		} else if (y >= -3 && y <= 0 && x >= -6 && x <= 6) {
			return true;
		} else {
			return false;
		}
	}
}
