package cn.crxy.regex;

public class PatternDemo {

	public static void main(String[] args) {
		// Pattern:表达正则的编译形式
		
		String str="h";
		
		//正则使用
		String regex="[^123]";
		boolean r = str.matches(regex);
		
		System.out.println(r);

	}

}
