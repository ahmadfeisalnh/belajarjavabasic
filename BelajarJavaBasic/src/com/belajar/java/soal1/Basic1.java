package com.belajar.java.soal1;

public class Basic1 {

	public static void main(String[] args) {

		//panggil class basic1 kasih nama var = class itu sendiri
		Basic1 var = new Basic1();//instanse
		
		var.soal1(9);
		
	}
	
	private void soal1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
