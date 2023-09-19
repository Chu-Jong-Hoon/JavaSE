package section06;

/*
 * 
 * 
 */

public class Array03 {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 배열 생성 및ㅊ 값 대입하기
		String[] poketmons = {"피카츄", "라이츄", "파이리", "꼬부기", "버터플", "야도란"};
		
		for(int i = 0; i < poketmons.length; i++) {
			System.out.println(poketmons[i]);
			
		}
		System.out.println("=======================================================");
		
		
		//배열 값 수정하기
		poketmons[3] = "메타몽";
		
		// 확장for문 또는 향상된for문
		for(String poketmon : poketmons) {		
			//String poketmon = poketmons[0]
			//String poketmon = poketmons[1]
			//String poketmon = poketmons[2]
			//String poketmon = poketmons[3]
			//String poketmon = poketmons[4]
			//String poketmon = poketmons[5]
			System.out.println(poketmon);
			
		}
		
		
	}
}
