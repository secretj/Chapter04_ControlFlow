package Test;

public class test07 {

	public static void main(String[] args) {
		// 두 수의 '차의 절댓값'을 계산하여 출력하는 메소드 
		abs(-9,5);
	

	}

	private static void abs(int x, int y) {
		int z =x-y;
		if(z<0) {
			z=-z;
			
		}
		System.out.printf("차의 절댓값 :%d",z);
		
	}

}
