package cn.crxy.regex;

public class PatternDemo {

	public static void main(String[] args) {
		// Pattern:�������ı�����ʽ
		
		String str="h";
		
		//����ʹ��
		String regex="[^123]";
		boolean r = str.matches(regex);
		
		System.out.println(r);

	}

}
