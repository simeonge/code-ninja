package com.simeong.code;

public class CodeChallenges {
	/**
	 * Calculates the acute degree between the hands of an analog clock.
	 * 
	 * @param hour
	 *            The current hour.
	 * @param min
	 *            The current minute.
	 * @return The degree between the clock hands.
	 */
	public static int calcClockHandsDegree(int hour, int min) {
		try {
			if (hour < 1 || hour > 12 || min < 0 || min > 59) {
				throw new IllegalArgumentException();
			}
			// get degrees of each hand
			int hourHandDegree = hour * 30 + (int) (min / 60f * 30);
			int minHandDegree = min * 6;

			// calculate angle
			int angle = Math.abs(hourHandDegree - minHandDegree);
			return angle <= 180 ? angle : 360 - angle; // acute angle
		} catch (IllegalArgumentException e) {
			System.err.println("Please enter a valid time.");
			return -1;
		}
	}
}
