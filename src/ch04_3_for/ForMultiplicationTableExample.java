package ch04_3_for;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		int m =0;
		int i =0;
		for(m=1; m<=9; m++) {
			
			for(i=1; i<=9; i++) {
			System.out.printf( m +"x"+ i +"=" + (m*i)+"\t");	
			}
			System.out.println();
		}
			}
	}

// 구구단 for문

//옆으로 찍히게 만들어 오도록 행간의 간격은 \t