package ch04_2_switch;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String grade ="";
		grade = scn.nextLine();
	
		
		
		
			
		
		switch(grade) {
		case "A":
		case "a":
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case "B":
		case "b":
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
			
			
		}

	}


}