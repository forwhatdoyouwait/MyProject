package cn.crxy.homework;

public class Test2 {

	public static void main(String[] args) {
		//2.身份证号15-18位(数字、字母x结尾)正则编写.
		
		String str="12345619900101765X";
		
		String reg ="\\d{6}[12]\\d{10}([0-9]|X)";
		
		boolean m = str.matches(reg);
		
		System.out.println(m);

	}

}
