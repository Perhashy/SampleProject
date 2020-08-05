package jp.hashy.javastudy;

import java.util.Scanner;

public class BmiCalc2 {

	public static void main(String[] args) {
		double weight, height, bmi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("体重を入力してください(kg)：");
		weight = sc.nextDouble();
		System.out.println("身長を入力してください(cm)：");
		height = sc.nextDouble();
		
		height /= 100;
		bmi = weight / (height * height);
		
		System.out.println("あなたのBMIは：" + bmi + "です");
		
		if (bmi < 18.5) {
			System.out.println("痩せ型です");
		}else if (bmi < 25) {
			System.out.println("標準です");
		}else {
			System.out.println("肥満です");
		}

	}

}
