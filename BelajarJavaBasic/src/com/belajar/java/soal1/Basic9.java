package com.belajar.java.soal1;

public class Basic9 {

	public static void main(String[] args) {

		// panggil class basic1 kasih nama var = class itu sendiri
		Basic9 var = new Basic9();// instanse

		var.soal9(9);

	}

	private void soal9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i <= j && i + j >= n - 1) || (i >= j && i + j <= n - 1)) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}