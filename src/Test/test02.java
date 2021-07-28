package Test;

public class test02 {

	public static void main(String[] args) {

//			int n =24;
//			if(n >=0 && n < 10) {
//				System.out.println("0이상 10미만의 수");
//			}else if(n >= 10 && n < 20) {
//				System.out.println("10이상 20미만의 수");
//			}else if(n >= 20 && n < 30) {
//				System.out.println("20이상 30미만의 수");
//			}else {
//				System.out.println("음수 혹은 30이상의 수");
//				
//				
//				
//			}

		int n =(int)(Math.random()*100);
		int num =n/10;                             //범위하는 방법
		switch(num){
		
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의수");
			break;
		case 2:
			System.out.println("20이상 30미만의수");
			break;
		case 3:
			System.out.println("30이상 40미만의수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			
		}
		
		
		
			
			
		}
		
		
	}


