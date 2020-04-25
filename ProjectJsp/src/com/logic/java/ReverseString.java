package com.logic.java;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan kalimat yang akan di balik = ");
		String input = scan.nextLine();
		StringBuffer stringBuffer = new StringBuffer(input);
		System.out.println("Hasilnya adalah = || "+ stringBuffer.reverse()+" ||");
	}

}
