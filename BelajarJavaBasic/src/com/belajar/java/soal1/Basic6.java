package com.belajar.java.soal1;

public class Basic6 {

	public static void main(String[] args) {

		//panggil class basic1 kasih nama var = class itu sendiri
		Basic6 var = new Basic6();//instanse
		
		var.soal6(9);
		
	}
	
	private void soal6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i >= j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
