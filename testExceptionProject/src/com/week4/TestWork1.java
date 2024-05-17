package com.week4;

import java.util.Calendar;

public class TestWork1 {

	public static void main(String[] args) {
//		Calendar 클래스 사용
//		오늘 날짜에 대한 객체 생성
//		년, 월, 일, 시, 분, 초 값을 각각 변수에 분리 저장한 후
//		"2011년 3월 21일 월요일" 로 출력해 보시오.
		
		
//		Calendar 클래스 사용
		Calendar today = Calendar.getInstance();
		
		System.out.println(today);
//		java.util.GregorianCalendar[time=1706179224446,
//		areFieldsSet=true,areAllFieldsSet=true,lenient=true,
//		zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,
//		dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,
//		minimalDaysInFirstWeek=1,ERA=1,
//		YEAR=2024,
//		MONTH=0,
//		WEEK_OF_YEAR=4,
//		WEEK_OF_MONTH=4,
//		DAY_OF_MONTH=25,
//		DAY_OF_YEAR=25,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,
//		AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=40,SECOND=24,
//		MILLISECOND=446,ZONE_OFFSET=32400000,DST_OFFSET=0]

		
		
		//		오늘 날짜에 대한 객체 생성
		//today.set(Claendar.YEAR, 2024);
		
//		년, 월, 일, 시, 분, 초 값을 각각 변수에 분리 저장한 후
		int year = today.get(Calendar.YEAR); //년도 현재 2024년 출력
		int month = today.get(Calendar.MONTH)+1; //월 1월인데 calendar는 0부터 시작이므로 마지막에 +1을 해줘야 1월로 출력
		int day = today.get(Calendar.DATE); // 날짜 출력 오늘날짜 기준 25일
		int time = today.get(Calendar.AM_PM); // 현재 시간 출력
		int	min = today.get(Calendar.MINUTE); // 분 출력
		int second = today.get(Calendar.SECOND); //현재 초 
		int weekDay = today.get(Calendar.DAY_OF_WEEK); // 요일 출력
		
		String weekStr = null;
		switch(weekDay) {
		case 1: weekStr = "일"; break;
		case 2: weekStr = "월"; break;
		case 3: weekStr = "화"; break;
		case 4: weekStr = "수"; break;
		case 5: weekStr = "목"; break;
		case 6: weekStr = "금"; break;
		case 7: weekStr = "토"; break;

		}
		
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + weekStr + "요일" );
		
		
		
		
		
		
//		"2011년 3월 21일 월요일" 로 출력해 보시오.
		
		
		

	}

}




























