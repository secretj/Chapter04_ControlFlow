package method;

import java.util.Scanner;

class ControlFlowExam {

	public static void main(String[] args) {
		int y =0;
		boolean run = true;
		while(run) {
		showDisPlay();
		Scanner scn = new Scanner(System.in);
		int x = Integer.parseInt(scn.nextLine());
		
		switch(x) {
		case 1:
			System.out.print("��ȭ��ȣ �� �ڸ� : ");
			scn.nextLine();
			break;
		case 2:
			System.out.print("�Ա� : ");
			y +=Integer.parseInt(scn.nextLine());
			break;
		case 3:
			System.out.print("��� : ");
			y -=Integer.parseInt(scn.nextLine());
			break;
		case 4:
			System.out.print("����");
			run =false;
			break;
			
		
		
		}
		}
		
		

	}
	
	
	
	
	
	public static void showDisPlay() {
		System.out.println("=========�޴�========");
		System.out.println();
		System.out.print("1.���µ�� 2.�Ա� 3.��� 4. ����\n");
		System.out.println();

		
	}

}
