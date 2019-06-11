package com.biz.exec;

import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("국가명(영문)으로");
			String strNation = scan.nextLine();
			if (strNation.equalsIgnoreCase("KOREA")) {
				System.out.println("대한민국 이군요");
			}
			if (strNation.equalsIgnoreCase("usa")) {
				System.out.println("미쿡사람");
			}
			if (strNation.equalsIgnoreCase("china")) {
				System.out.println("짱깨 한그릇");

			} else if(strNation.equals("--END")) {
				System.out.println("응~ 꺼져~~");
				break;
			}
			else {
				System.out.println("알빠여?");
			}

		}

	}

}
