package com.logic.java;

public class PolaPersegiPositif {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0 || i == 10 - 1 || j == 0 || j == 10 - 1) {
					System.out.print("*");
				} else if (i == 10 / 2 || j == 10 / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
