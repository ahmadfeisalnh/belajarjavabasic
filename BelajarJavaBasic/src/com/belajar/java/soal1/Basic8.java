package com.belajar.java.soal1;

public class Basic8 {

	public static void main(String[] args) {

		// panggil class basic1 kasih nama var = class itu sendiri
		Basic8 var = new Basic8();// instanse

		var.soal8(9);

	}

	private void soal8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i <= j && i+j <= n-1) || (i+j >= n-1 && i>=j)) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}