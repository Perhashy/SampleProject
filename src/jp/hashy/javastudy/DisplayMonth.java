package jp.hashy.javastudy;

import java.util.Scanner;
public class DisplayMonth {

	public static void main(String[] args) {
		int month;
		String[] strMonth = {"January", "February" ,"March", "April"};
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください(1~12)");
		month = sc.nextInt();
		month -= 1;
		
		switch(month) {
		case 0:
			System.out.println(strMonth[month]);
			break;
		case 1:
			System.out.println(strMonth[month]);
			break;
		case 2:
			System.out.println(strMonth[month]);
			break;
		case 3:
			System.out.println(strMonth[month]);
			break;
		default:
			System.out.println("それ以降です");
		}
	}

}
