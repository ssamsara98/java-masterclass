public class BarkingDog {
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if ((hourOfDay >= 0) && (hourOfDay <=23)) {
			if ((hourOfDay < 8) || (hourOfDay > 22)) {
				return barking;
			}
			return false;
		}
		return false;
	}
}
