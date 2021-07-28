package ch04_1_If;

public class exam00 {

	public static void main(String[] args) {
		// char grade =(score>90)?'A' : ((score>80)? 'B' :'C')
		
		int score =85;
		char grade;
		if(score>90) {
			grade= 'A';
		}else if(score>80) {
			grade='B';
			
		}else{
			grade='C';
		}
		System.out.println("당신의 등급은:"+grade);
	}

}
