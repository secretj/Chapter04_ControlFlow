package ch04_Exam;

public class Exam02 {
//1~100까지 3의 배수의 총합구하기
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
			System.out.println("3의 배수의 합:"+sum);
	}

}
