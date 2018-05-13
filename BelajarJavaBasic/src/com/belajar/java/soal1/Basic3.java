package com.belajar.java.soal1;

public class Basic3 {
  public static void main(String[] args) {
	
	  Basic3 var = new Basic3();
	  var.soal3(9);
}
  private void soal3(int n) {
	  for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i+j==n-1 || i==j) {
				System.out.print("*\t");
			}else {
				System.out.print("\t");
			}
		}
		System.out.println();
	}
  }
  
}
