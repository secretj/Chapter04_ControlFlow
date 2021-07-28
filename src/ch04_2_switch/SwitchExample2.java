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
			System.out.println("우수 회원입니다.");
			break;
		case "B":
		case "b":
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			
			
		}

	}


}