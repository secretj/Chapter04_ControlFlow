package ch04_Exam;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
			 boolean run = true;
			 int balance = 0;
			
			 Scanner scn = new Scanner(System.in);
			 while (run) {
			 System.out.println("-------------------------------------");
			 System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			 System.out.println("-------------------------------------");
			 System.out.print("����> ");
			 int x =Integer.parseInt(scn.nextLine());
			 
			 
			 switch(x) {
			 case 1:
				 System.out.printf("���ݾ�>");
				 balance +=Integer.parseInt(scn.nextLine());
				 break;
			 
			 case 2:
				 System.out.print("��ݾ�>");
				 balance-=Integer.parseInt(scn.nextLine());
				 break;
			 case 3:
				 System.out.print("�ܰ�>");
				 System.out.println(balance);
				 break;
			 case 4:
				 run =false;
				 break;
				 
				 
			 }
				
			 }
			 System.out.println("\n���α׷� ����");
			

	}
			

}
