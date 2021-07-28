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
			System.out.print("전화번호 뒷 자리 : ");
			scn.nextLine();
			break;
		case 2:
			System.out.print("입금 : ");
			y +=Integer.parseInt(scn.nextLine());
			break;
		case 3:
			System.out.print("출금 : ");
			y -=Integer.parseInt(scn.nextLine());
			break;
		case 4:
			System.out.print("종료");
			run =false;
			break;
			
		
		
		}
		}
		
		

	}
	
	
	
	
	
	public static void showDisPlay() {
		System.out.println("=========메뉴========");
		System.out.println();
		System.out.print("1.계좌등록 2.입금 3.출금 4. 종료\n");
		System.out.println();

		
	}

}
