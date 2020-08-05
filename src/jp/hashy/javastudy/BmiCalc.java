package jp.hashy.javastudy;

public class BmiCalc {

	public static void main(String[] args) {
		double weight, height, bmi;
		weight = 55;
		height = 170;
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);

	}

}
