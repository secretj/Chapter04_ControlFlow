package Test;

public class test02 {

	public static void main(String[] args) {

//			int n =24;
//			if(n >=0 && n < 10) {
//				System.out.println("0�̻� 10�̸��� ��");
//			}else if(n >= 10 && n < 20) {
//				System.out.println("10�̻� 20�̸��� ��");
//			}else if(n >= 20 && n < 30) {
//				System.out.println("20�̻� 30�̸��� ��");
//			}else {
//				System.out.println("���� Ȥ�� 30�̻��� ��");
//				
//				
//				
//			}

		int n =(int)(Math.random()*100);
		int num =n/10;                             //�����ϴ� ���
		switch(num){
		
		case 0:
			System.out.println("0�̻� 10�̸��� ��");
			break;
		case 1:
			System.out.println("10�̻� 20�̸��Ǽ�");
			break;
		case 2:
			System.out.println("20�̻� 30�̸��Ǽ�");
			break;
		case 3:
			System.out.println("30�̻� 40�̸��Ǽ�");
			break;
		default:
			System.out.println("���� Ȥ�� 30�̻��� ��");
			
		}
		
		
		
			
			
		}
		
		
	}


