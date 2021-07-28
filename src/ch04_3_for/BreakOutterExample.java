package ch04_3_for;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter:for(char up='A'; up<='Z'; up++) {
			for(char low='a'; low<='z'; low++) {
				System.out.println(up+"-"+low);
			    if(low=='g') {
			    	break Outter;
			    
			    }
			}
			
		}

	}

}
