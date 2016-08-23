package cn.crxy.homework;

public class Test1 {

	public static void main(String[] args) {
		//1.编写固定电话号码正则: 格式:xxxx-xxxxxxxx.
		
		String str="0871-67441303";
		
		String reg ="0[0-9]{3}-[0-9]{8}";
		
		boolean m = str.matches(reg);
		
		System.out.println(m);

	}

}
