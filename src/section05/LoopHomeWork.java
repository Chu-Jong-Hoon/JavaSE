package section05;
/*
 * 
 * 
 * 
 * 
 */
public class LoopHomeWork {
	public static void main(String[] args) {

		//2번 문제
		/*for(int i = 0; i < 4; i++) {
			// i : 0  j : 0    print: *
			for(int j =3; j >= 0; j--) {
				if(i < j ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
		
			}
			System.out.println();
		}
	*/	

		//3번
		for(int i = 0; i < 4; i++) {
			// i : 0  j : 0    print: *
			for(int j =3; j >= 0; j--) {
				if(i < j  ) {
					 System.out.print(" ");
				} else {
					System.out.print("*");
				}
		
			}
			System.out.println();
		}
	}
}

/*
 * 4번
 *  <조건 1> 
 * 			i		j
 *    *		0		0 1 2    i+j < 3	
 *   ***	1		0 1		 i+j < 3	
 *  *****	2		0		 i+j < 3
 * *******  3				 i+j < 3
 *  *****
 *   ***
 *    *
 *  <조건 2>
 *   * 			i		j
 *    *		0		4 5 6   j-i > 3	
 *   ***	1		5 6	    j-i > 3		
 *  *****	2		6		j-i > 3	
 * *******  3				j-i > 3	
 *  *****	4		0		i-j > 3
 *   ***	5		0 1		i-j > 3
 *    *		6		0 1 2	i-j > 3
 *  
 *  
 * 	for(int i = 0; i < 7; i++) {
 * 		
 * 		for(int j = 0; j< 7; j++) {
 * 			if(i < 4) {
 * 			if(i + j < 3) {
 * 				System.out.print(" "); 
 * 			} else if(j-i > 3){
 * 				System.out.print(" "); 
 * 			}else{
 * 			System.out.print("*"); 
 * 		}
 * 		} else{
 * 			if(i - j > 3) {
 * 				syso " " ; 
 * 			} else if (i + j > 9) {
 * 				syso " " ;
 * 	}	else {
 * 			System.out.print("*"); 
 * 		}
 * }
 * 	}
 * 		System.out.println();  // 개행
 * }
 * }
 * 
 */



