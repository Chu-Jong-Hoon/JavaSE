package section05;

/*
 * 반복문
 *  특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 *  
 * 1. while 문
 * 	while(조건식) {
 * 		반복 수행할 코드	
 * }
 * 
 * break 문
 * 	반복문에서 break명령어는 해당 반복문 즉시 종료하는 명령어
 * 
 * continue 문
 * 	반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 명령어
 * 
 */

public class Loop01 {
	public static void main(String[] args) {
		// while 문을 이용하여 0~99 까지 출력
		// 무한루프처럼 계속해야 될떄 while문을 많이 쓴다.반대로 for문은 한정적인것을 돌릴때 많이 씀
	
		// <예제 1>
		/*	int count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
		}
		System.out.println();
		// 똑같음 ~ 하지만 성격이 다르다 while  문과
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		*/
		
		// <예제 2>
		// is뭐뭐뭐 하면 논리형이 많이 붙는다
		/*
		int count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			count++;
			if(count == 100)
				isRun = false;
		}
		*/
		//<예제 3>
		/*
		int count = 0;
		while(true) {
			System.out.println(count);
			count++;
			if(count == 100)
				break;
		}
		*/
		
		int i = 0;
		while(i < 100) {
			i++;
			
			if(i % 3 == 0)
				continue;
			
			System.out.println(i);
			
		}
		
		
		
		
		
	}
	
	
}
