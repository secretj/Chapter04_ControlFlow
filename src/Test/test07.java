package Test;

public class test07 {

	public static void main(String[] args) {
		// �� ���� '���� ����'�� ����Ͽ� ����ϴ� �޼ҵ� 
		abs(-9,5);
	

	}

	private static void abs(int x, int y) {
		int z =x-y;
		if(z<0) {
			z=-z;
			
		}
		System.out.printf("���� ���� :%d",z);
		
	}

}
