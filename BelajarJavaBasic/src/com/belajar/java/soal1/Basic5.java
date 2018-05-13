package com.belajar.java.soal1;

public class Basic5 {
  public static void main(String[] args) {
	
	  Basic5 var = new Basic5();
	  var.soal5(13);
}
  private void soal5(int n) {
	  for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i+j==n-1 || i==j || j==0 || i==0 || j==n-1 || i==n-1) {
				System.out.print("*\t");
			}else {
				System.out.print("\t");
			}
		}
		System.out.println();
	}
  }
  
}
