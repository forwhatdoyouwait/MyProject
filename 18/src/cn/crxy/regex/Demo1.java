package cn.crxy.regex;

public class Demo1 {

	public static void main(String[] args) {
		// ��д���ʽ	ȥ��ƥ���Ӧ���ַ���
		String str="ndjksndksgn";
		
		//ʹ��������ʽȥƥ���ַ�����matchers(regex)
		boolean m = str.matches("");
		
		System.out.println(m);
	}

}
