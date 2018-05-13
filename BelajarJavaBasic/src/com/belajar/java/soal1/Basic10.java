package com.belajar.java.soal1;

public class Basic10 {

	public static void main(String[] args) {

		// panggil class basic1 kasih nama var = class itu sendiri
		Basic10 var = new Basic10();// instanse

		var.soal10(9);

	}

	private void soal10(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (((i <= j && i + j >= n - 1) && i>=n/2) || ((i >= j && i + j <= n - 1) && i<=n/2)) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
