package section02;

/*
 * 4. 실수형
 * 	실수를 저장할 수 있는 자료형
 * 
 * 	float	(4byte) : 부동소수점 형식으로 소수점 7자리 표현
 * 	double	(8byte) : 부동소수점 형식으로 소수점 15자리 표현
 * 
 * 
 */

public class Variable04 {
	public static void main(String[] args) {
		//d는 생략가능하다 명시적으로 써줘도 된다.
		double marathon = 41.195d;
		
		// 숫자 뒤에 f를 붙여주어야 한다.
		float halfMarathon = 21.0975f;
		
		System.out.println("마라톤은 " + marathon + "km를 달립니다.");
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다.");
	}
}
