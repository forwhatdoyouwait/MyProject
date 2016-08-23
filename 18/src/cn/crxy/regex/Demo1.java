package cn.crxy.regex;

public class Demo1 {

	public static void main(String[] args) {
		// 编写表达式	去找匹配对应的字符串
		String str="ndjksndksgn";
		
		//使用正则表达式去匹配字符串：matchers(regex)
		boolean m = str.matches("");
		
		System.out.println(m);
	}

}
