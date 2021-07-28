package Test;

public class test04 {

	public static void main(String[] args) {
		//  1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력
		// 그 수의 총합을 출력.
		int n =1;
		int sum=0;
		
		while(n<=1000) {
			
			
			if(n%2==0&&n%7==0) {
			System.out.println(n);
			sum+=n;
			}
			n++;
		}
		System.out.printf("\n총합: %d",sum);

	}

}
