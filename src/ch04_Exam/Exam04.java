package ch04_Exam;

public class Exam04 {

	public static void main(String[] args) {
		// 중첩 for를 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y)로 출력
		// x와 y는 10이하의 자연수

		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.printf("\n(%d, %d)",x,y);
				}
			}
		}
	}

}
