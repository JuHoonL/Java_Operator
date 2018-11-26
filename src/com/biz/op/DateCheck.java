package com.biz.op;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 날짜값을 키보드나 외부 장치로부터 읽었을때 날짜가 유효한지 확인할 필요가 있을 때 사용 가능 한 코드
		
		// 키보드 입력을 받으면 날짜형식을 문자열로 입력이 된다. 이  때 이 문자열을 날짜 형식에 맞는지 검사
		
		String date1 = "1991/01/01";
		String date2 = "1991/02/29";
		String date3 = "2018/11/31";
		
		SimpleDateFormat dateCheck = new SimpleDateFormat("yyyy/MM/dd");
		
		dateCheck.setLenient(false);
		
		// SimpleDateFormat의 parse() 메서드는 문자열의 날짜값이 유효하지않으면 예외를 발생시키도록 구조적으로 만들어져있다.
		// 이 예외 발생 구조를 역으로 활용해서 만약 문자열 형식의 날짜가 유효하지 않으면 try~ catch를 활용해서 유효하지 않음을 사용자(입력자)에게 알려줄 수 있다.
		try {
//			Date dateOk = dateCheck.parse(date3);
			dateCheck.parse(date1);
			System.out.println(date1);
			
			dateCheck.parse(date2);
			System.out.println(date2);
			
			dateCheck.parse(date3);
			System.out.println(date3);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("예외발생");
		}
	}

}
