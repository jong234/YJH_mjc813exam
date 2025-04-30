package com.mjc.mjc813.cal;

public class MyCalculator {

	int MyAdd(int a, int b) {
		int result = a + b;
		System.out.println("두 수(" + a + ","+ b +")의 값은 " + result + "입니다.");
		return 0;
		
	}
	
	long MyAdd(long a, long b) {
		long result = a + b;
		System.out.println("두 수(" + a + ","+ b +")의 값은 " + result + "입니다.");		
		return 0;
	}
	public static void main(String[] args) {
		MyCalculator mCal = new MyCalculator();
		mCal.MyAdd(10,30);

		mCal.MyAdd(123456789012345L,98765432198765L);
		
		
	}

}

//int myAdd(int a, int b) 라는 멤버메소드를 만든다.
//long myAdd(long a, long b) 라는 멤버메소드를 만든다.
//main 정적메소드에서 MyCalculator 를 인스턴스 객체로 생성한다. 이름은 예:mCal
//mCal 객체의 myAdd(10, 30)멤버메소드를 실행하여 40 결과를 화면에 출력한다.
//mCal 객체의 myAdd(123456789012345L, 98765432198765L)멤버메소드를 실행하여 결과를 화면에 출력한다.
//화면에 출력할때는 "두 수(a, b)의 값은 n 입니다." 출력하자. a, b, n 은 각 값을 출력