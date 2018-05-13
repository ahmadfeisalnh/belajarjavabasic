package com.belajar.java.soal1;

public class Basic2 {
  public static void main(String[] args) {
	
	  Basic2 var = new Basic2();
	  var.soal2(9);
}
  private void soal2(int n) {
	  for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i+j==n-1) {
				System.out.print("*\t");
			}else {
				System.out.print("\t");
			}
		}
		System.out.println();
	}
  }
  
}
