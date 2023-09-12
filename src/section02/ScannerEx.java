package section02;

import java.util.Scanner;

/*
 * Scanner 클래스 
 *  사용자로부터 데이터를 읽기 위해 사용되는 클래스
 *  Scanner 클래스르 사용하면 키보드로 입력한 텍스트나 숫자를 읽을 수 있다.
 *  
 * 
 * 
 */


// 노란색 변수 단 값을 가르키는 것도 값을 담고 있는것도 있다
//기본형 변수 주황색 실제로 값을 담는다.


public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name, address;   // 문자열 값을 담는 변수
		int age; 				//정수 값을 담는 변수
		double weight; 			//실수 값을 담는 변수
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		
		name = scanner.next();     		 // name = "주종훈"
		address = scanner.next(); 	 	 // address = "김포"
		age = scanner.nextInt();		 //age = "22"
		weight = scanner.nextDouble();	 // weight = 80
		
		/*
		 * Alt + Ctrl + 방향키 중복사 단축키
		 * Ctrl + D 줄 삭제 단축키
		 */
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 나이는 %d입니다.\n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n", weight);	// %.1 : 소수점 1번째 자리만 나오도록 해줌
		
	}
}
