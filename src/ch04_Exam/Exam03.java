package ch04_Exam;

public class Exam03 {

	public static void main(String[] args) {
		// Math.random() 2개의 주사위를 던졌을때 나오는 눈을 (눈1,눈2)형태로 출력하고
		//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춘다.
	  while(true) {
		  int x = (int)(Math.random()*6)+1;
		  int y = (int)(Math.random()*6)+1;
		  
		  System.out.printf("\n(%d, %d)",x,y);
		  
		  int sum =x+y;
		  	if(sum==5) {
		  		break;
		  	}
		
		

	  }

	}
}