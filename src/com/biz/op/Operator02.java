package com.biz.op;

public class Operator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean boolA = (30 == 40) && ( 40 == 50);			// && : And(*와 같음), 둘다 참일떄 참
		boolean boolB = (30 <= 40) || ( 40 >= 50);			// || : Or(+와 같음), 둘 중 하나만 참이면 참
		
		boolean boolC = (30 < 40) || (40 >=50) && (50 > 60);// &&는 *이므로 먼저 연산 후 || 연산	
		System.out.println(boolC); 							// true 출력
	}

}
