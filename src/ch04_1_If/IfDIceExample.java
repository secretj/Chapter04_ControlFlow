package ch04_1_If;

public class IfDIceExample {
	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("�ֻ��� ���� 1�Դϴ�.");
		}else if(num==2){
			System.out.println("�ֻ��� ���� 2�Դϴ�.");
		}else if(num==3){
			System.out.println("�ֻ��� ���� 3�Դϴ�.");
		}else if(num==4){
			System.out.println("�ֻ��� ���� 4�Դϴ�.");
		}else if(num==5){
			System.out.println("�ֻ��� ���� 5�Դϴ�.");
		}else {
			System.out.println("�ֻ��� ���� 6�Դϴ�.");
		}
}

}
