package com.simeong.code;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

	/**
	 * Separates a list of integers into two separate lists of integer, where
	 * the first half of the original list is the first list and the second half
	 * is the second list.
	 * 
	 * @param arr
	 *            The list of integers.
	 * @return A List object containing two lists of integer.
	 */
	private static List<List<Integer>> split(List<Integer> arr) {
		List<Integer> ar1 = new ArrayList<Integer>();
		List<Integer> ar2 = new ArrayList<Integer>();

		int n = arr.size();
		for (int i = 0; i < n / 2; i++) {
			ar1.add(arr.get(i));
		}
		for (int i = n / 2; i < n; i++) {
			ar2.add(arr.get(i));
		}

		List<List<Integer>> ans = new ArrayList<List<Integer>>(2);
		ans.add(ar1);
		ans.add(ar2);

		return ans;
	}

	/**
	 * Merges the two lists of integer, which are both sorted, into one, also
	 * sorted, list of integer.
	 * 
	 * @param sorted1 The first sorted list of integer.
	 * @param sorted2 The second sorted list of integer.
	 * @return The combined, sorted list of integer.
	 */
	private static List<Integer> merge(List<Integer> sorted1,
			List<Integer> sorted2) {
		List<Integer> sorted = new ArrayList<Integer>();

		while (sorted1.size() > 0 || sorted2.size() > 0) {
			if (sorted1.size() > 0 && sorted2.size() > 0) {
				if (sorted1.get(0) < sorted2.get(0)) {
					sorted.add(sorted1.get(0));
					sorted1.remove(0);
				} else {
					sorted.add(sorted2.get(0));
					sorted2.remove(0);
				}
			} else if (sorted1.size() > 0) {
				sorted.add(sorted1.get(0));
				sorted1.remove(0);
			} else if (sorted2.size() > 0) {
				sorted.add(sorted2.get(0));
				sorted2.remove(0);
			}
		}

		return sorted;
	}

	/**
	 * Uses the merge sort algorithm to sort the array of integers.
	 * 
	 * @param arr
	 *            The array of integers.
	 * @return The sorted array of integers.
	 */
	public static List<Integer> mSort(List<Integer> arr) {
		if (arr.size() > 1) {
			List<List<Integer>> ars = split(arr);
			List<Integer> sorted1 = mSort(ars.get(0));
			List<Integer> sorted2 = mSort(ars.get(1));
			List<Integer> sorted = merge(sorted1, sorted2);
			return sorted;
		}
		return arr;
	}

}