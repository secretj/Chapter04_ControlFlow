package ch04_1_If;

public class IfDIceExample {
	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("주사위 값이 1입니다.");
		}else if(num==2){
			System.out.println("주사위 값이 2입니다.");
		}else if(num==3){
			System.out.println("주사위 값이 3입니다.");
		}else if(num==4){
			System.out.println("주사위 값이 4입니다.");
		}else if(num==5){
			System.out.println("주사위 값이 5입니다.");
		}else {
			System.out.println("주사위 값이 6입니다.");
		}
}

}
