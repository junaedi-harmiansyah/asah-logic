package com.logic.java;

public class DeretFibonachi {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		System.out.print(a+" ");
		System.out.print(b+" ");

		for (int i = 1; i <= 10; i++)
		{
			int c = a + b;
			a = b; // bilangan pertama mengambil nilai bilangan kedua
			b = c; // bilangan kedua mengambil nilai bilangan yang dicari
			System.out.print(c+" ");
		}
	}

}
