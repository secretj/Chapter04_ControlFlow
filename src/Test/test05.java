package Test;

public class test05 {

	public static void main(String[] args) {
		// �ڿ��� 1���� ����.. ��� Ȧ���� ���� .. �� ���� ����(���� ��������) 1000�� �Ѵ���
		// 1000�� �Ѿ ���� �� ����. ����ϴ� ���α׷�
		
		int n=0;
		int sum=0;
		
		while(sum<1000) {
			n++;
			if(n%2==0) {
				continue;
			}
			sum+=n;
		}
		System.out.println(n);
		System.out.println(sum);
		
		
	}

}

// �� 1�� ������ �ȵ���
