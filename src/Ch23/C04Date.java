package Ch23;

import java.util.Calendar;
import java.util.Date;

//### Date Class ###
//JAVA에서 날짜와 시간을 나타내기 위한 클래스임.
//JAVA 8부터는 새로운 날짜 및 시간 API인 "java.time" 패키지의 LocalDate, LocalTime, LocalDateTime 등으로 대체됨.

//### Calendar Class ###
//날짜와 시간을 다루기 위한 추상 클래스
//날짜 계산 및 조작을 위해서 자바에서 제공되는 클래스
//JAVA 8부터는 "java.time" 패키지의 날짜 및 시간 API로 대체됨.

//==> 하지만 Date 클래스는 여전히 많이 사용되고 있음.
public class C04Date {
	
	public static void main(String[] args) {
		
		Date d1 = new Date();			// 현재 날자와 시간으로 Date 객체를 생성
		System.out.println(d1);
		
		System.out.println(d1.getYear() + 1900 + "년");		// 현재 연도에서 1900을 뺀 값을 반환
		System.out.println(d1.getMonth() + 1 + "월");  // 0에서 11까지의 값을 반환 0이 1월
												// 현재는 1월이니깐 0의 값을 반환, 그래서 + 1 을 붙여주는 것.
												// 따라서 0 + 1 ==> 1월 이렇게 나옴.
		System.out.println(d1.getDay());		// 0 : 일요일
												// 1 : 월요일
												// 2 : 화요일
												// 3 : 수요일
												// 4 : 목요일
												// 5 : 금요일
												// 6 : 토요일
		System.out.println(d1.getHours() + "시");		// 15 == 3시
		System.out.println(d1.getMinutes()+ "분"); 	// 55 == 55분
		System.out.println(d1.getSeconds() + "초");	// 37 == 37초
		System.out.println();
		
		
		Calendar cal = Calendar.getInstance();		// 보통 사용. 한번만 날짜정보를 받을 때는 위 Date를 사용
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		
	}

}
