package ch04_Exam;

public class Exam03 {

	public static void main(String[] args) {
		// Math.random() 2���� �ֻ����� �������� ������ ���� (��1,��2)���·� ����ϰ�
		//���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ �����.
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