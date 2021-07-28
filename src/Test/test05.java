package Test;

public class test05 {

	public static void main(String[] args) {
		// 자연수 1부터 시작.. 모든 홀수를 더해 .. 그 합이 언제(몇을 더했을때) 1000을 넘는지
		// 1000을 넘어선 값은 얼마 인지. 출력하는 프로그램
		
		int n=0;
		int sum=0;
		
		while(sum<1000) {
			n++;
			if(n%2==0) {
				continue;
			}
			sum+=n;
		}
		System.out.println(n);
		System.out.println(sum);
		
		
	}

}

// 왜 1은 포함이 안되지
