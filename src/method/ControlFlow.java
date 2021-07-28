package method;

public class ControlFlow {
//오버 로딩 같은 이름에 자료형을 다 실어주는거
	public static void main(String[] args) {
		add(1,5);
		add(2,5);
		add(7.7,5.5);
		System.out.println(add(1,2));
		
	}
	public static int add(int i, int j) {
		
		return i+j;
	}
	
	private static void add(double d, double e) {                  								//private메소드는 동일 패키지내에서만 사용할 수 있다.
																								//public메소드는 어디든 사용 가능함
		System.out.println( d + e );															
		
	}
	
	
	// void는 비어있다는 뜻 변수 타입을 지정해줘야한다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	//		Scanner scn=new Scanner(System.in);
//		
//		boolean run =true;
//		String menu;// = Integer.parseInt(scn.nextLine());
//		
//		//1. 고객 IN 
//		System.out.println("반갑다 손님ㅋㅋ");
//		//2. 메뉴 보여주기
//		System.out.println("============");
//		System.out.println("    메뉴          ");
//		System.out.println("============");
//		System.out.println("1>아메리카노|| 2>카라멜마끼야또 || 3>율무차");
//	   // System.out.println("주문하신 메뉴는 %s",menu);
//	    while(run) {
//	    	
//	    }

	}

