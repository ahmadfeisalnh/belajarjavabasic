package com.belajar.java.soal1;

public class Basic7 {

	public static void main(String[] args) {

		//panggil class basic1 kasih nama var = class itu sendiri
		Basic7 var = new Basic7();//instanse
		
		var.soal7(9);
		
	}
	
	private void soal7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j >= n-1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
