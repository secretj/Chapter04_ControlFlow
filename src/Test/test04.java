package Test;

public class test04 {

	public static void main(String[] args) {
		//  1000 ���� �ڿ��� �߿��� 2�� ������� 7�� ����� ���� ���
		// �� ���� ������ ���.
		int n =1;
		int sum=0;
		
		while(n<=1000) {
			
			
			if(n%2==0&&n%7==0) {
			System.out.println(n);
			sum+=n;
			}
			n++;
		}
		System.out.printf("\n����: %d",sum);

	}

}
