package com.belajar.java.soal1;

public class Basic4 {
  public static void main(String[] args) {
	
	  Basic4 var = new Basic4();
	  var.soal4(15);
}
  private void soal4(int n) {
	  for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i+j==n-1 || i==j || j==n/2 || i==n/2) {
				System.out.print("*\t");
			}else {
				System.out.print("\t");
			}
		}
		System.out.println();
	}
  }
  
}
