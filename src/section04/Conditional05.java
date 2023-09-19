package section04;

public class Conditional05 {
	public static void main(String[] args) {
		/*
		 * 환불 상태코드
		 * 
		 * 
		 */
		String rtCd = "02";
		switch(rtCd) {
		case "01" : 
		case "02" :
		case "04":
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("황불상태코드: " + rtCd);
		}
		
	}
}
