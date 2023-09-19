package section05;

/*
 * 구구단 1단 ~ 9단 출력
 * 
 */

public class LoopHomeWork02 {
	public static void main(String[] args) {
		// 하나씩 풀어가기
		
		for(int k = 0; k < 3; k++) {
			System.out.println("k =" + k);
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 3; j++) {
					int dan = j + 2 + (k * 3);
					int num = i + 1;
					//if(dan > 9) break;
					if(dan < 10) {
					//System.out.print(dan + "x" + num + "=" + dan * num + "\t");
					System.out.printf("%dx%d=%d\t", dan, num, dan * num);	
				}
				}
				System.out.println();   // 개행
			}
			System.out.println();
		
	}
}
}
