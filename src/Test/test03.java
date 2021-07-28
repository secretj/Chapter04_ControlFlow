package Test;

public class test03 {

	public static void main(String[] args) {
		//while do~while
		//1~100출력하고 거꾸로 100~1출력
		int i=1;
		
		
		while(i<=100) {
				
				System.out.println(i++);
								
		}
		do {
			System.out.println(--i);
			
		}while(i>1);
		
	

	}

}
