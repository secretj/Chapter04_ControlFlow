package method;

public class ControlFlow {
//���� �ε� ���� �̸��� �ڷ����� �� �Ǿ��ִ°�
	public static void main(String[] args) {
		add(1,5);
		add(2,5);
		add(7.7,5.5);
		System.out.println(add(1,2));
		
	}
	public static int add(int i, int j) {
		
		return i+j;
	}
	
	private static void add(double d, double e) {                  								//private�޼ҵ�� ���� ��Ű���������� ����� �� �ִ�.
																								//public�޼ҵ�� ���� ��� ������
		System.out.println( d + e );															
		
	}
	
	
	// void�� ����ִٴ� �� ���� Ÿ���� ����������Ѵ�.
	
	
	
	
	
	
	
	
	
	
	
	
	
	//		Scanner scn=new Scanner(System.in);
//		
//		boolean run =true;
//		String menu;// = Integer.parseInt(scn.nextLine());
//		
//		//1. �� IN 
//		System.out.println("�ݰ��� �մԤ���");
//		//2. �޴� �����ֱ�
//		System.out.println("============");
//		System.out.println("    �޴�          ");
//		System.out.println("============");
//		System.out.println("1>�Ƹ޸�ī��|| 2>ī��Ḷ���߶� || 3>������");
//	   // System.out.println("�ֹ��Ͻ� �޴��� %s",menu);
//	    while(run) {
//	    	
//	    }

	}

