package com.logic.java;

public class PolaTangga {
	
	public static void main(String[] args) {
		
		//loop pertama untuk membuat algorima kebawah di tandai dg System.out.println
		for (int i = 0; i < 10; i++) {
			System.out.println();
			
			//loop ke dua untuk membuat algorima ke samping di tandai dg System.out.print
			for (int j = 0; j < 10; j++) {
				if (i >= j) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
				
			}
			
		}
	}

}
